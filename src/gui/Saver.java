package gui;

import handling.WMIHandler;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    Saver(){
        JFileChooser fc = new JFileChooser();
        if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
                new Thread(()->{
                    String data = "";
                    data+="\n\n=============================================\n";
                    data+="\nCPU\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//scpu.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nBIOS\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//sbios.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nHDD Part\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//shddpart.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nHDD\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//shdd.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nMotherboard\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//smboard.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nGPU\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//sgpu.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nMonitor\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//smonitor.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nNetwork adapters\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//snet.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nActive apps\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//sapp.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nSystem time\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//ssystime.vbs");
                    data+="\n\n=============================================\n";
                    data+="\nUser time\n";
                    data+="\n=============================================\n";
                    data+= WMIHandler.getWMIValue("swmi//suserstime.vbs");
                    try ( FileWriter fw = new FileWriter(fc.getSelectedFile()) ) {
                        fw.write(data);
                    }catch ( IOException e ) {
                        e.printStackTrace();
                    }
                }).start();
        }
    }
}
