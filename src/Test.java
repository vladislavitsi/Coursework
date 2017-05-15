
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.swing.*;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Test {


    private static void printUsage() {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.getName().startsWith("get")
                    && Modifier.isPublic(method.getModifiers())) {
                Object value;
                try {
                    value = method.invoke(operatingSystemMXBean);
                } catch (Exception e) {
                    value = e;
                } // try
                System.out.println(method.getName() + " = " + value);
            } // if
        } // for
    }

    private static void getAndPrintCpuLoad(OperatingSystemMXBean mxBean) {
        // need to use reflection as the impl class is not visible
        for (Method method : mxBean.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            String methodName = method.getName();
            if (methodName.startsWith("get") && methodName.contains("Cpu") && methodName.contains("Load")
                    && Modifier.isPublic(method.getModifiers())) {

                Object value;
                try {
                    value = method.invoke(mxBean);
                } catch (Exception e) {
                    value = e;
                }
                System.out.println(methodName + " = " + value);
            }
        }
        System.out.println("");
    }

    public static double getProcessCpuLoad() throws Exception {

        MBeanServer mbs    = ManagementFactory.getPlatformMBeanServer();
        ObjectName name    = ObjectName.getInstance("java.lang:type=OperatingSystem");
        AttributeList list = mbs.getAttributes(name, new String[]{ "ProcessCpuLoad" });

        if (list.isEmpty())     return Double.NaN;

        Attribute att = (Attribute)list.get(0);
        Double value  = (Double)att.getValue();

        // usually takes a couple of seconds before we get real values
        if (value == -1.0)      return Double.NaN;
        // returns a percentage value with 1 decimal point precision
        return ((int)(value * 1000) / 10.0);
    }

    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200,200,500,500);
        JLabel Cpuusage = new JLabel();
        JLabel freMem = new JLabel();
        JLabel cpuTime = new JLabel();
        frame.add(Cpuusage);
        frame.add(freMem);
        frame.add(cpuTime);
        Cpuusage.setBounds(20,10,400,30);
        cpuTime.setBounds(20,100,400,30);
        freMem.setBounds(20,200,400,30);
        com.sun.management.OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        frame.setVisible(true);
//        new Thread(()->{
        while (true){

                Cpuusage.setText("CPU использование: " + (int)(operatingSystemMXBean.getSystemCpuLoad()*100)+" %");
                freMem.setText("Всего памяти: " + (double)operatingSystemMXBean.getTotalPhysicalMemorySize()/1024/1024/1024+" Gb");
                cpuTime.setText("CPU time: " + operatingSystemMXBean.getProcessCpuTime());
                try{

                    Thread.sleep(1000);
                }catch (InterruptedException ignored){}
            }
//        });
    }
}
