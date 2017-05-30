package gui.menuActivities;

import gui.BProperty;
import gui.IProperty;
import gui.Property;
import handling.WMIHandler;

import javax.swing.*;
import java.awt.*;

public class GPU extends Activity {
    public GPU(){
        Loading loading = new Loading();
        add(loading);
        new Thread(()->{
            Property.counter = 10;
            String[] infos = WMIHandler.getWMIValue("gpu.vbs").split("\r\n");
            int j=0;
            for(int i=0;i<(infos.length/22);i++){
                String tempStr = "";
                add(new BProperty("Имя адаптера: "+infos[j++]));
                add(new Property("Производитель: "+infos[j++]));
                add(new Property("Имя DAC: "+infos[j++]));
                add(new Property("Размер видеопамяти: "+infos[j++]+" байт"));
                switch (Integer.valueOf(infos[j++])){
                    case 1:
                        tempStr = "Другое";
                        break;
                    case 2:
                        tempStr = "Неизвестно";
                        break;
                    case 3:
                        tempStr = "Работает";
                        break;
                    case 4:
                        tempStr = "Предупреждение";
                        break;
                    case 5:
                        tempStr = "В тесте";
                        break;
                    case 6:
                        tempStr = "Не применимо";
                        break;
                    case 7:
                        tempStr = "Отключение питания";
                        break;
                    case 8:
                        tempStr = "В автономном режиме";
                        break;
                    case 9:
                        tempStr = "Не работает";
                        break;
                    case 10:
                        tempStr = "Деградированное";
                        break;
                    case 12:
                        tempStr = "Ошибка установки";
                        break;
                    case 13:
                        tempStr = "Энергосбережение - неизвестно";
                        break;
                }
                add(new Property("Доступность устройства: "+tempStr));
                add(new Property("Использует пользовательскую конфигурацию: "+infos[j++]));
                add(new Property("Текущее кол-во бит на пиксель: "+infos[j++]));
                add(new Property("Текущая частоа обновления изображения: "+infos[j++]));
                switch (Integer.valueOf(infos[j++])){
                    case 1:
                        tempStr = "Другое";
                        break;
                    case 2:
                        tempStr = "Неизвестно";
                        break;
                    case 3:
                        tempStr = "С чересстрочной разверткой";
                        break;
                    case 4:
                        tempStr = "Без чересстрочной развертки";
                        break;
                }
                add(new Property("Текущий режим сканирования: "+tempStr));
                add(new Property("Дата версии драйвера: "+infos[j++]));
                add(new Property("Версия драйвера: "+infos[j++]));
                add(new Property("Путь к INF-файлу драйвера: "+infos[j++]));
                add(new Property("Раздел INF-файла, с видеоинф. Windows: "+infos[j++]));
                add(new Property("Установленные драйвера устройства отображения: "));
                String drivers[] = infos[j++].split(",");
                for(String driver:drivers){
                    add(new IProperty(driver));
                }
                add(new Property("Максимальная частота обновления видеоконтроллера: "+infos[j++]));
                add(new Property("Минимальная частота обновления видеоконтроллера: "+infos[j++]));
                add(new Property("Монохром: "+infos[j++]));
                add(new Property("Статус: "+infos[j++]));
                switch (Integer.valueOf(infos[j++])){
                    case 1:
                        tempStr = "Другое";
                        break;
                    case 2:
                        tempStr = "Неизвестно";
                        break;
                    case 3:
                        tempStr = "CGA";
                        break;
                    case 4:
                        tempStr = "EGA";
                        break;
                    case 5:
                        tempStr = "VGA";
                        break;
                    case 6:
                        tempStr = "SVGA";
                        break;
                    case 7:
                        tempStr = "MDA";
                        break;
                    case 8:
                        tempStr = "HGC";
                        break;
                    case 9:
                        tempStr = "MCGA";
                        break;
                    case 10:
                        tempStr = "8514A";
                        break;
                    case 11:
                        tempStr = "XGA";
                        break;
                    case 12:
                        tempStr = "Linear Frame Buffer";
                        break;
                    case 160:
                        tempStr = "PC-98";
                        break;
                }
                add(new Property("Тип видеоархитектуры: "+tempStr));
                switch (Integer.valueOf(infos[j++])){
                    case 1:
                        tempStr = "Другое";
                        break;
                    case 2:
                        tempStr = "Неизвестно";
                        break;
                    case 3:
                        tempStr = "VRAM";
                        break;
                    case 4:
                        tempStr = "DRAM";
                        break;
                    case 5:
                        tempStr = "SRAM";
                        break;
                    case 6:
                        tempStr = "WRAM";
                        break;
                    case 7:
                        tempStr = "EDO RAM";
                        break;
                    case 8:
                        tempStr = "Синхронная динамическая память";
                        break;
                    case 9:
                        tempStr = "Конвейерная память SRAM";
                        break;
                    case 10:
                        tempStr = "CDRAM";
                        break;
                    case 11:
                        tempStr = "3DRAM";
                        break;
                    case 12:
                        tempStr = "SDRAM";
                        break;
                    case 13:
                        tempStr = "SGRAM";
                        break;
                }
                add(new Property("Тип видеопамяти: "+tempStr));
                add(new Property("Текущее разрешение X кол-во цветов: "+infos[j++]));
                add(new Property("Видеопроцессор: "+infos[j++]));
            }
            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter));
            updateUI();
        }).start();
    }
}
