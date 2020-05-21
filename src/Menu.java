import javax.swing.*;
import java.io.*;


public class Menu extends MyPanel{

    JButton addStudent = new JButton("Dodaj");
    JButton showStudent = new JButton("Wyświetl");
    JButton searchStudent = new JButton("Wyszukaj");
    JButton saveStudent = new JButton("Zapisz");
    JPanel centerBorderLayout;

    public Menu(JPanel centerBorderLayout, AdditionPanel additionPanel, ShowPanel showPanel, SearchPanel searchPanel, JTable studentsTable){
        this.centerBorderLayout = centerBorderLayout;
        addStudent.addActionListener(actionEvent -> {
            show(additionPanel);
        });
        showStudent.addActionListener(actionEvent -> {
            show(showPanel);

        });
        searchStudent.addActionListener(actionEvent -> {
            show(searchPanel);

        });
        saveStudent.addActionListener(actionEvent -> {
            try {
            File file = new File("students.txt");
            if(!file.exists()){
                file.createNewFile();
            }


                FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for(int i = 0; i < studentsTable.getRowCount(); i++){
                    for(int j = 0; j < studentsTable.getColumnCount(); j++){
                        bufferedWriter.write(studentsTable.getModel().getValueAt(i, j) + " ");
                    }
                    bufferedWriter.write("\n");
                }

                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        });
    }

        public void display(JPanel panel){
            panel.add(addStudent);
            panel.add(showStudent);
            panel.add(searchStudent);
            panel.add(saveStudent);
    }

    public void show(MyPanel menuPanel){
        centerBorderLayout.removeAll();
        centerBorderLayout.repaint();
        menuPanel.display(centerBorderLayout);
        centerBorderLayout.revalidate();
    }
}
