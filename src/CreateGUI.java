import javax.swing.*;
import java.io.IOException;


public class CreateGUI{
    public static void createAndShowGUI() throws IOException {
        MyPanel myPanel = new MyPanel();
        StudentsTableModel studentsTableModel = new StudentsTableModel();
        studentsTableModel.setModels(studentsTableModel);
        AdditionPanel additionPanel = new AdditionPanel(studentsTableModel);
        ShowPanel showPanel = new ShowPanel(studentsTableModel);

        Menu menu = new Menu(myPanel.getCenterBorderLayout(), additionPanel, showPanel, studentsTableModel);
        menu.display(myPanel.northGridLayout);




        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(myPanel.panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
