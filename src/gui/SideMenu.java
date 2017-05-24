package gui;

import gui.menuActivities.Activity;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

class SideMenu extends JPanel {

    private LinkedList<ItemSideMenu> sideMenuList;
    private final static Color enteredButtonColor = new Color(245,245,245);
    private final static Color pressedButtonColor = new Color(224,224,224);

    SideMenu(){
        setBorder(new MatteBorder(0,0,0,1,Color.LIGHT_GRAY));

        setLayout(null);
        setBackground(Color.WHITE);

        sideMenuList = new LinkedList<>();
        sideMenuList.add(new ItemSideMenu("Процессор","CPU"));
        sideMenuList.add(new ItemSideMenu("BIOS","BIOS"));
        sideMenuList.add(new ItemSideMenu("Разделы HDD","HDDPart"));
        sideMenuList.add(new ItemSideMenu("HDD","HDD"));
        sideMenuList.add(new ItemSideMenu("Системная плата","MBoard"));
        sideMenuList.add(new ItemSideMenu("Видеокарта","GPU"));
        sideMenuList.add(new ItemSideMenu("Монитор","Monitor"));
        sideMenuList.add(new ItemSideMenu("Сетевые адаптеры","Net"));
        sideMenuList.add(new ItemSideMenu("Запущеные приложения","Apps"));
        sideMenuList.add(new ItemSideMenu("Время работы ПК","PCTime"));
        sideMenuList.add(new ItemSideMenu("Время работы пользователей","UTime"));
        int i=0;
        for(ItemSideMenu itemSideMenu:sideMenuList){
            add(itemSideMenu);
            itemSideMenu.setBounds(0,5+i*55,249,50);
            itemSideMenu.addMouseListener(new Listener(itemSideMenu));
            i++;
        }
    }

    class Listener implements MouseListener{

        ItemSideMenu itemSideMenu;

        Listener(ItemSideMenu itemSideMenu){
            this.itemSideMenu = itemSideMenu;
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (!itemSideMenu.isPressed()) {
                for(ItemSideMenu itemSideMenu:sideMenuList){
                    itemSideMenu.setBackground(Color.WHITE);
                    itemSideMenu.setPressed(false);
                }
                this.itemSideMenu.setBackground(SideMenu.pressedButtonColor);
                itemSideMenu.setPressed(true);
                try {
                    InformPanel.getInformPanel().addC((Activity) Class.forName("gui.menuActivities."+itemSideMenu.getcText()).newInstance());
                }catch (Exception c){
                    c.printStackTrace();
                }

            }else {
                this.itemSideMenu.setBackground(SideMenu.enteredButtonColor);
                itemSideMenu.setPressed(false);
                InformPanel.getInformPanel().clear();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(!itemSideMenu.isPressed()){
                itemSideMenu.setBackground(SideMenu.enteredButtonColor);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!itemSideMenu.isPressed()){
                itemSideMenu.setBackground(Color.WHITE);
            }
        }
    }
}
