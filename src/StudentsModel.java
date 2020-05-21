import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class StudentsModel extends DefaultTableModel{

    public StudentsModel() {
        for(String headers : new String[] {
                "Imię", "Nazwisko", "Kierunek Studiów", "Rok Studiów", "Średnia ocen"
        }){
            addColumn(headers);
        }

    }

    @Override
    public int getRowCount() {
        return super.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }

    @Override
    public String getColumnName(int column) {
        return super.getColumnName(column);
    }

    @Override
    public Object getValueAt(int row, int column) {
        return super.getValueAt(row, column);
    }

}
