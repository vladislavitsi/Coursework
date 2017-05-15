package gui;

import javax.swing.*;

public class MainFrame extends JFrame{

    private Menu menu;
    private InformPanel informPanel;
    private SideMenu sideMenu;

    public MainFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAS Information");
        setBounds(400,200,900,670);
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

        informPanel = new InformPanel();
        add(informPanel);
        informPanel.setBounds(250,0,645,613);
    }
}
