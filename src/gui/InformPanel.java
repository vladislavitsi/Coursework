package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class InformPanel extends JScrollPane {

    private static InformPanel INSTANCE;
    private JPanel panel;

    private InformPanel(){
        setBorder(new EmptyBorder(0,0,0,0));
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel = new JPanel();
        setViewportView(panel);
        panel.setLayout(new BorderLayout());
        instruction(new JLabel());
    }

    static InformPanel getInformPanel(){
        if(INSTANCE==null){
            INSTANCE = new InformPanel();
        }
        return INSTANCE;
    }

    void addC(Component comp){
        panel.removeAll();
        panel.add(comp, BorderLayout.CENTER);
        updateUI();
    }

    void clear(){
        panel.removeAll();
        instruction(new JLabel());
        updateUI();
    }

    private void instruction(JLabel helpInstr){
        helpInstr.setText("                     Нажмите на любой пункт меню слева, для получения информации");
        helpInstr.setFont(new Font("font",Font.TRUETYPE_FONT,16));
        panel.add(helpInstr);
        panel.setBackground(new Color(245,245,245));
    }
}
