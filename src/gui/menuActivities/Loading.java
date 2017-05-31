package gui.menuActivities;

import javax.swing.*;

public class Loading extends JLabel {
    Loading(){
        new Thread(()->{
            while (true){
                setText("Получение данных");
                for (int i=0;i<3;i++){
                    setText(getText()+".");
                    updateUI();
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                }
            }
        }).start();
        setFont(Activity.fontBig);
        setBounds(230,250,200,50);
    }
}
