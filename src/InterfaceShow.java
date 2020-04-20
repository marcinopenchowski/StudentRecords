import javax.swing.*;

public class InterfaceShow{
    JTextField textFieldShow = new JTextField(20);

    public void creatingInterfaceShow(JPanel panel){
        textFieldShow.setBounds(150, 10, 150, 25);
        panel.add(textFieldShow);
    }
}
