import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;



public class ShowPanel extends MyPanel {
    JButton editStudent = new JButton("Edytuj");
    JButton deleteStudent = new JButton("Usuń");
    JTextField textFieldSearching = new JTextField();
    JButton searchStudent = new JButton("Szukaj");
    /*JButton searchAvgMax = new JButton("<html>AVG<br>max</html>");
    JButton searchAvgMin = new JButton("<html>AVG<br>min</html>");
    JTextField textFieldAvgMax = new JTextField();
    JTextField textFieldAvgMin = new JTextField();*/
    boolean myBooleanEdit = false;


    public ShowPanel(StudentsTableModel studentsTableModel){
        westGridLayout.add(editStudent);
        westGridLayout.add(deleteStudent);
        centerBorderLayout.add(studentsTableModel.getScrollPane(), BorderLayout.CENTER);
        centerGridLayout.add(textFieldSearching);
        centerGridLayout.add(searchStudent);
        /*eastGridLayout.add(textFieldAvgMin);
        eastGridLayout.add(searchAvgMin);
        eastGridLayout.add(textFieldAvgMax);
        eastGridLayout.add(searchAvgMax);*/


        centerBorderLayout.add(centerGridLayout, BorderLayout.SOUTH);

        addActionListener(studentsTableModel);
        JComboBox studyMajorList = new JComboBox(StudyMajors.values());
        TableColumn studyMajorColumn = studentsTableModel.getStudentsTable().getColumnModel().getColumn(2);
        studyMajorColumn.setCellEditor(new DefaultCellEditor(studyMajorList));


    }

    public JTextField getTextFieldSearching() {
        return textFieldSearching;
    }

    public void display(JPanel panel){
        panel.add(westGridLayout, BorderLayout.WEST);
        panel.add(eastGridLayout, BorderLayout.EAST);
        panel.add(centerBorderLayout, BorderLayout.CENTER);
    }

    public void addActionListener(StudentsTableModel studentsTableModel){
        editStudent.addActionListener(actionEvent -> {
            studentsTableModel.getStudentsTable().setEnabled(!myBooleanEdit);
            myBooleanEdit = !myBooleanEdit;
            if(myBooleanEdit) {
                editStudent.setText("<html>Przestań<br>Edytować</html>");
            }else
                editStudent.setText("Edytuj");
        });

        deleteStudent.addActionListener(actionEvent -> {
            try {
                studentsTableModel.removeRow(studentsTableModel.getStudentsTable().getSelectedRows());
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(panel,"Żaden student nie został wybrany","Błąd",
                        JOptionPane.WARNING_MESSAGE);
                }
        });

        searchStudent.addActionListener(actionEvent -> {

                    studentsTableModel.getTableRowSorter().setRowFilter(RowFilter.regexFilter(getTextFieldSearching().getText()));
                    studentsTableModel.getStudentsTable().setRowSorter(studentsTableModel.getTableRowSorter());
            });
        //DOESN'T WORK, I Don't Know WHY
        /*searchAvgMin.addActionListener(actionEvent -> {
            studentsTableModel.getTableRowSorter().setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, Double.parseDouble(getTextFieldAvgMin().getText()), 4));
            studentsTableModel.getStudentsTable().setRowSorter(studentsTableModel.getTableRowSorter());
        });

        searchAvgMax.addActionListener(actionEvent -> {
            studentsTableModel.getTableRowSorter().setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, Double.parseDouble(getTextFieldAvgMax().getText()),4));
            studentsTableModel.getStudentsTable().setRowSorter(studentsTableModel.getTableRowSorter());

        });*/
    }

}
