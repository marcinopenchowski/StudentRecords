import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.*;
import java.util.Comparator;


public class StudentsTableModel extends DefaultTableModel{

    JTable studentsTable = new JTable();
    JScrollPane scrollPane = new JScrollPane(studentsTable);
    TableRowSorter tableRowSorter = new TableRowSorter();


    public StudentsTableModel() throws IOException {
        String[] headers = new String[] {"Imię", "Nazwisko", "Kierunek Studiów", "Rok Studiów", "Średnia ocen"};

        for(int i = 0; i < headers.length; i++){
            addColumn(headers[i]);
        }


        studentsTable.setEnabled(false);
        studentsTable.setRowSorter(tableRowSorter);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        fileReading();

    }


    public void setModels(StudentsTableModel studentsTableModel){
        studentsTableModel.studentsTable.setModel(studentsTableModel);
        studentsTableModel.tableRowSorter.setModel(studentsTableModel);

        tableRowSorter.setComparator(studentsTable.getColumnModel().getColumnIndex("Rok Studiów"), new Comparator(){

            public int compare(Object o1, Object o2) {
                int value1, value2;

                value1 = Integer.parseInt(String.valueOf(o1));
                value2 = Integer.parseInt(String.valueOf(o2));

                return value1 - value2;
            }
        });

        tableRowSorter.setComparator(studentsTable.getColumnModel().getColumnIndex("Średnia ocen"), new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                double value1, value2;

                value1 = Double.parseDouble(String.valueOf(o1));
                value2 = Double.parseDouble(String.valueOf(o2));

                return Double.compare(value1, value2);
            }
        });

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

    public void fileReading() throws IOException {
        File file = new File("students.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Object[] lines = bufferedReader.lines().toArray();

            for(int j = 0; j < lines.length; j++){
                String[] row = lines[j].toString().split(" ");
                addRow(row);
            }


        } catch (FileNotFoundException e) {
            file.createNewFile();
        }
    }


    public JTable getStudentsTable() {
        return studentsTable;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public TableRowSorter getTableRowSorter() {
        return tableRowSorter;
    }

    public void removeRow(int[] selectedRows) {
        for(int i = selectedRows.length - 1; i >= 0; i--) {
            removeRow(selectedRows[i]);

            System.out.println(selectedRows[i]);
        }

    }
}
