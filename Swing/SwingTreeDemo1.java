// 1)JTree is a component in Swing used to display data in a hierarchical tree structure.
//2) It is often used to represent file systems, organizational charts, or any data that has
//   a parent-child relationship.
// 3) The JTree component is built using the TreeModel interface, which defines the structure of the tree.
// 4) The DefaultMutableTreeNode class is commonly used to create nodes in the tree.

// constructor :JTree() - creates a tree with a default root node.
//             JTree(Object[] value) - creates a tree with the specified array of objects as the root nodes.
//             JTree(TreeNode root) - creates a tree with the specified TreeNode as the root.
//      
//NOTE: Internally Swing still creates a root node, but it is hidden,so only the items appear as the top-level nodes 
// in the tree.
        // Example: If you create a JTree with an array of strings,
        //  each string will be treated as a top-level node in the tree,
        //  and there will be an implicit root node that is not displayed.

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class SwingTreeDemo1
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Tree Example");

        String data[] = {"Java","Python","C","C++"};

        JTree tree = new JTree(data);

        tree.setBounds(50,50,150,200);

        f.add(tree);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   