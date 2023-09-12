
package Unit11;
import javax.swing.*;
import java.awt.event.*;
public class CalculateSquareGui {
     public static void main(String[] args) {
        JFrame f = new JFrame("Square Calculator ");
        
        JLabel lblNumber= new JLabel("Enter any Number: ");
        lblNumber.setBounds(10,30,150,20);
        f.add(lblNumber);
        
         JTextField txtNumber= new JTextField();
         txtNumber.setBounds(130,30,150,20);
         f.add(txtNumber);
         
         JButton btnSquare=new JButton("Calculate Square");
        btnSquare.setBounds(100, 65, 150, 20);
        f.add(btnSquare);
        
        JLabel lblResulte= new JLabel("Square of Enter Number:");
        lblResulte.setBounds(10,100,200,20);
        f.add(lblResulte);
        
        JTextField txtResult= new JTextField();
         txtResult.setBounds(150,100,150,20);
         f.add(txtResult);
          
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        btnSquare.addActionListener(new ActionListener()
        
        {
            public void actionPerformed(ActionEvent ae)
            {
                int a=Integer.parseInt(txtNumber.getText());
                int s=a*a;
                txtResult.setText(" "+s);
            }
        }
        );     
}
}
