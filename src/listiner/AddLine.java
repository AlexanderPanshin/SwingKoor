package listiner;

import gui.BasePanel;
import logik.Line;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLine implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(!BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getLeftPanel().isEmpathy() &&
        !BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getRightPanel().isEmpathy()){
            String startxString = BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getLeftPanel().getStartXarea().getText();
            String stratyString = BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getLeftPanel().getStartYarea().getText();
            String endxString = BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getRightPanel().getEndXarea().getText();
            String endyString = BasePanel.getHeaderKoordinate().getLeftHK().getTopPanel().getRightPanel().getEndYarea().getText();
            Integer startX = Integer.parseInt(startxString);
            Integer startY = Integer.parseInt(stratyString);
            Integer endX = Integer.parseInt(endxString);
            Integer endY = Integer.parseInt(endyString);
            BasePanel.getMassLine().getMassLine().add(new Line(startX,startY,endX,endY));
            DefaultTableModel model = (DefaultTableModel) BasePanel.getHeaderKoordinate().getRightHK().getTable().getModel();
            model.insertRow(0,new Integer[]{startX,startY,endX,endY});
        }
    }
}
