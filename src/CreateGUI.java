import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGUI {
    public static void createAndShowGUI(){
        JPanel panel = new JPanel();

        JButton addStudent = new JButton("Dodaj");
        JButton showStudent = new JButton("Wyświetl");
        JButton editStudent = new JButton("Edytuj");
        JButton deleteStudent = new JButton("Usuń");
        JButton searchStudent = new JButton("Wyszukaj");

        JTextField textField = new JTextField(50);
        textField.setEditable(true);

        JLabel labelName = new JLabel("Imie: ");
        JLabel labelSurname = new JLabel("Nazwisko: ");

        panel.add(addStudent);
        panel.add(showStudent);
        panel.add(editStudent);
        panel.add(deleteStudent);
        panel.add(searchStudent);

        addStudent.addActionListener(actionEvent -> {
            panel.add(labelName);
            panel.add(textField);
            panel.add(labelSurname);
            panel.add(textField);
            panel.revalidate();
        });

        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
