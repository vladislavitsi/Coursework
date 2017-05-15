package gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

class SideMenu extends JScrollPane {

    private LinkedList<ItemSideMenu> sideMenuList;
    private final static Color enteredButtonColor = new Color(245,245,245);
    private final static Color pressedButtonColor = new Color(224,224,224);

    SideMenu(){
        setBorder(new MatteBorder(0,0,0,1,Color.LIGHT_GRAY));

        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel panel = new JPanel();
        setViewportView(panel);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        sideMenuList = new LinkedList<>();
        sideMenuList.add(new ItemSideMenu("Процессор"));
        sideMenuList.add(new ItemSideMenu("BIOS"));
        sideMenuList.add(new ItemSideMenu("Разделы HDD"));
        sideMenuList.add(new ItemSideMenu("HDD"));
        sideMenuList.add(new ItemSideMenu("Системная плата"));
        sideMenuList.add(new ItemSideMenu("Видеокарта"));
        sideMenuList.add(new ItemSideMenu("Монитор"));
        sideMenuList.add(new ItemSideMenu("Сетевые адаптеры"));
        sideMenuList.add(new ItemSideMenu("Запущеные приложения"));
        sideMenuList.add(new ItemSideMenu("Время работы ПК"));
        sideMenuList.add(new ItemSideMenu("Время работы пользователей"));
        int i=0;
        for(ItemSideMenu itemSideMenu:sideMenuList){
            panel.add(itemSideMenu);
            itemSideMenu.setBounds(0,5+i*55,250,50);
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
            }else {
                this.itemSideMenu.setBackground(SideMenu.enteredButtonColor);
                itemSideMenu.setPressed(false);
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
