package gui.menuActivities;

import gui.BProperty;
import gui.Property;
import handling.WMIHandler;

import java.awt.*;
public class HDDPart extends Activity {
    public HDDPart(){
        Loading loading = new Loading();
        add(loading);
        new Thread(()->{
            Property.counter = 10;
            String[] infos = WMIHandler.getWMIValue("hddpart.vbs").split("\r\n");
            for(int i=0;i<(infos.length/18);i++){
                add(new Property("Разделы диска "));
                add(new BProperty("Диск "+infos[18*i]));
                add(new Property("Описание: "+infos[1+(18*i)]));
                add(new Property("Автомонтирование: "+infos[2+(18*i)]));
                add(new Property("Размер блока данных: "+infos[3+(18*i)]+" байт"));
                add(new Property("Загрузочный: "+infos[4+(18*i)]));
                add(new Property("Объем: "+infos[5+(18*i)]+" байт"));
                add(new Property("Свободное место: "+infos[6+(18*i)]+" байт"));
                add(new Property("Сжатый: "+infos[7+(18*i)]));
                add(new Property("Id устройства: "+infos[8+(18*i)]));
                add(new Property("Тип диска: "+infos[9+(18*i)]));
                add(new Property("Файловая система: "+infos[10+(18*i)]));
                add(new Property("Индексирование: "+infos[11+(18*i)]));
                add(new Property("Имя логического диска: "+infos[12+(18*i)]));
                add(new Property("Максимальная длина имени файла: "+infos[13+(18*i)]));
                add(new Property("Присутствует файл подкачки: "+infos[14+(18*i)]));
                add(new Property("Серийный номер: "+infos[15+(18*i)]));
                add(new Property("Поддержка DiskQuotas: "+infos[16+(18*i)]));
                add(new Property("Поддержка сжатия на основе файлов: "+infos[17+(18*i)]));
                remove(loading);
                setPreferredSize(new Dimension(645, Property.counter));
                updateUI();
            }
        }).start();
    }


}
