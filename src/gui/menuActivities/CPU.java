package gui.menuActivities;

import gui.Property;
import handling.WMIHandler;

import java.awt.*;
import java.lang.management.ManagementFactory;

public class CPU extends Activity {
    public CPU(){
        Loading loading = new Loading();
        add(loading);

        new Thread(()->{
            int j = 0;
            String tempStr = "";
            String info = WMIHandler.getWMIValue("cpu.vbs");
            String[] infos = info.split("\r\n");
            add(new Property("Ширина шины данных: "+infos[j++]+" бит",50));
            add(new Property("Адресная ширина: "+infos[j++]+" бит"));

            switch (Integer.parseInt(infos[j++])){
                case 0:
                    tempStr = "x86";
                    break;
                case 1:
                    tempStr = "MIPS";
                    break;
                case 2:
                    tempStr = "Alpha";
                    break;
                case 3:
                    tempStr = "PowerPC";
                    break;
                case 5:
                    tempStr = "ARM";
                    break;
                case 6:
                    tempStr = "ia64";
                    break;
                case 9:
                    tempStr = "x64";
                    break;
            }
            add(new Property("Архитектура: "+tempStr));
            switch (Integer.parseInt(infos[j++])){
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
                    tempStr = "Тестируется";
                    break;
                case 6:
                    tempStr = "Непригодный";
                    break;
                case 7:
                    tempStr = "Выключен";
                    break;
                case 8:
                    tempStr = "Не в сети";
                    break;
                case 9:
                    tempStr = "В не службы";
                    break;
                case 10:
                    tempStr = "Деградирован";
                    break;
                case 11:
                    tempStr = "Не установлен";
                    break;
                case 12:
                    tempStr = "Ошибка установки";
                    break;
                case 13:
                    tempStr = "Энергосбережение";
                    break;
                case 14:
                    tempStr = "Режим низкой мощности";
                    break;
                case 15:
                    tempStr = "Режим ожидания";
                    break;
                case 16:
                    tempStr = "Рабочий цикл";
                    break;
                case 17:
                    tempStr = "Устройство не работает, но его можно привести в действие";
                    break;
                case 18:
                    tempStr = "Приостановлено";
                    break;
                case 19:
                    tempStr = "Не готово";
                    break;
                case 20:
                    tempStr = "Не настроено";
                    break;
                case 21:
                    tempStr = "Заморожен";
                    break;

            }
            add(new Property("Состояние устройства: "+tempStr));
            switch (Integer.parseInt(infos[j++])){
                case 0:
                    tempStr = "Неизвестно";
                    break;
                case 1:
                    tempStr = "Включен";
                    break;
                case 2:
                    tempStr = "Откл. пользователем через BIOS";
                    break;
                case 3:
                    tempStr = "Откл. (ошибка)";
                    break;
                case 4:
                    tempStr = "Не занят";
                    break;
                case 5:
                case 6:
                    tempStr = "Зарезервинован";
                    break;
                case 7:
                    tempStr = "Другое";
                    break;
            }
            add(new Property("Статус процессора: "+tempStr));
            add(new Property("Текущая тактовая частота: "+infos[j++]+" МГц"));
            add(new Property("Напряжение питания: "+((double)Integer.parseInt(infos[j++], 16 )/10)+" В"));
            add(new Property("Описание процессора: "+infos[j++]));
            add(new Property("Индентификатор процессора в системе: "+infos[j++]));
            add(new Property("Размер L2Cache: "+infos[j++]+" кб"));
            add(new Property("Размер L3Cache: "+infos[j++]+" кб"));
            add(new Property("Имя: "+infos[j++]));
            add(new Property("Производитель: "+infos[j++]));
            add(new Property("Максимальная скорость процессора: "+infos[j++]+" МГц"));
            add(new Property("Количество ядер: "+infos[j++]));
            add(new Property("Количество активных ядер: "+infos[j++]));
            add(new Property("Количество логических процессоров: "+infos[j++]));
            add(new Property("Количество потоков на процессорный сокет: "+infos[j++]));
            add(new Property("Управление мощностью процессора: "+infos[j++]));
            add(new Property("ID процессора: "+infos[j++]));
            switch (Integer.parseInt(infos[j++])){
                case 1:
                    tempStr = "Другое";
                    break;
                case 2:
                    tempStr = "Неизвестно";
                    break;
                case 3:
                    tempStr = "Центральный процессор";
                    break;
                case 4:
                    tempStr = "Математический процессор";
                    break;
                case 5:
                    tempStr = "АЦП процессор";
                    break;
                case 6:
                    tempStr = "Видеопроцессор";
                    break;
            }
            add(new Property("Основная функция процессора: "+tempStr));
            add(new Property("Ревизия: "+infos[j++]));
            add(new Property("Роль: "+infos[j++]));
            add(new Property("Поддержка преобразования адресов: "+infos[j++]));
            add(new Property("Серийный номер: "+infos[j++]));
            add(new Property("Сокет: "+infos[j++]));
            add(new Property("Имя системы: "+infos[j++]));
            add(new Property("Виртуализация включена: "+infos[j++]));
            add(new Property("Поддержка расширений Intel: "+infos[j]));
            remove(loading);
            setPreferredSize(new Dimension(645, Property.counter));

            add(new Property("Использование CPU: ", 10));
            Property cpuUsage = new Property("");
            add(cpuUsage);
            cpuUsage.setBounds(180,10,100,30);
            com.sun.management.OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

            new Thread(()->{
                try {
                    while (true){
                        cpuUsage.setText((int)(operatingSystemMXBean.getSystemCpuLoad()*100)+" %");
                        updateUI();
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
        }).start();
    }

}