import java.awt.*;
import java.io.*;

public class Try {

    private static final String CRLF = "\r\n";

    public void test() {
        try {
            System.out.println(getWMIValue());
        }catch (Exception ignored){};
    }

    public static String getWMIValue() throws Exception {
        String tmpDirName = getEnvVar("TEMP").trim();
        String output = execute(new String[] {"cmd.exe", "/C", "cscript.exe", "src\\test.vbs"});
        return output.trim();
    }

    private static String getEnvVar(String envVarName) throws Exception
    {
        String varName = "%"+envVarName+"%";
        String envVarValue = execute(new String[] {"cmd.exe", "/C", "echo "+varName});
        if(envVarValue.equals(varName))
        {
            throw new Exception("Environment variable '"+envVarName+"' does not exist!");
        }
        return envVarValue;
    }

    private static String execute(String[] cmdArray) throws Exception
    {
        Process process = Runtime.getRuntime().exec(cmdArray);
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String output = "";
        String line = "";
        while((line = input.readLine()) != null)
        {
            //need to filter out lines that don't contain our desired output
            if(!line.contains("Microsoft") && !line.equals(""))
            {
                output += line +CRLF;
            }
        }
        process.destroy();
        process = null;
        return output.trim();
    }
    public static void main(String[] args) throws IOException{
        new Try().test();
//        Desktop.getDesktop().open(new File("C:\\Users\\vladi\\Downloads\\OperaSetup.exe"));
    }
}