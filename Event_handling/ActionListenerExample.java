import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");

        JLabel l = new JLabel("Original Text");
        l.setBounds(100,80,150,30);

        JButton b = new JButton("Click");
        b.setBounds(100,120,100,30);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Button Clicked");
            }
        });

        f.add(l);
        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}