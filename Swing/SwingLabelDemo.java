import javax.swing.*;

public class SwingLabelDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Label Example");

        JLabel l = new JLabel("Welcome to Swing");

        l.setBounds(150,100,150,30);

        f.add(l);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}