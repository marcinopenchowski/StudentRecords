import javax.swing.*;
import java.awt.*;

public class Menu {

    JButton addStudent = new JButton("Dodaj");
    JButton showStudent = new JButton("Wyświetl");
    JButton editStudent = new JButton("Edytuj");
    JButton deleteStudent = new JButton("Usuń");
    JButton searchStudent = new JButton("Wyszukaj");
    JPanel centerPanel;

    public Menu(JPanel centerPanel, AdditionPanel additionPanel, ShowPanel showPanel){
        this.centerPanel = centerPanel;

        addStudent.addActionListener(actionEvent -> {
            show(additionPanel);
        });
        showStudent.addActionListener(actionEvent -> {
            show(showPanel);

        });
        editStudent.addActionListener(actionEvent -> {


        });

        deleteStudent.addActionListener(actionEvent -> {


        });

        searchStudent.addActionListener(actionEvent -> {


        });
    }

        public void display(JPanel panel){
            panel.add(addStudent);
            panel.add(showStudent);
            panel.add(editStudent);
            panel.add(deleteStudent);
            panel.add(searchStudent);
    }

    public void show(MyPanels additionPanel){
        centerPanel.removeAll();
        centerPanel.repaint();
        additionPanel.display(centerPanel);
        centerPanel.revalidate();
    }
}
