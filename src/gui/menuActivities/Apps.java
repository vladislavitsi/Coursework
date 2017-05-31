package gui.menuActivities;

import gui.SideMenu;
import handling.WMIHandler;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.Comparator;

public class Apps extends Activity {
    public Apps(){
        new Thread(()->{
            JTable table;
            Loading loading = new Loading();
            add(loading);
            String info = WMIHandler.getWMIValue("app.vbs");
            String[] infos = info.split("\r\n");
            Object objects[][] = new Object[(infos.length/4)][4];
            Object headers[] = {"Процесс","Идентификатор","Приоритет","Количество потоков"};
            int k=0;
            for(int i=0;i<(infos.length/4);i++){
                for(int j=0;j<4;j++){
                    objects[i][j] = infos[k++];
                }
            }
            remove(loading);
            table = new JTable(objects,headers){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            table.setRowHeight(30);
            table.setFont(Activity.fontSmall);
            table.setColumnSelectionAllowed(true);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBorder(new EmptyBorder(0,0,0,0));
            table.setSelectionBackground(SideMenu.enteredButtonColor);
            table.setGridColor(new Color(245,245,245));
            table.getTableHeader().setBackground(new Color(245,245,245));
            table.getTableHeader().setBorder(new EmptyBorder(0,0,0,0));
            table.getTableHeader().setFont(Activity.fontSmall);
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
            Comparator<String> comparator = Comparator.comparingInt(Integer::valueOf);
            sorter.setComparator(1,comparator);
            sorter.setComparator(2,comparator);
            sorter.setComparator(3,comparator);
            table.setRowSorter(sorter);
            add(scrollPane);
            scrollPane.setBounds(0,0,745,613);
            setPreferredSize(new Dimension(740, 613));
            updateUI();
        }).start();
    }
}
