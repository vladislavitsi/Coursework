package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private Menu menu;
    private SideMenu sideMenu;

    public MainFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAS Information");
        setBounds((Toolkit.getDefaultToolkit().getScreenSize().width/2)-450,(Toolkit.getDefaultToolkit().getScreenSize().height/2)-335,1000, 670);
        setIconImage(Toolkit.getDefaultToolkit().getImage("res\\icon_black.png"));
        setLayout(null);
        setResizable(false);
        addComponents();
        setVisible(true);
    }

    private void addComponents(){
        menu = new Menu();
        setJMenuBar(menu);

        sideMenu = new SideMenu();
        add(sideMenu);
        sideMenu.setBounds(0,0,250,613);

        add(InformPanel.getInformPanel());
        InformPanel.getInformPanel().setBounds(250,0,745,613);
    }
}
