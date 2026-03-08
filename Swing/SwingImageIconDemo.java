// ImageIcon is a class in Swing used to display images in GUI components such as JLabel, buttons, etc
import javax.swing.*;

public class SwingImageIconDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Image Example");

        ImageIcon icon = new ImageIcon("pic.png");

        JLabel label = new JLabel(icon);

        label.setBounds(50,50,300,200);

        f.add(label);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}