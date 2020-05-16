import javax.swing.*;

public class CreateGUI {
    public static void createAndShowGUI(){
        MyPanels myPanels = new MyPanels();
        StudentsList studentsList = new StudentsList();

        AdditionPanel additionPanel = new AdditionPanel(studentsList);
        ShowPanel showPanel = new ShowPanel();
        Menu menu = new Menu(myPanels.centerGridLayout, additionPanel, showPanel);
        menu.display(myPanels.leftGridLayout);



        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(myPanels.panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
