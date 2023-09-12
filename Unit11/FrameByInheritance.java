
package Unit11;
import javax.swing.*;
public class FrameByInheritance extends JFrame {
    FrameByInheritance()
    {
        setTitle("Frame by Inheritance");
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public static void main (String args[])
    {
        new FrameByInheritance();
    }
}

