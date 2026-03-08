import javax.swing.*;
//By Extending JFrame, we can create a custom frame class and set its properties in the constructor.
 class MyFrame extends JFrame
{
     MyFrame()
    {
        setTitle("Swing Frame Example");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class SwingFrame {
    public static void main(String[] args) {

           new MyFrame();
        // Alternatively, we can create a JFrame object and set its properties directly.   
        JFrame f = new JFrame("My First Swing Frame");

        f.setSize(400,300);          // set frame size
        f.setVisible(true);                 // make frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}