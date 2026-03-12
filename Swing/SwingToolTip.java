//A JToolTip is a feature in Swing that displays a small help message when the mouse pointer 
// is placed over a component.
// Example:
// When the mouse moves over a button, a small message appears like:  Click to Submit

import javax.swing.*;
public class SwingToolTip
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("ToolTip Example");

        JButton b = new JButton("Submit");

        b.setBounds(100,100,100,30);

        b.setToolTipText("Click to Submit Form");

        f.add(b);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}