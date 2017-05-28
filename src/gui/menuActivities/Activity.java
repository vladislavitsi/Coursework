package gui.menuActivities;

import javax.swing.*;
import java.awt.*;

public abstract class Activity extends JPanel{
    public static Font fontBig = new Font("fontBig",Font.TRUETYPE_FONT,20);
    public static Font fontSmall = new Font("fontBig",Font.TRUETYPE_FONT,16);
    Activity(){
        setLayout(null);
        setBackground(Color.WHITE);
    }
}
