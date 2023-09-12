
package LabReport;

import java.awt.Frame;
import java.awt.Label;
import javax.swing.*;
import java.awt.event.*;
//public class EvenOrOdd implements MouseListener{JLabel lblNum,lblResult;
    public class EvenOrOdd extends Frame implements MouseListener {
    Label l;
    EvenOrOdd(){
        addMouseListener(this);
        l=new Label();
       l.setBounds(20,50,200,20);
       add(l);
     
      
       
        setTitle("Even Or Odd");
        setSize(300,500);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
      @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse is Exited");
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        l.setText("Mouse is Clicked");
    } 
    
    @Override
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse is Released");
    }

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
