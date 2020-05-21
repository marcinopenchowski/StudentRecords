import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.*;

public class ShowPanel extends MyPanel {
    JButton editStudent = new JButton("Edytuj");
    JButton deleteStudent = new JButton("Usuń");


    public ShowPanel(JScrollPane scrollPane, StudentsModel studentsModel, JTable studentsTable, AdditionPanel additionPanel){
        westGridLayout.add(editStudent);
        westGridLayout.add(deleteStudent);
        centerBorderLayout.add(scrollPane);
        addActionListener(studentsTable, studentsModel);

        TableColumn studyMajorColumn = studentsTable.getColumnModel().getColumn(2);
        studyMajorColumn.setCellEditor(new DefaultCellEditor(additionPanel.studyMajorList));


        File file = new File("students.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Object[] lines = bufferedReader.lines().toArray();

            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                studentsModel.addRow(row);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void display(JPanel panel){
        panel.add(westGridLayout, BorderLayout.WEST);
        panel.add(centerBorderLayout, BorderLayout.CENTER);
    }

    public void addActionListener(JTable studentsTable, StudentsModel studentsModel){
        editStudent.addActionListener(actionEvent -> {
            studentsTable.setEnabled(true);

        });

        deleteStudent.addActionListener(actionEvent -> {
            studentsModel.removeRow(studentsTable.getSelectedRow());

        });
    }
}
