// JRadioButton is a component in Swing used to select only one option from a group of options.
// To ensure only one option is selected, radio buttons are placed in a ButtonGroup.
import javax.swing.*;

public class SwingRadioButtonDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Radio Button Example");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(100,100,100,30);
        r2.setBounds(100,140,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}