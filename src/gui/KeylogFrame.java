package gui;

import javax.swing.*;
import java.awt.*;

public class KeylogFrame extends JFrame {
    private final Font font = new Font("dd",Font.TRUETYPE_FONT,12);
    private JPanel panel;

    KeylogFrame(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Информация об использовании мышки");
        setBounds((Toolkit.getDefaultToolkit().getScreenSize().width/2)-200,(Toolkit.getDefaultToolkit().getScreenSize().height/2)-175,400, 250);
        setLayout(new BorderLayout());
        setResizable(false);
        addComponents();
        setVisible(true);
    }

    private void addComponents(){
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel, BorderLayout.CENTER);
    }
}
