
package Unit11;
import javax.swing.*;
import java.awt.event.*;
public class FactorialCube implements MouseListener {
JLabel lblNum,lblResult;
        JButton btnResult;
        JTextField txtNum;
        FactorialCube()
        {
            JFrame f = new JFrame("Factorial and Cube");
            
            lblNum=new JLabel("Enter Number: ");
            lblNum.setBounds(10,20,150,20);
            f.add(lblNum); 
            
            txtNum=new JTextField();
            txtNum.setBounds(100,20,150,20);
            f.add(txtNum);
            
            lblResult=new JLabel();
            lblResult.setBounds(10,50,150,20);
            f.add(lblResult); 
            
            btnResult=new JButton("Result");
            btnResult.setBounds(60,100,100,20);
           btnResult.addMouseListener(this);
            
            f.add(btnResult);
            f.setSize(400,500);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
public static void main(String[] args)
{
    new FactorialCube();
}
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
         int n=Integer.parseInt(txtNum.getText());
        int fact=1,i;
        for(i=1;i<=n;i++)   
        {
            for(i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            lblResult.setText("Factorial "+fact);
    }
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int n=Integer.parseInt(txtNum.getText());
        int cube=n*n*n;
       lblResult.setText("Cube "+cube);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mouseExited(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
