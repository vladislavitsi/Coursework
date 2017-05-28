package gui.menuActivities;

import gui.Property;
import handling.WMIHandler;

import java.awt.*;

public class Monitor extends Activity{
    public Monitor(){
        Property active = new Property("Активен: ", 10);
        add(active);

        Property instanceName = new Property("Имя монитора: ");
        add(instanceName);

        Property productCodeId = new Property("ID монитора: ");
        add(productCodeId);

        Property serialNumberID = new Property("Серийный номер: ");
        add(serialNumberID);

        Property yearOfManufacture = new Property("Год производства: ");
        add(yearOfManufacture);

        Property maxHorizontalImageSize = new Property("Ширина: ");
        add(maxHorizontalImageSize);

        Property maxVerticalImageSize = new Property("Высота: ");
        add(maxVerticalImageSize);

        Property videoInputType = new Property("Режим работы монитора: ");
        add(videoInputType);

        Property screenResolution = new Property("Разрешение экрана: "+((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth())+"x"+((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
        add(screenResolution);

        new Thread(()->{
            String info = WMIHandler.getWMIValue("monitor.vbs");
            String[] infos = info.split("\r\n");
            active.setText(active.getText()+infos[0]);
            instanceName.setText(instanceName.getText()+infos[1]);
            productCodeId.setText(productCodeId.getText()+infos[2]);
            serialNumberID.setText(serialNumberID.getText()+infos[3]);
            yearOfManufacture.setText(yearOfManufacture.getText()+infos[4]);
            maxHorizontalImageSize.setText(maxHorizontalImageSize.getText()+infos[5]+" см");
            maxVerticalImageSize.setText(maxVerticalImageSize.getText()+infos[6]+" см");
            videoInputType.setText(videoInputType.getText()+(infos[7].equals("1")?"Цифровой режим":"Аналоговый режим"));
            updateUI();
        }).start();
    }
}
