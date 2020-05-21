import javax.swing.*;
import javax.swing.table.TableColumn;
import java.io.IOException;

public class CreateGUI {
    public static void createAndShowGUI() throws IOException {
        MyPanel myPanel = new MyPanel();
        StudentsModel studentsModel = new StudentsModel();

        JTable studentsTable = new JTable(studentsModel);
        studentsTable.setEnabled(false);
        studentsTable.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(studentsTable);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        AdditionPanel additionPanel = new AdditionPanel(studentsModel);
        ShowPanel showPanel = new ShowPanel(scrollPane, studentsModel, studentsTable, additionPanel);
        SearchPanel searchPanel = new SearchPanel();

        Menu menu = new Menu(myPanel.getCenterBorderLayout(), additionPanel, showPanel, searchPanel, studentsTable);
        menu.display(myPanel.northGridLayout);



        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(myPanel.panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
