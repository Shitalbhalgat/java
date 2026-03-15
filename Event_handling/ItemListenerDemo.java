// ItemListener is used to handle item state changes in components like:JCheckBox ,JRadioButton,JComboBox
// When the user selects or deselects an item, an ItemEvent is generated.

import javax.swing.*;
import java.awt.event.*;

public class ItemListenerDemo 
{ 
   public static void main(String[] args)
    {
    JFrame f= new JFrame("ItemListener Example");
    JCheckBox c = new JCheckBox("Java");
    c.setBounds(100,100,100,30);

    c.addItemListener(new ItemListener()
    {
       public void itemStateChanged(ItemEvent e)
         {
            if(c.isSelected())
                System.out.println("Checkbox Selected");
            else
                System.out.println("Checkbox Deselected");
        }
    });
        
        f.add(c);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}