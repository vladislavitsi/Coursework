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
            for(int i=0;i<(infos.length/23);i++){
                int x;
                String tempStr = "";
                String drivers[] = infos[14+(23*i)].split(",");
                add(new BProperty("Видео адаптер "+infos[23*i]));
                add(new Property("Имя адаптера: "+infos[1+(23*i)]));
                add(new Property("Производитель: "+infos[2+(23*i)]));
                add(new Property("Имя DAC: "+infos[3+(23*i)]));
                add(new Property("Размер видеопамяти: "+infos[4+(23*i)]+" байт"));
                switch (Integer.valueOf(infos[5+(23*i)])){
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
                add(new Property("Использует пользовательскую конфигурацию: "+infos[6+(23*i)]));
                add(new Property("Текущее кол-во бит на пиксель: "+infos[7+(23*i)]));
                add(new Property("Текущая частоа обновления изображения: "+infos[8+(23*i)]));
                switch (Integer.valueOf(infos[9+(23*i)])){
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
                add(new Property("Дата версии драйвера: "+infos[10+(23*i)]));
                add(new Property("Версия драйвера: "+infos[11+(23*i)]));
                add(new Property("Путь к INF-файлу драйвера: "+infos[12+(23*i)]));
                add(new Property("Раздел INF-файла, с видеоинф. Windows: "+infos[13+(23*i)]));
                add(new Property("Установленные драйвера устройства отображения: "));
                for(String driver:drivers){
                    add(new IProperty(driver));
                }
                add(new Property("Максимальная частота обновления видеоконтроллера: "+infos[15+(23*i)]));
                add(new Property("Минимальная частота обновления видеоконтроллера: "+infos[16+(23*i)]));
                add(new Property("Монохром: "+infos[17+(23*i)]));
                add(new Property("Статус: "+infos[18+(23*i)]));
                switch (Integer.valueOf(infos[19+(23*i)])){
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
                switch (Integer.valueOf(infos[20+(23*i)])){
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
                add(new Property("Текущее разрешение X кол-во цветов: "+infos[21+(23*i)]));
                add(new Property("Видеопроцессор: "+infos[22+(23*i)]));
                remove(loading);
                setPreferredSize(new Dimension(740, Property.counter));
                updateUI();
            }
        }).start();
    }
}
