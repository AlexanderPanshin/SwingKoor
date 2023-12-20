package listiner;

import gui.BasePanel;
import logik.Dot;
import logik.Line;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteLine implements ActionListener {
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
            DefaultTableModel model = (DefaultTableModel) BasePanel.getHeaderKoordinate().getRightHK().getTable().getModel();
            int deletRow = 0;
            if(BasePanel.getMassLine().getMassLine().remove(new Line(new Dot(startX,startY),new Dot(endX,endY)))){
                boolean iter = false;
                for(int row = 0; row < model.getRowCount();row++){
                    if (model.getValueAt(row,0)!=null) {
                        if (model.getValueAt(row, 0).equals(startX)&&model.getValueAt(row, 1).equals(startY)
                        && model.getValueAt(row, 2).equals(endX) && model.getValueAt(row, 3).equals(endY)){
                            deletRow = row;
                            iter = true;
                        }
                    }
                }
                if(iter){
                    model.removeRow(deletRow);
                }
            }
        }
    }
}
