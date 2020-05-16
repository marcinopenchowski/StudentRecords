import javax.swing.*;

public class ShowPanel extends MyPanels{
    JTextField textFieldShow = new JTextField(20);

    public void display(JPanel panel){
        panel.add(textFieldShow);
    }
}
