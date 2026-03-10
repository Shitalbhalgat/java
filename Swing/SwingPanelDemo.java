// JPanel : 1)JPanel is a container in Java Swing used to group and organize components like buttons,
//             labels, text fields, etc. inside a window.
//           2) Usually it is placed inside a JFrame.
import javax.swing.*;
import java.awt.*;

public class SwingPanelDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();

        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);

        JButton b = new JButton("Click");

        p.add(b);

        f.add(p);

        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}