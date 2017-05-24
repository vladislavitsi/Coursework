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

    private static String getVBScript(String wmiQueryStr, String wmiCommaSeparatedFieldName)
    {
        String vbs = "Dim oWMI : Set oWMI = GetObject(\"winmgmts:\")"+CRLF;
        vbs += "Dim classComponent : Set classComponent = oWMI.ExecQuery(\""+wmiQueryStr+"\")"+CRLF;
        vbs += "Dim obj, strData"+CRLF;
        vbs += "For Each obj in classComponent"+CRLF;
        String[] wmiFieldNameArray = wmiCommaSeparatedFieldName.split(",");
        for(int i = 0; i < wmiFieldNameArray.length; i++)
        {
            vbs += "  strData = strData & obj."+wmiFieldNameArray[i]+" & VBCrLf"+CRLF;
        }
        vbs += "Next"+CRLF;
        vbs += "wscript.echo strData"+CRLF;
        return vbs;
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

    private static void writeStrToFile(String filename, String data) throws Exception
    {
        FileWriter output = new FileWriter(filename);
        output.write(data);
        output.flush();
        output.close();
        output = null;
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