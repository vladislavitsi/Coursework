package gui.menuActivities;

import gui.Property;
import handling.WMIHandler;

import java.awt.*;
import java.text.*;
import java.util.Date;
import java.util.StringTokenizer;


public class SysTime extends Activity {

    private long startUpMills;

    public SysTime(){
        new Thread(()->{
            Loading loading = new Loading();
            add(loading);
            String info = WMIHandler.getWMIValue("systime.vbs");
            String[] infos = info.split("\r\n");
            StringTokenizer startT = new StringTokenizer(infos[0],".");
            StringTokenizer installT = new StringTokenizer(infos[1],".");

            Property timeLabel = new Property("Время работы ПК: ", 10);
            Font font = new Font("font",Font.TRUETYPE_FONT,20);
            timeLabel.setFont(font);
            add(timeLabel);
            Property time = new Property("");
            time.setBounds(190,10,745,30);
            time.setFont(font);
            add(time);

            Date startUpDate = null;
            Date installDate = null;
            try {
                startUpDate = new SimpleDateFormat("yyyyMMddHHmmSS").parse(startT.nextToken());
                installDate = new SimpleDateFormat("yyyyMMddHHmmSS").parse(installT.nextToken());
                startUpMills = startUpDate.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat smf = new SimpleDateFormat("HH:mm:SS dd.MM.yyyy");
            add(new Property("Дата и время запуска системы: "+smf.format(startUpDate),50));
            add(new Property("Дата и время установки(обновления) ОС: "+smf.format(installDate)));
            new Thread(()->{
                long millis, second, minute, hour, days;
                millis = new Date().getTime() - startUpMills;
                while (true) {
                    second = (millis / 1000) % 60;
                    minute = (millis / (1000 * 60)) % 60;
                    hour = (millis / (1000 * 60 * 60)) % 24;
                    days = (millis / (1000 * 60 * 60 * 24)) % 356;
                    time.setText(String.format("%1d:%02d:%02d:%02d", days, hour, minute, second));
                    updateUI();
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    millis += 1000;
                }
            }).start();
            remove(loading);
            setPreferredSize(new Dimension(740, Property.counter));
            updateUI();
        }).start();
    }
}
