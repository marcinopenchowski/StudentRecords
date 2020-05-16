import javax.swing.*;
import java.awt.*;

public class MyPanels extends JPanel{
    JPanel panel = new JPanel();
    JPanel centerGridLayout = new JPanel();
    JPanel leftGridLayout = new JPanel();


    public MyPanels(){
        panel.setLayout(new BorderLayout(20, 20));
        centerGridLayout.setLayout(new GridLayout(1, 0, 20, 20));
        panel.add(centerGridLayout, BorderLayout.CENTER);
        leftGridLayout.setLayout(new GridLayout(0, 1, 0, 20));
        panel.add(leftGridLayout, BorderLayout.WEST);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getCenterGridLayout() {
        return centerGridLayout;
    }

    public void setCenterGridLayout(JPanel centerGridLayout) {
        this.centerGridLayout = centerGridLayout;
    }

    public JPanel getLeftGridLayout() {
        return leftGridLayout;
    }

    public void setLeftGridLayout(JPanel leftGridLayout) {
        this.leftGridLayout = leftGridLayout;
    }

    public void display(JPanel panel){

    }


}
