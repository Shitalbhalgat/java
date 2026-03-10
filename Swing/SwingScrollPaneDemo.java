// 1)JScrollPane is a component in Swing used to add horizontal and vertical scroll bars 
// to another component when the content is larger than the display area.
// 2)It is commonly used with:JTextArea, JList,JTable

import javax.swing.*;
public class SwingScrollPaneDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("ScrollPane Example");

        JTextArea ta = new JTextArea(10,20);

        JScrollPane sp = new JScrollPane(ta);

        sp.setBounds(100,80,200,150);

        f.add(sp);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}