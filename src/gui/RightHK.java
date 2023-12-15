package gui;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class RightHK extends JPanel {
    private JTable table;
    public RightHK() {
        table = new JTable(5,4);
        table.setTableHeader(null);
        setSizeColumn(table);
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setPreferredSize(new Dimension(250,150));
        add(jScrollPane);
    }
    private void setSizeColumn (JTable table) {
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++){
            TableColumn col = table.getColumnModel().getColumn(i);
        col.setMinWidth(30);
        col.setMaxWidth(60);
        col.setPreferredWidth(20);
    }
    }
    private Dimension setScrollPaneSize(JTable table) {
        int preferredWidth = table.getPreferredSize().width;
        int preferredHeight = table.getRowHeight() * table.getRowCount();
        Dimension preferredSize = new Dimension(preferredWidth, preferredHeight);
        //JScrollPane scrollPane = (JScrollPane) table.getParent().getParent();
        //scrollPane.setPreferredSize(preferredSize);
        return preferredSize;
    }
}
