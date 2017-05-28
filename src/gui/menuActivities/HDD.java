package gui.menuActivities;

import gui.Property;
import handling.WMIHandler;

import javax.swing.*;
import java.awt.*;

public class HDD extends Activity {
    public HDD(){
        Loading loading = new Loading();
        add(loading);
        new Thread(()->{
            String[] infos = WMIHandler.getWMIValue("hdd.vbs").split("\r\n");
            add(new Property("Описание: "+infos[0],10));
            add(new Property("Байтов в секторе: "+infos[1]));
            add(new Property("Возможности: "+infos[2]));
            add(new Property("ID диска: "+infos[3]));
            add(new Property("Заводская ревизия: "+infos[4]));
            add(new Property("Тип интерфейса: "+infos[5]));
            add(new Property("Производитель: "+infos[6]));
            add(new Property("Кол-во разделов: "+infos[7]));
            add(new Property("Секторов в каждом треке: "+infos[8]));
            add(new Property("Серийный номер: "+infos[9]));
            add(new Property("Размер: "+infos[10]));
            add(new Property("Общее кол-во цилиндров: "+infos[11]));
            add(new Property("Обзее кол-во секторов: "+infos[12]));
            add(new Property("Общее кол-во дорожек: "+infos[13]));
            add(new Property("Кол-во дорожек в цилиндре: "+infos[14]));
            setPreferredSize(new Dimension(645, Property.counter));
            remove(loading);
            updateUI();
        }).start();
    }
}
