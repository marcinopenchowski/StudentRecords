import javax.swing.*;

public class Menu extends MyPanel{

    JButton addStudent = new JButton("Dodaj");
    JButton showStudent = new JButton("Wyświetl");
    JButton searchStudent = new JButton("Wyszukaj");
    JPanel centerBorderLayout;

    public Menu(JPanel centerBorderLayout, AdditionPanel additionPanel, ShowPanel showPanel, SearchPanel searchPanel){
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
    }

        public void display(JPanel panel){
            panel.add(addStudent);
            panel.add(showStudent);
            panel.add(searchStudent);
    }

    public void show(MyPanel menuPanel){
        centerBorderLayout.removeAll();
        centerBorderLayout.repaint();
        menuPanel.display(centerBorderLayout);
        centerBorderLayout.revalidate();
    }
}
