import javax.swing.*;
import java.awt.*;

public class ShowPanel extends MyPanel {
    JTextField textFieldShow = new JTextField(20);
    JButton editStudent = new JButton("Edytuj");
    JButton deleteStudent = new JButton("Usuń");


    public ShowPanel(){
        westGridLayout.add(editStudent);
        westGridLayout.add(deleteStudent);
        addActionListener();
    }

    public void display(JPanel panel){
        panel.add(westGridLayout, BorderLayout.WEST);
        panel.add(textFieldShow, BorderLayout.CENTER);
    }

    public void addActionListener(){
        editStudent.addActionListener(actionEvent -> {


        });

        deleteStudent.addActionListener(actionEvent -> {


        });
    }
}
