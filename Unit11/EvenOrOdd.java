
package Unit11;
import javax.swing.*;
import java.awt.event.*;

public class EvenOrOdd {
    public static void main (String[] args)
            
    {
        JFrame f = new JFrame("Even Or Odd ");
        
        JLabel lblNumber= new JLabel("Enter Number: ");
        lblNumber.setBounds(10,30,150,20);
        f.add(lblNumber);
        
         JTextField txtNumber= new JTextField();
         txtNumber.setBounds(150,30,150,20);
         f.add(txtNumber);
         
         JButton btnCheck=new JButton("Check");
        btnCheck.setBounds(100, 65, 100, 20);
        f.add(btnCheck);
        
        JLabel lblResult= new JLabel();
         lblResult.setBounds(150,100,150,20);
         f.add(lblResult);
         
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
       
        btnCheck.addActionListener(new ActionListener()
        
        {
            public void actionPerformed(ActionEvent ae)
            {
                int a=Integer.parseInt(txtNumber.getText());
                if(a%2==0)
                    lblResult.setText("Even");
                else
                    lblResult.setText("Odd");
            }
        }
        
        );
        
    }
}
