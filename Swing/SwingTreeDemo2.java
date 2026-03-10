import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class SwingTreeDemo2
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JTree Example");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer");

        DefaultMutableTreeNode drive1 = new DefaultMutableTreeNode("C Drive");
        DefaultMutableTreeNode drive2 = new DefaultMutableTreeNode("D Drive");

        root.add(drive1);
        root.add(drive2);

        drive1.add(new DefaultMutableTreeNode("Program Files"));
        drive1.add(new DefaultMutableTreeNode("Users"));

        drive2.add(new DefaultMutableTreeNode("Movies"));
        drive2.add(new DefaultMutableTreeNode("Music"));

        JTree tree = new JTree(root);
        f.add( tree);

        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}   