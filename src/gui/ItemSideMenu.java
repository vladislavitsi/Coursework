package gui;

import javax.swing.*;
import java.awt.*;

class ItemSideMenu extends JLabel{

    private boolean pressed;
    private String cText;

    ItemSideMenu(String text, String cText){
        super(text);
        this.cText = cText;
        setHorizontalAlignment(CENTER);
        setFont(new Font("ItemSideFont",Font.TRUETYPE_FONT,16));
        setOpaque(true);
        setBackground(Color.WHITE);
    }

    public String getcText() {
        return cText;
    }

    boolean isPressed() {
        return pressed;
    }

    void setPressed(boolean pressed) {
        this.pressed = pressed;
    }
}
