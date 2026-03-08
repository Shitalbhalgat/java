import javax.swing.*;

public class SwingButtonDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");

        JButton b = new JButton("Click Me");

        b.setBounds(150,100,100,40);

        f.add(b);   

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("b");
    }
}