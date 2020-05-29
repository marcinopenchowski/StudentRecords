import javax.swing.*;
import java.io.*;


public class Menu extends MyPanel{

    JButton addStudent = new JButton("Dodaj");
    JButton showStudent = new JButton("Wyświetl");
    JButton saveStudent = new JButton("Zapisz");
    JPanel centerBorderLayout;


    public Menu(JPanel centerBorderLayout, AdditionPanel additionPanel, ShowPanel showPanel, StudentsTableModel studentsTableModel){
        this.centerBorderLayout = centerBorderLayout;
        show(showPanel);
        addStudent.addActionListener(actionEvent -> {
            show(additionPanel);
        });
        showStudent.addActionListener(actionEvent -> {
            show(showPanel);

        });

        saveStudent.addActionListener(actionEvent -> {
                saveToFile(studentsTableModel);
        });
    }

        public void display(JPanel panel){
            panel.add(addStudent);
            panel.add(showStudent);
            panel.add(saveStudent);
    }

    public void show(MyPanel menuPanel){
        centerBorderLayout.removeAll();
        centerBorderLayout.repaint();
        menuPanel.display(centerBorderLayout);
        centerBorderLayout.revalidate();
    }

    public void saveToFile(StudentsTableModel studentsTableModel){

        try {
            File file = new File("students.txt");
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i = 0; i < studentsTableModel.getStudentsTable().getRowCount(); i++){
                for(int j = 0; j < studentsTableModel.getStudentsTable().getColumnCount(); j++){
                    bufferedWriter.write(studentsTableModel.getStudentsTable().getModel().getValueAt(i, j) + " ");
                }
                bufferedWriter.write("\n");
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(panel, "Plik jest tylko do odczytu.", "Błąd",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
