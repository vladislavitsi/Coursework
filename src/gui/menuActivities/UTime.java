package gui.menuActivities;

import gui.BProperty;
import gui.Property;
import handling.WMIHandler;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class UTime extends Activity {
    Property time;

    public UTime(){
        new Thread(()->{
            Loading loading = new Loading();
            add(loading);
            String info = WMIHandler.getWMIValue("userstime.vbs");
            String[] infos = info.split("\r\n");
            int j=0;
            StringTokenizer token;
            String tempStr = "";
            Property.counter = 10;
            SimpleDateFormat smf = new SimpleDateFormat("HH:mm:SS dd.MM.yyyy");
            Date date = null;

            for(int i=0;i<(infos.length/5);i++){
                add(new BProperty("Пользователь: "+infos[j++]));
                add(new Property("Полное имя: "+infos[j++]));
                tempStr = infos[j++];
                if(!tempStr.contains("-")){
                    token = new StringTokenizer(tempStr, ".");

                    tempStr = token.nextToken();
                    try {
                        date = new SimpleDateFormat("yyyyMMddHHmmSS").parse(tempStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    add(new Property("Дата последнего входа: " + smf.format(date)));
                    time = new Property(Long.toString(date.getTime()));
                    add(time);
                    new Thread(()->{
                        long millis, second, minute, hour, days;
                        millis = new Date().getTime() - Long.valueOf(time.getText());
                        while (true) {
                            second = (millis / 1000) % 60;
                            minute = (millis / (1000 * 60)) % 60;
                            hour = (millis / (1000 * 60 * 60)) % 24;
                            days = (millis / (1000 * 60 * 60 * 24)) % 356;
                            time.setText("Время после последнего входа: "+String.format("%03d:%02d:%02d:%02d", days, hour, minute, second));
                            updateUI();
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            millis += 1000;
                        }
                    }).start();
                }else{
                    add(new Property("Дата последнего входа: " + tempStr));
                }
                add(new Property("Имя: "+infos[j++]));
                add(new Property("Кол-во входов: "+infos[j++]));
            }

            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter));
            updateUI();
        }).start();
    }
}
