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
                    data+="Apps";
                    data+= WMIHandler.getWMIValue("app.vbs");
                    data+="BIOS";
                    data+= WMIHandler.getWMIValue("bios.vbs");
                    try ( FileWriter fw = new FileWriter(fc.getSelectedFile()) ) {
                        fw.write(data);
                    }catch ( IOException e ) {
                        e.printStackTrace();
                    }
                }).start();
        }
    }
}
