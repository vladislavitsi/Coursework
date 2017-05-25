package gui.menuActivities;

import javax.swing.*;
import java.awt.*;

public abstract class Activity extends JPanel{
    static Font fontBig = new Font("fontBig",Font.TRUETYPE_FONT,20);
    static Font fontSmall = new Font("fontBig",Font.TRUETYPE_FONT,16);
    Activity(){
        setLayout(null);
//        setBackground(new Color(250,250,250));
        setBackground(Color.WHITE);
    }
}
