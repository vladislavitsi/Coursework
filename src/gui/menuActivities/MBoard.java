package gui.menuActivities;

import gui.BProperty;
import gui.Property;
import handling.WMIHandler;
import java.awt.*;

public class MBoard extends Activity {
    public MBoard(){
        new Thread(()->{
            Loading loading = new Loading();
            add(loading);
            String tempStr = "";
            String info = WMIHandler.getWMIValue("mboard.vbs");
            String[] infos = info.split("\r\n");
            Property.counter = 10;
            int j=0;

            add(new BProperty("Имя: "+infos[j++]));
            add(new Property("Состояние устройства: "+infos[j++]));
            add(new Property("ID устройства: "+infos[j++]));
            add(new Property("Тип основной шины: "+infos[j++]));
            add(new Property("Тип второстепенной шины: "+infos[j++]));
            add(new Property("Статус: "+infos[j++]));
            add(new Property("Является основной платой: "+infos[j++]));
            add(new Property("Производитель: "+infos[j++]));
            add(new Property("Модель: "+infos[j++]));
            add(new Property("Серийный номер: "+infos[j++]));
            add(new Property("Версия системной платы: "+infos[j++]));
            add(new Property(""));

            for (int i=0;i<((infos.length-11)/7);i++){
                add(new BProperty("Тег: "+infos[j++]));
                switch (Integer.parseInt(infos[j++])) {
                    case 0:
                        tempStr = "Зарезервировано";
                        break;
                    case 1:
                        tempStr = "Другое";
                        break;
                    case 2:
                        tempStr = "Неизвестный";
                        break;
                    case 3:
                        tempStr = "Доступно";
                        break;
                    case 4:
                        tempStr = "Используется";
                        break;
                }
                add(new Property("Состояние системного слота: "+tempStr));
                add(new Property("Максимальная ширина шины адаптера: "+infos[j++]));
                add(new Property("Обозначение слота: "+infos[j++]));
                add(new Property("Статус: "+infos[j++]));
                add(new Property("Поддержка HotPlug: "+infos[j++]));
                add(new Property("Номер шины: "+infos[j++]));
                add(new Property(""));
            }
            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter-40));
            updateUI();
        }).start();
    }
}
