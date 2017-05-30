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

    private static String execute(String[] cmdArray) throws Exception {
        Process process = Runtime.getRuntime().exec(cmdArray);
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream(),"cp866"));
        String output = "";
        String line;
        input.readLine();
        input.readLine();
        while((line = input.readLine()) != null) {
            if(!line.equals("")) {
                output += line +CRLF;
            }
        }
        process.destroy();
        return output.trim();
    }
}
