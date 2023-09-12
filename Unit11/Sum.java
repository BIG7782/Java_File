
package Unit11;
import javax.swing.*; 
import java.awt.event.*;
public class Sum {
    public static void main(String[] args)
    {
        JFrame f = new JFrame ("Sum");
        
        JLabel lblFirstNumber= new JLabel("First Number: ");
        lblFirstNumber.setBounds(10,30,150,20);
        f.add(lblFirstNumber);
        
        JTextField txtFirstNumber= new JTextField();
        txtFirstNumber.setBounds(150,30,150,20);
        f.add(txtFirstNumber);
        
        JLabel lblSecondNumber= new JLabel("Second Number: ");
        lblSecondNumber.setBounds(10,70,150,20);
        f.add(lblSecondNumber);
        
        JTextField txtSecondNumber= new JTextField();
        txtSecondNumber.setBounds(150,70,150,20);
        f.add(txtSecondNumber);
        
        JLabel lblResult= new JLabel("Result: ");
        lblResult.setBounds(10,110,150,20);
        f.add(lblResult);
        
        JTextField txtResult= new JTextField();
        txtResult.setBounds(150,110,150,20);
        f.add(txtResult);
        
        JButton btnSum = new JButton("Sum");
        btnSum.setBounds(10,150,100,20);
        f.add(btnSum);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(150,150,100,20);
        f.add(btnCancel);
        
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
       btnSum.addActionListener(new ActionListener()
        
        {
            public void actionPerformed(ActionEvent ae)
            {
                int a=Integer.parseInt(txtFirstNumber.getText());
                int b=Integer.parseInt(txtSecondNumber.getText());
                int s=a+b;
                txtResult.setText(" "+s);
            }
        }
        
        );
       
        btnCancel.addActionListener(new ActionListener()
        
        {
            public void actionPerformed(ActionEvent ae)
            {
                txtFirstNumber.setText(" ");
                txtSecondNumber.setText(" ");
                txtResult.setText(" ");
            }
        }
        
        );
        
    }
}
