package gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Menu extends JMenuBar {

    private final static Font FONT = new Font("dd",Font.TRUETYPE_FONT,12);

    private ItemMenu saveLog;
    private ItemMenu exit;
    private ItemMenu keyboardUsing;
    private ItemMenu mouseUsing;
    private ItemMenu about;

    Menu(){
        setBackground(Color.WHITE);
        setBorder(new MatteBorder(0,0,1,0,Color.LIGHT_GRAY));

        JMenu fileMenu = new JMenu("Файл");
        fileMenu.setFont(FONT);
            saveLog = new ItemMenu("Сохранить лог на сервер");
            exit = new ItemMenu("Выход");
            fileMenu.add(saveLog);
            fileMenu.addSeparator();
            fileMenu.add(exit);

        JMenu actionMenu = new JMenu("Действия");
        actionMenu.setFont(FONT);
            keyboardUsing = new ItemMenu("Использование клавиатуры");
            mouseUsing = new ItemMenu("Использование мыши");
            actionMenu.add(keyboardUsing);
            actionMenu.add(mouseUsing);

        JMenu aboutMenu = new JMenu("Помощь");
        aboutMenu.setFont(FONT);
            about = new ItemMenu("О программе");
            aboutMenu.add(about);

        addActionListeners();

        add(fileMenu);
        add(actionMenu);
        add(aboutMenu);
    }

    private void addActionListeners(){
        //save log
        saveLog.addActionListener(e -> {});
        //exit
        exit.addActionListener(e -> System.exit(0));
        //keylog
        keyboardUsing.addActionListener(e -> {
            try {
                Desktop.getDesktop().open(new File("exec\\kl.exe"));
            }catch (IOException ignored){}
        });
        //mouselog
        mouseUsing.addActionListener(e -> {
            try {
                Desktop.getDesktop().open(new File("exec\\ml.exe"));
            }catch (IOException ignored){}
        });
        //about
        about.addActionListener(e -> new AboutFrame());
    }

    class ItemMenu extends JMenuItem{
        ItemMenu(String text){
            super(text);
            setBackground(Color.WHITE);
            setFont(FONT);
        }
    }
}
