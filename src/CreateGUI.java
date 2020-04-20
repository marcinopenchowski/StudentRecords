import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class CreateGUI {
    public static void createAndShowGUI(){
        JPanel panel = new JPanel(null);
        JFrame mainFrame = new JFrame();


        Menu menu = new Menu();
        menu.creatingMenu(panel);

        StudentsList studentsList = new StudentsList();

        menu.addStudent.addActionListener(actionEvent -> {

            InterfaceAdd interfaceAdd = new InterfaceAdd();
            interfaceAdd.creatingInterfaceAdd(panel);
            interfaceAdd.buttonApply.addActionListener(actionEvent1 -> {


                Student student  = new Student(interfaceAdd.getTextFieldName().getText(),
                        interfaceAdd.getTextFieldSurname().getText(),
                        (StudyMajors)interfaceAdd.studyMajorList.getSelectedItem(),
                        Integer.parseInt(interfaceAdd.getTextFieldYearOfStudy().getText()));

                studentsList.add(student);

                System.out.println(studentsList);


            });

            panel.repaint();
        });

        menu.showStudent.addActionListener(actionEvent -> {
            InterfaceShow interfaceShow = new InterfaceShow();
            interfaceShow.creatingInterfaceShow(panel);


            panel.repaint();

        });

        menu.editStudent.addActionListener(actionEvent -> {


        });

        menu.deleteStudent.addActionListener(actionEvent -> {


        });

        menu.searchStudent.addActionListener(actionEvent -> {


        });


        mainFrame.setContentPane(panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
