package gui.menuActivities;

import gui.Property;
import handling.WMIHandler;

import java.awt.*;
import java.lang.management.ManagementFactory;

public class CPU extends Activity {
    public CPU(){

        Property cpuLabel = new Property("Использование CPU: ", 10);
        add(cpuLabel);

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

        Property dataWidth = new Property("Ширина шины данных: ",50);
        add(dataWidth);

        Property addressWidth = new Property("Адресная ширина: ");
        add(addressWidth);

        Property architecture = new Property("Архитектура: ");
        add(architecture);

        Property avalability = new Property("Состояние устройства: ");
        add(avalability);

        Property cpuStatus = new Property("Статус процессора: ");
        add(cpuStatus);

        Property currentClockSpeed = new Property("Текущая тактовая частота: ");
        add(currentClockSpeed);

        Property currentVoltage = new Property("Напряжение питания: ");
        add(currentVoltage);

        Property description = new Property("Описание процессора: ");
        add(description);

        Property deviceID = new Property("Индентификатор процессора в системе: ");
        add(deviceID);

        Property l2CacheSize = new Property("Размер L2Cache: ");
        add(l2CacheSize);

        Property l3CacheSize = new Property("Размер L3Cache: ");
        add(l3CacheSize);

        Property name = new Property("Имя: ");
        add(name);

        Property manufacturer = new Property("Производитель: ");
        add(manufacturer);

        Property maxClockSpeed = new Property("Максимальная скорость процессора: ");
        add(maxClockSpeed);

        Property numberOfCores = new Property("Количество ядер: ");
        add(numberOfCores);

        Property numberOfEnabledCore = new Property("Количество активных ядер: ");
        add(numberOfEnabledCore);

        Property numberOfLogicalProcessors = new Property("Количество логических процессоров: ");
        add(numberOfLogicalProcessors);

        Property threadCount = new Property("Количество потоков на процессорный сокет: ");
        add(threadCount);

        Property powerManagementSupported = new Property("Управление мощностью процессора: ");
        add(powerManagementSupported);

        Property processorId = new Property("ID процессора: ");
        add(processorId);

        Property processorType = new Property("Основная функция процессора: ");
        add(processorType);

        Property revision = new Property("Ревизия: ");
        add(revision);

        Property role = new Property("Роль: ");
        add(role);

        Property secondLevelAddressTranslationExtensions = new Property("Поддержка преобразования адресов: ");
        add(secondLevelAddressTranslationExtensions);

        Property serialNumber = new Property("Серийный номер: ");
        add(serialNumber);

        Property socketDesignation = new Property("Сокет: ");
        add(socketDesignation);

        Property systemName = new Property("Имя системы: ");
        add(systemName);

        Property visualizationFirmwareEnabled = new Property("Виртуализация включена: ");
        add(visualizationFirmwareEnabled);

        Property VMMonitorModeExtensions = new Property("Поддержка расширений Intel: ");
        add(VMMonitorModeExtensions);


        new Thread(()->{
            int i = 0;
            String tempStr = "";
            String info = WMIHandler.getWMIValue("cpu.vbs");
            String[] infos = info.split("\r\n");
            dataWidth.setText(dataWidth.getText()+infos[i++]+" бит");
            addressWidth.setText(addressWidth.getText()+infos[i++]+" бит");
            switch (Integer.parseInt(infos[i++])){
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
            architecture.setText(architecture.getText()+tempStr);
            switch (Integer.parseInt(infos[i++])){
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
            avalability.setText(avalability.getText()+tempStr);
            switch (Integer.parseInt(infos[i++])){
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
            cpuStatus.setText(cpuStatus.getText()+tempStr);
            currentClockSpeed.setText(currentClockSpeed.getText()+infos[i++]+" МГц");
            currentVoltage.setText(currentVoltage.getText()+((double)Integer.parseInt(infos[i++], 16 )/10)+" В");
            description.setText(description.getText()+infos[i++]);
            deviceID.setText(deviceID.getText()+infos[i++]);
            l2CacheSize.setText(l2CacheSize.getText()+infos[i++]+" кб");
            l3CacheSize.setText(l3CacheSize.getText()+infos[i++]+" кб");
            name.setText(name.getText()+infos[i++]);
            manufacturer.setText(manufacturer.getText()+infos[i++]);
            maxClockSpeed.setText(maxClockSpeed.getText()+infos[i++]+" МГц");
            numberOfCores.setText(numberOfCores.getText()+infos[i++]);
            numberOfEnabledCore.setText(numberOfEnabledCore.getText()+infos[i++]);
            numberOfLogicalProcessors.setText(numberOfLogicalProcessors.getText()+infos[i++]);
            threadCount.setText(threadCount.getText()+infos[i++]);
            powerManagementSupported.setText(powerManagementSupported.getText()+infos[i++]);
            processorId.setText(processorId.getText()+infos[i++]);
            switch (Integer.parseInt(infos[i++])){
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
            processorType.setText(processorType.getText()+tempStr);
            revision.setText(revision.getText()+infos[i++]);
            role.setText(role.getText()+infos[i++]);
            secondLevelAddressTranslationExtensions.setText(secondLevelAddressTranslationExtensions.getText()+infos[i++]);
            serialNumber.setText(serialNumber.getText()+infos[i++]);
            socketDesignation.setText(socketDesignation.getText()+infos[i++]);
            systemName.setText(systemName.getText()+infos[i++]);
            visualizationFirmwareEnabled.setText(visualizationFirmwareEnabled.getText()+infos[i++]);
            VMMonitorModeExtensions.setText(VMMonitorModeExtensions.getText()+infos[i++]);
            setPreferredSize(new Dimension(645, Property.counter));
        }).start();
    }

}