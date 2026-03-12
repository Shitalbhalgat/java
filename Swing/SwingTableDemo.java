// JTable is a component in Swing used to display data in rows and columns like a spreadsheet.
// It is part of the javax.swing package and provides a powerful and flexible way to display and 
// manipulate tabular data.
import javax.swing.*;

public class SwingTableDemo
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();

        String data[][] = {
                {"John","20","Mumbai"},
                {"Anna","21","Delhi"},
                {"Rahul","22","Pune"}
        };

        String column[] = {"Name","Age","City"};

        JTable table = new JTable(data,column);

        JScrollPane sp = new JScrollPane(table);

        f.add(sp);

        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}