import javax.swing.*;

public class CreateGUI {
    public static void createAndShowGUI(){
        MyPanel myPanel = new MyPanel();
        StudentsList studentsList = new StudentsList();

        AdditionPanel additionPanel = new AdditionPanel(studentsList);
        ShowPanel showPanel = new ShowPanel();
        SearchPanel searchPanel = new SearchPanel();

        Menu menu = new Menu(myPanel.getCenterBorderLayout(), additionPanel, showPanel, searchPanel);
        menu.display(myPanel.northGridLayout);



        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(myPanel.panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
