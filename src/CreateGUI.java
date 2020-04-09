import javax.swing.*;

public class CreateGUI {
    public static void createAndShowGUI(){
        JPanel panel = new JPanel(null);
        //Creating navigation buttons

        Menu menu = new Menu();
        menu.creatingMenu(panel);

        //nazwalabela.setbounds(x,y,width,height)

        menu.addStudent.addActionListener(actionEvent -> {
            InterfaceAdd interfaceAdd = new InterfaceAdd();
            interfaceAdd.creatingInterfaceAdd(panel);
            panel.repaint();
        });

        menu.showStudent.addActionListener(actionEvent -> {


        });

        menu.editStudent.addActionListener(actionEvent -> {


        });

        menu.deleteStudent.addActionListener(actionEvent -> {


        });

        menu.searchStudent.addActionListener(actionEvent -> {


        });

        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(panel);
        mainFrame.setTitle("STUDENCI PJATK");
        mainFrame.setSize(1000, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }



}
