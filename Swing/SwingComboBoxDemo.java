// JComboBox is a component in Swing used to display a drop-down list of items 
//     from which the user can select one option.
    import javax.swing.*;

public class SwingComboBoxDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("ComboBox Example");

        String country[] = {"India","USA","UK","Canada"};

        JComboBox cb = new JComboBox(country);

        cb.setBounds(120,100,100,30);

        f.add(cb);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}