// 1)A progress bar is a graphical user interface element that visually represents the progress of a task
//  or operation.
// 2)It typically consists of a horizontal bar that fills up as the task progresses, 
//    providing users with feedback on how much of the task has been completed and how much is remaining. 
// 3)Progress bars are commonly used in applications to indicate the status of tasks such as file downloads,
//  installations, or any long-running processes.

import javax.swing.*;
public class SwingProgressBar
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Progress Bar");

        JProgressBar pb = new JProgressBar();

        pb.setBounds(100,100,200,30);

        pb.setValue(150);
        pb.setStringPainted(true);

        f.add(pb);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}