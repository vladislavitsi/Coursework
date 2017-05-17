import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ClickThrough {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Test");
        f.setAlwaysOnTop(true);
        Component c = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setColor(Color.gray);
                int w = getWidth();
                int h = getHeight();
                g2.fillRect(0, 0, w,h);
                g2.setComposite(AlphaComposite.Clear);
                g2.fillRect(0, 0, w, h);
            }
        };
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
        f.setUndecorated(true);
        f.getContentPane().add(c);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
        f.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println(e.getXOnScreen());
            }
        });
        com.sun.awt.AWTUtilities.setWindowOpaque(f,false);
    }

}