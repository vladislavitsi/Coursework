package gui.menuActivities;

import gui.BProperty;
import gui.IProperty;
import gui.Property;
import handling.WMIHandler;

import java.awt.*;

public class HDD extends Activity {
    public HDD(){
        Loading loading = new Loading();
        add(loading);
        new Thread(()->{
            String[] infos = WMIHandler.getWMIValue("hdd.vbs").split("\r\n");
            String capabilities[];
            int j=0;
            Property.counter = 10;
            for(int i=0;i<(infos.length/15);i++) {
                add(new BProperty("Имя: " + infos[j++]));
                add(new Property("Байтов в секторе: " + infos[j++]));
                add(new Property("Возможности: "));
                capabilities = infos[j++].split(",");
                for(String cap:capabilities){
                    switch (Integer.valueOf(cap)){
                        case 0:
                            add(new IProperty("Неизвестный"));
                            break;
                        case 1:
                            add(new IProperty("Другое"));
                            break;
                        case 2:
                            add(new IProperty("Последовательный доступ"));
                            break;
                        case 3:
                            add(new IProperty("Случайный доступ"));
                            break;
                        case 4:
                            add(new IProperty("Поддерживает запись"));
                            break;
                        case 5:
                            add(new IProperty("Шифрование"));
                            break;
                        case 6:
                            add(new IProperty("Сжатие"));
                            break;
                        case 7:
                            add(new IProperty("Поддержка сменных носителей"));
                            break;
                        case 8:
                            add(new IProperty("Ручная очистка"));
                            break;
                        case 9:
                            add(new IProperty("Автоматическая чистка"));
                            break;
                        case 10:
                            add(new IProperty("SMART уведомления"));
                            break;
                        case 11:
                            add(new IProperty("Поддерживает двусторонние носители"));
                            break;
                        case 12:
                            add(new IProperty("Предсессионный выброс не требуется"));
                            break;
                    }
                }
                add(new Property("ID диска: " + infos[j++]));
                add(new Property("Заводская ревизия: " + infos[j++]));
                add(new Property("Тип интерфейса: " + infos[j++]));
                add(new Property("Производитель: " + infos[j++]));
                add(new Property("Кол-во разделов: " + infos[j++]));
                add(new Property("Секторов в каждом треке: " + infos[j++]));
                add(new Property("Серийный номер: " + infos[j++]));
                add(new Property("Размер: " + infos[j++]+" байт"));
                add(new Property("Общее кол-во цилиндров: " + infos[j++]));
                add(new Property("Обзее кол-во секторов: " + infos[j++]));
                add(new Property("Общее кол-во дорожек: " + infos[j++]));
                add(new Property("Кол-во дорожек в цилиндре: " + infos[j++]));
                add(new Property(""));
            }
            setPreferredSize(new Dimension(645, Property.counter-40));
            remove(loading);
            updateUI();
        }).start();
    }
}
