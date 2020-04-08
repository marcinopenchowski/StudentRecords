import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGUI {
    public static void createAndShowGUI(){
        JPanel panel = new JPanel(null);
        //Creating navigation buttons
        JButton addStudent = new JButton("Dodaj");
        addStudent.setBounds(5,10,100,25);
        JButton showStudent = new JButton("Wyświetl");
        showStudent.setBounds(5, 45, 100, 25);
        JButton editStudent = new JButton("Edytuj");
        editStudent.setBounds(5, 80, 100, 25);
        JButton deleteStudent = new JButton("Usuń");
        deleteStudent.setBounds(5, 115, 100, 25);
        JButton searchStudent = new JButton("Wyszukaj");
        searchStudent.setBounds(5, 150, 100, 25);


        JLabel labelName = new JLabel("Imie: ");
        labelName.setBounds(150, 10, 150, 25);
        JLabel labelSurname = new JLabel("Nazwisko: ");
        labelSurname.setBounds(150, 45, 150, 25);
        JLabel labelStudyMajor = new JLabel("Kierunek Studiów");
        labelStudyMajor.setBounds(150, 80, 150, 25);


        JTextField textFieldName = new JTextField(25);
        textFieldName.setBounds(260, 10, 200, 25);
        textFieldName.setEditable(true);
        JTextField textFieldSurname = new JTextField(25);
        textFieldSurname.setBounds(260, 45, 200, 25);
        textFieldSurname.setEditable(true);
        JComboBox studyMajorList = new JComboBox(StudyMajors.values());
        studyMajorList.setBounds(260, 80, 200, 25);

        panel.add(addStudent);
        panel.add(showStudent);
        panel.add(editStudent);
        panel.add(deleteStudent);
        panel.add(searchStudent);

        //nazwalabela.setbounds(x,y,width,height)

        addStudent.addActionListener(actionEvent -> {
            panel.add(labelName);
            panel.add(textFieldName);
            panel.add(labelSurname);
            panel.add(textFieldSurname);
            panel.add(labelStudyMajor);
            panel.add(studyMajorList);

            panel.repaint();

        });

        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
