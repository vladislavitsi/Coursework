package gui.menuActivities;

import gui.BProperty;
import gui.Property;
import handling.WMIHandler;

import java.awt.*;

public class Net extends Activity {
    public Net(){
        new Thread(()->{
            Loading loading = new Loading();
            add(loading);
            String info = WMIHandler.getWMIValue("net.vbs");
            String[] infos = info.split("\r\n");
            Property.counter = 10;
            String tempStr = "";
            int j=0;
            for(int i=0;i<(infos.length/19);i++) {
                add(new BProperty("" + infos[j++]));
                add(new Property("Тип адаптера: " + infos[j++]));
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
                add(new Property("Состояние: " + tempStr));
                add(new Property("Описание: " + infos[j++]));
                add(new Property("ID устройства: " + infos[j++]));
                add(new Property("GUID: " + infos[j++]));
                add(new Property("Индекс: " + infos[j++]));
                add(new Property("Установлен ли сетевой адаптер: " + infos[j++]));
                add(new Property("Индекс интерфейса: " + infos[j++]));
                add(new Property("MAC-адрес: " + infos[j++]));
                add(new Property("Производитель: " + infos[j++]));
                add(new Property("Максимальное кол-во портов: " + infos[j++]));
                add(new Property("Имя сетевого подключения: " + infos[j++]));
                switch (Integer.parseInt(infos[j++])){
                    case -1:
                        tempStr = "Недоступно";
                        break;
                    case 0:
                        tempStr = "Отключено";
                        break;
                    case 1:
                        tempStr = "Подключение";
                        break;
                    case 2:
                        tempStr = "Подключено";
                        break;
                    case 3:
                        tempStr = "Отключение";
                        break;
                    case 4:
                        tempStr = "Оборудование отсутствует ";
                        break;
                    case 5:
                        tempStr = "Оборудование отключено";
                        break;
                    case 6:
                        tempStr = "Неисправность оборудования";
                        break;
                    case 7:
                        tempStr = "Медиа отключено";
                        break;
                    case 8:
                        tempStr = "Аутентификация";
                        break;
                    case 9:
                        tempStr = "Аутентификация выполнена успешна";
                        break;
                    case 10:
                        tempStr = "Аутентификация провалена";
                        break;
                    case 11:
                        tempStr = "Недействительный адрес";
                        break;
                    case 12:
                        tempStr = "Необходимые учётные данные";
                        break;
                    default:
                        tempStr = "Другое";
                        break;
                }
                add(new Property("Статус сетевого подключения: " + tempStr));
                add(new Property("Физический адаптер?: " + infos[j++]));
                add(new Property("PNPDeviceID: " + infos[j++]));
                add(new Property("Название сетевого адаптера: " + infos[j++]));
                add(new Property("Имя службы сетевого адаптера: " + infos[j++]));
                add(new Property("Скорость: " + infos[j++]));
                add(new Property(""));
            }
            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter-40));
            updateUI();
        }).start();
    }
}
