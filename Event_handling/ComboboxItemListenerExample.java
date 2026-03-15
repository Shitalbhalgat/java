import javax.swing.*;
import java.awt.event.*;

public class ComboboxItemListenerExample
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();

        String lang[] = {"Java","Python","C++"};

        JComboBox cb = new JComboBox(lang);
        cb.setBounds(100,100,100,30);

        cb.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println(cb.getSelectedItem());
            }
        });

        f.add(cb);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}