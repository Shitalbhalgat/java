import javax.swing.*;
import java.awt.event.*;

public class withoutAnonymousInnerClass implements ActionListener
{
   withoutAnonymousInnerClass()
    {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Me");
        b.setBounds(100,100,120,30);

        // registering the ActionListener to the button
        b.addActionListener(this);

        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // overriding the actionPerformed method of ActionListener interface
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args)
    {
        new withoutAnonymousInnerClass();
    }
}