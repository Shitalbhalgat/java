import javax.swing.*;

public class SwingTextAreaDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("TextArea Example");

        JTextArea ta = new JTextArea();

        ta.setBounds(100,80,200,120);

        f.add(ta);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}