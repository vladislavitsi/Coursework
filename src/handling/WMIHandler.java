package handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class WMIHandler {

    private static final String CRLF = "\r\n";

    public static String getWMIValue(String path){
        String output = "";
        try {
            output = execute(new String[] {"cmd.exe", "/C", "cscript.exe", "wmi\\"+path});
        }catch (Exception e){
            e.printStackTrace();
        }
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
}
