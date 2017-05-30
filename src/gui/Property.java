package gui;

import gui.menuActivities.Activity;

import javax.swing.*;

public class Property extends JLabel {

    public static int counter;

    public Property(String text, int y){
        super(text);
        if(text.length()>70){
            setToolTipText(text);
        }
        counter = y;
        setFont(Activity.fontSmall);
        setBounds(15,counter,745,30);
        counter+=40;
    }

    public Property(String text){
        super(text);
        if(text.length()>70){
            setToolTipText(text);
        }
        setFont(Activity.fontSmall);
        setBounds(15,counter,745,30);
        counter+=40;
    }
}
