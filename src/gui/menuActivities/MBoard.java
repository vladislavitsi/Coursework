package gui.menuActivities;

import handling.WMIHandler;

import javax.swing.*;
import java.awt.*;


public class MBoard extends Activity {
    public MBoard(){
        new Thread(()->{
            System.out.println(WMIHandler.getWMIValue("mboard.vbs"));
        }).start();
    }
}
