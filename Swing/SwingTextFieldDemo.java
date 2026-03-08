import javax.swing.*;

public class SwingTextFieldDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("TextField Example");

        JTextField t = new JTextField();

        t.setBounds(120,100,150,30);

        f.add(t);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}