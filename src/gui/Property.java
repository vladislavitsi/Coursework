package gui;

import gui.menuActivities.Activity;

import javax.swing.*;

public class Property extends JLabel {

    public static int counter;

    public Property(String text, int y){
        super(text);
        counter = y;
        setFont(Activity.fontSmall);
        setBounds(15,counter,745,30);
        counter+=40;
    }

    public Property(String text){
        super(text);
        setFont(Activity.fontSmall);
        setBounds(15,counter,745,30);
        counter+=40;
    }
}
