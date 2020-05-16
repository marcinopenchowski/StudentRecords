import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    JPanel panel = new JPanel();

    JPanel northGridLayout = new JPanel();

    JPanel centerGridLayout = new JPanel();

    JPanel centerBorderLayout = new JPanel();

    JPanel westGridLayout = new JPanel();



    public MyPanel(){
        panel.setLayout(new BorderLayout(20, 20));

        centerBorderLayout.setLayout(new BorderLayout());
        panel.add(centerBorderLayout, BorderLayout.CENTER);


        northGridLayout.setLayout(new GridLayout(1, 0, 0, 20));
        panel.add(northGridLayout, BorderLayout.NORTH);

        centerGridLayout.setLayout(new GridLayout(0, 2));

        westGridLayout.setLayout(new GridLayout(0, 1, 20, 100));

    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getNorthGridLayout() {
        return northGridLayout;
    }

    public void setNorthGridLayout(JPanel northGridLayout) {
        this.northGridLayout = northGridLayout;
    }

    public JPanel getCenterGridLayout() {
        return centerGridLayout;
    }

    public void setCenterGridLayout(JPanel centerGridLayout) {
        this.centerGridLayout = centerGridLayout;
    }

    public JPanel getCenterBorderLayout() {
        return centerBorderLayout;
    }

    public void setCenterBorderLayout(JPanel centerBorderLayout) {
        this.centerBorderLayout = centerBorderLayout;
    }

    public JPanel getWestGridLayout() {
        return westGridLayout;
    }

    public void setWestGridLayout(JPanel westGridLayout) {
        this.westGridLayout = westGridLayout;
    }

    public void display(JPanel panel){

    }


}
