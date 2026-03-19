// A MouseMotionEvent occurs when the mouse is moved or dragged over a component.

import javax.swing.*;
import java.awt.event.*;

public class MouseMotionExample implements MouseMotionListener
{
    JFrame f;
    JLabel l;

    MouseMotionExample()
    {
        f = new JFrame("Mouse Motion Event");
        l = new JLabel("Move Mouse");

        l.setBounds(100,100,200,30);

        f.add(l);

        f.addMouseMotionListener(this);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseMoved(MouseEvent e)
    {
        l.setText("X: " + e.getX() + " Y: " + e.getY());
    }

    public void mouseDragged(MouseEvent e)
    {
        l.setText("Dragging X: " + e.getX() + " Y: " + e.getY());
    }

    public static void main(String args[])
    {
        new MouseMotionExample();
    }
}