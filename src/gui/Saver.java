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
                    data+="\nHDD Part\n";
                    data+= WMIHandler.getWMIValue("swmi//shddpart.vbs");
                    data+="\nMotherBoard\n";
                    data+= WMIHandler.getWMIValue("swmi//smboard.vbs");
                    data+="\nMonitor\n";
                    data+= WMIHandler.getWMIValue("swmi//smonitor.vbs");
                    data+="\nNetwork adapters\n";
                    data+= WMIHandler.getWMIValue("swmi//snet.vbs");
                    data+="\nSystem time\n";
                    data+= WMIHandler.getWMIValue("swmi//ssystime.vbs");
                    data+="\nUser time\n";
                    data+= WMIHandler.getWMIValue("swmi//suserstime.vbs");
//                    data+="BIOS";
//                    data+= WMIHandler.getWMIValue("bios.vbs");
                    try ( FileWriter fw = new FileWriter(fc.getSelectedFile()) ) {
                        fw.write(data);
                    }catch ( IOException e ) {
                        e.printStackTrace();
                    }
                }).start();
        }
    }
}
