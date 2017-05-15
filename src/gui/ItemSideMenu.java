package gui;

import javax.swing.*;
import java.awt.*;

public class ItemSideMenu extends JLabel{

    private boolean pressed;

    ItemSideMenu(String text){
        super(text);
        setHorizontalAlignment(CENTER);
        setFont(new Font("ItemSideFont",Font.TRUETYPE_FONT,16));
        setOpaque(true);
        setBackground(Color.WHITE);
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }
}
