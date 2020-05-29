import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    JPanel panel = new JPanel();

    JPanel northGridLayout = new JPanel();

    JPanel centerGridLayout = new JPanel();

    JPanel centerBorderLayout = new JPanel();

    JPanel westGridLayout = new JPanel();

    JPanel eastGridLayout = new JPanel();



    public MyPanel(){

        panel.setLayout(new BorderLayout(20, 20));

        centerBorderLayout.setLayout(new BorderLayout());
        panel.add(centerBorderLayout, BorderLayout.CENTER);


        northGridLayout.setLayout(new GridLayout(1, 0));
        panel.add(northGridLayout, BorderLayout.NORTH);

        centerGridLayout.setLayout(new GridLayout(0, 2,0, 20));

        westGridLayout.setLayout(new GridLayout(0, 1));

        eastGridLayout.setLayout(new GridLayout(0, 1));

    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getCenterBorderLayout() {
        return centerBorderLayout;
    }

    public void display(JPanel panel){

    }


}
