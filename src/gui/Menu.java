package gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

class Menu extends JMenuBar {

    JMenu fileMenu;
    JMenu actionMenu;
    JMenu aboutMenu;

    Menu(){
        setBackground(Color.WHITE);
        setBorder(new MatteBorder(0,0,1,0,Color.LIGHT_GRAY));

        fileMenu = new JMenu("Файл");
        fileMenu.setFont(new Font("dd",Font.TRUETYPE_FONT,12));
        aboutMenu = new JMenu("Помощь");
        aboutMenu.setFont(new Font("dd",Font.TRUETYPE_FONT,12));
        actionMenu = new JMenu("Действия");
        actionMenu.setFont(new Font("dd",Font.TRUETYPE_FONT,12));

        add(fileMenu);
        add(actionMenu);
        add(aboutMenu);
    }
}
