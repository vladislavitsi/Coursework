package gui.menuActivities;

import gui.BProperty;
import gui.Property;
import handling.WMIHandler;

import java.awt.*;

public class Monitor extends Activity{
    public Monitor(){
        new Thread(()->{
            Loading loading = new Loading();
            add(loading);
            String info = WMIHandler.getWMIValue("monitor.vbs");
            String[] infos = info.split("\r\n");
            Property.counter = 10;
            int j=0;
            for (int i=0;i<(infos.length/8);i++) {
                add(new BProperty("Имя монитора: " + infos[j++]));
                add(new Property("Активен: " + infos[j++]));
                add(new Property("ID монитора: " + infos[j++]));
                add(new Property("Серийный номер: " + infos[j++]));
                add(new Property("Год производства: " + infos[j++]));
                add(new Property("Ширина: " + infos[j++]));
                add(new Property("Высота: " + infos[j++]));
                add(new Property("Режим работы монитора: " + (infos[j++].equals("1") ? "Цифровой режим" : "Аналоговый режим")));
                add(new Property(""));
            }
            Property.counter -= 40;
            add(new Property("Разрешение экрана: "+((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth())+"x"+((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight())));
            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter));
            updateUI();
        }).start();
    }
}
