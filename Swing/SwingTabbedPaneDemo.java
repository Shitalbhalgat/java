// JTabbedPane is a component in Swing used to organize multiple panels using tabs.
// Each tab contains a different component or panel.
// constructor : JTabbedPane(int tabPlacement)
                //tabPlacement can be JTabbedPane.TOP, 
                //                    JTabbedPane.BOTTOM,
                //                     JTabbedPane.LEFT, 
                //                     JTabbedPane.RIGHT
import javax.swing.*;
public class SwingTabbedPaneDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("TabbedPane Example");

        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(new JLabel("This is first tab"));
        p2.add(new JLabel("This is second tab"));

        tp.add("Tab1", p1);
        tp.add("Tab2", p2);

        f.add(tp);

        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}