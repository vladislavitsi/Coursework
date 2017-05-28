package gui;

import java.awt.*;

/**
 * Created by vladi on 28.05.2017.
 */
public class IProperty extends Property{
    public IProperty(String text) {
        super(text);
        setFont(new Font("italic",Font.ITALIC,14));
        setBounds(40,Property.counter-40,745,30);
    }
}