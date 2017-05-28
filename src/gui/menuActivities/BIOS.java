package gui.menuActivities;

import gui.IProperty;
import gui.Property;
import handling.WMIHandler;

import java.awt.*;

public class BIOS extends Activity {
    public BIOS(){
        Loading loading = new Loading();
        add(loading);
        new Thread(()-> {
            String info = WMIHandler.getWMIValue("bios.vbs");
            String[] infos = info.split("\r\n");
            String[] languages = infos[5].split(",");
            String[] characteristics = infos[18].split(",");

            add(new Property("Описание: "+infos[0],10));
            add(new Property("Текущий язык BIOS: "+infos[1]));
            add(new Property("Основной выпуск ПО встроенного контроллера: "+infos[2]));
            add(new Property("Дополнительный выпуск ПО встроенного контроллера: "+infos[3]));
            add(new Property("Количество доступных языков: "+infos[4]));
            add(new Property("Список доступных языков: "));
            for(String language:languages){
                add(new IProperty(language));
            }
            add(new Property("Производитель BIOS: "+infos[6]));
            add(new Property("Основной BIOS: "+infos[7]));
            add(new Property("Дата релиза: "+infos[8]));
            add(new Property("Серийный номер BIOS: "+infos[9]));
            add(new Property("Версия основой SMBIOS: "+infos[10]));
            add(new Property("Версия дополнительной SMBIOS: "+infos[11]));
            add(new Property("SMBIOS доступен: "+infos[12]));
            add(new Property("Статус: "+infos[13]));
            add(new Property("Основная версия System BIOS: "+infos[14]));
            add(new Property("Второстепенная версия System BIOS: "+infos[15]));
            add(new Property("Целевая операционная система: "+infos[16]));
            add(new Property("Версия BIOS: "+infos[17]));
            add(new Property("Характеристики биос: "));
            for (String characteristic : characteristics) {
                    switch (Integer.valueOf(characteristic)){
                        case 3:
                            add(new IProperty("Характеристики BIOS не поддерживаются"));
                            break;
                        case 4:
                            add(new IProperty("Поддерживается ISA"));
                            break;
                        case 5:
                            add(new IProperty("Поддерживается MCA"));
                            break;
                        case 6:
                            add(new IProperty("Поддерживается EISA"));
                            break;
                        case 7:
                            add(new IProperty("Поддерживается PCI"));
                            break;
                        case 8:
                            add(new IProperty("Поддерживается PC card (PCMCIA)"));
                            break;
                        case 9:
                            add(new IProperty("Поддержка Plug and Play") );
                            break;
                        case 10:
                            add(new IProperty("Поддерживается APM"));
                            break;
                        case 11:
                            add(new IProperty("Обновление BIOS"));
                            break;
                        case 12:
                            add(new IProperty("Использование теневого ОЗУ для загрузки системной BIOS"));
                            break;
                        case 13:
                            add(new IProperty("Поддерживается VL-VESA"));
                            break;
                        case 14:
                            add(new IProperty("Поддерживается ESCD"));
                            break;
                        case 15:
                            add(new IProperty("Загружается с CD"));
                            break;
                        case 16:
                            add(new IProperty("Поддерживается выборочная загрузка"));
                            break;
                        case 17:
                            add(new IProperty("BIOS ROM сокет"));
                            break;
                        case 18:
                            add(new IProperty("Поддержка загрузки с PC card (PCMCIA)"));
                            break;
                        case 19:
                            add(new IProperty("EDD (Enhanced Disk Drive) спецификация"));
                            break;
                        case 20:
                            add(new IProperty("Поддерживается Int 13h (Японская дискета для NEC 9800 1,2 МБ)"));
                            break;
                        case 21:
                            add(new IProperty("Поддерживается Int 13h (Японская дискета для Toshiba 1,2 МБ)"));
                            break;
                        case 22:
                            add(new IProperty("Поддерживается Int 13h (5.25\\\" / 360 KB Floppy)"));
                            break;
                        case 23:
                            add(new IProperty("Поддерживается Int 13h (5.25\\\" /1.2MB Floppy)"));
                            break;
                        case 24:
                            add(new IProperty("Поддерживается Int 13h (3.5\\\" / 720 KB Floppy)"));
                            break;
                        case 25:
                            add(new IProperty("Поддерживается Int 13h (3.5\\\" / 2.88 MB Floppy)"));
                            break;
                        case 26:
                            add(new IProperty("Поддерживается Int 5h, Print Screen"));
                            break;
                        case 27:
                            add(new IProperty("Поддерживается Int 9h, 8042 Keyboard"));
                            break;
                        case 28:
                            add(new IProperty("Поддерживается Int 14h, Serial"));
                            break;
                        case 29:
                            add(new IProperty("Поддерживается Int 17h, printer"));
                            break;
                        case 30:
                            add(new IProperty("Поддерживается Int 10h, CGA/Mono Video"));
                            break;
                        case 31:
                            add(new IProperty("NEC PC-98"));
                            break;
                        case 32:
                            add(new IProperty("Поддержка ACPI"));
                            break;
                        case 33:
                            add(new IProperty("Поддержка USB Legacy"));
                            break;
                        case 34:
                            add(new IProperty("Поддержка AGP"));
                            break;
                        case 35:
                            add(new IProperty("Поддержка загрузки I2O"));
                            break;
                        case 36:
                            add(new IProperty("Поддержка загрузки LS-120"));
                            break;
                        case 37:
                            add(new IProperty("Поддержка загрузки ATAPI ZIP Drive"));
                            break;
                        case 38:
                            add(new IProperty("Поддержка загрузки 1394"));
                            break;
                        case 39:
                            add(new IProperty("Поддержка Smart Battery"));
                            break;
                    }
                }
            remove(loading);
            setPreferredSize(new Dimension(645, Property.counter));
            this.updateUI();
        }).start();
    }


}
