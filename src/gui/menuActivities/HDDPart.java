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
            add(new Property("Разделы диска "));
            int j=0;
            for(int i=0;i<(infos.length/18);i++){
                add(new BProperty("Диск "+infos[j++]));
                add(new Property("Описание: "+infos[j++]));
                add(new Property("Автомонтирование: "+infos[j++]));
                add(new Property("Размер блока данных: "+infos[j++]+" байт"));
                add(new Property("Загрузочный: "+infos[j++]));
                add(new Property("Объем: "+infos[j++]+" байт"));
                add(new Property("Свободное место: "+infos[j++]+" байт"));
                add(new Property("Сжатый: "+infos[j++]));
                add(new Property("Id устройства: "+infos[j++]));
                add(new Property("Тип диска: "+infos[j++]));
                add(new Property("Файловая система: "+infos[j++]));
                add(new Property("Индексирование: "+infos[j++]));
                add(new Property("Имя логического диска: "+infos[j++]));
                add(new Property("Максимальная длина имени файла: "+infos[j++]));
                add(new Property("Присутствует файл подкачки: "+infos[j++]));
                add(new Property("Серийный номер: "+infos[j++]));
                add(new Property("Поддержка DiskQuotas: "+infos[j++]));
                add(new Property("Поддержка сжатия на основе файлов: "+infos[j++]));
                remove(loading);
                setPreferredSize(new Dimension(645, Property.counter));
                updateUI();
            }
        }).start();
    }


}
