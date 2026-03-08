// JCheckBox is a component in Swing used to select or deselect options.
// It allows the user to choose multiple options at the same time.
import javax.swing.*;

public class SwingCheckBoxDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("CheckBox Example");

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Python");

        c1.setBounds(100,100,100,30);
        c2.setBounds(100,140,100,30);

        f.add(c1);
        f.add(c2);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}