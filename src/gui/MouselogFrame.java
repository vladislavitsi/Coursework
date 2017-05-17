package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouselogFrame extends JFrame {

    private final Font font = new Font("dd",Font.TRUETYPE_FONT,36);
    private JPanel panel;

    MouselogFrame(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Использование ввода");
        setAlwaysOnTop(true);
        setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/20,Toolkit.getDefaultToolkit().getScreenSize().height/10,400, 500);
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

        Label lX = new Label("X: ");
        lX.setBounds(40,20,50,50);
        Label lY = new Label("Y: ");
        lY.setBounds(220,20,50,50);
        panel.add(lX);
        panel.add(lY);

        Label dX = new Label("0");
        dX.setBounds(90,20,100,50);
        Label dY = new Label("0");
        dY.setBounds(270,20,100,50);
        panel.add(dX);
        panel.add(dY);
        new Thread(()->{
            while (true){
                dX.setText(Integer.toString(MouseInfo.getPointerInfo().getLocation().x));
                dX.repaint();
                dY.setText(Integer.toString(MouseInfo.getPointerInfo().getLocation().y));
                dY.repaint();
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    class Label extends JLabel{
        Label(String text){
            super(text);
            setFont(font);
        }
    }
}
