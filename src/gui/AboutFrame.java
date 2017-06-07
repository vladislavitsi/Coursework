package gui;

import javax.swing.*;
import java.awt.*;

public class AboutFrame extends JFrame {

    private final Font font = new Font("dd",Font.TRUETYPE_FONT,12);
    private JPanel panel;

    AboutFrame(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("О программе");
        setIconImage(Toolkit.getDefaultToolkit().getImage("res\\icon_black.png"));
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
        new Label("Программа для получения информации о ПК",70);
        new Label("Разработана в рамках Курсового проекта по дисциплине:",90);
        new Label("СИСТЕМНОЕ ПРОГРАММНОЕ ОБЕСПЕЧЕНИЕ",110);
        new Label("Выполнили студенты группы АС-26:",130);
        new Label("Клещенко Владислав Вячеславович",150);
        new Label("Атрашков Алексей Игоревич",170);
        new Label("Сусло Константин Николаевич",190);
    }

    class Label extends JLabel{
        Label(String text, int y){
            super(text);
            setFont(font);
            setHorizontalAlignment(SwingConstants.CENTER);
            setBounds(10,y,380,15);
            panel.add(this);
        }
    }
}
