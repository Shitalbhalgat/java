// Anonumous Inner class: 1)An anonymous inner class is a class that is defined and
//                        instantiated in a single expression. 
//                        2)It is used to create an instance of a class that implements an interface or
//                          extends a class without having to define a separate named class.
//                       3)It is often used in event handling, where you want to define the behavior of an event listener
//                         without having to create a separate class for it.

import javax.swing.*;
import java.awt.event.*;

public class EventExamplewithAnonymousInnerClass
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Event Example");

        JButton b = new JButton("Click Me");

        b.setBounds(100,100,100,30);

        // registering the ActionListener to the button using an anonymous inner class
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Button Clicked");
            }
        });

        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}