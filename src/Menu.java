import javax.swing.*;

public class Menu {

    JButton addStudent = new JButton("Dodaj");
    JButton showStudent = new JButton("Wyświetl");
    JButton editStudent = new JButton("Edytuj");
    JButton deleteStudent = new JButton("Usuń");
    JButton searchStudent = new JButton("Wyszukaj");


        public void creatingMenu(JPanel panel){
            addStudent.setBounds(5, 10, 100, 25);
            showStudent.setBounds(5, 45, 100, 25);
            editStudent.setBounds(5, 80, 100, 25);
            deleteStudent.setBounds(5, 115, 100, 25);
            searchStudent.setBounds(5, 150, 100, 25);

            panel.add(addStudent);
            panel.add(showStudent);
            panel.add(editStudent);
            panel.add(deleteStudent);
            panel.add(searchStudent);
    }
}
