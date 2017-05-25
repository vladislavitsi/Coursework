package gui.menuActivities;

import javax.swing.*;

public class Property extends JLabel {

    private static int counter;

    Property(String text, int y){
        super(text);
        counter = y;
        setFont(Activity.fontSmall);
        setBounds(20,counter,600,30);
        counter+=40;
    }

    Property(String text){
        super(text);
        setFont(Activity.fontSmall);
        setBounds(20,counter,600,30);
        counter+=40;
    }
}
