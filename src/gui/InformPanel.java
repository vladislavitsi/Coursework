package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class InformPanel extends JScrollPane {
    InformPanel(){
        setBorder(new EmptyBorder(0,0,0,0));
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel panel = new JPanel();
        setViewportView(panel);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
    }
}
