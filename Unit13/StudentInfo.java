
package Unit13;
import SingleLevelInheritence.java;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentInfo {
    StudentInfo(){
         JFrame f = new JFrame("Student Info");
        
        JLabel lblRollNumber=new JLabel("Roll Number");
        lblRollNumber.setBounds(10,10,150,20);
        f.add(lblRollNumber);
        
        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setBounds(100,10,150,20);
        f.add(txtRollNumber);
        
        JLabel lblName =new JLabel ("Name");
        lblName.setBounds(10,40,150,20);
        f.add(lblName);
        
        JTextField txtName=new JTextField();
        txtName.setBounds(100,40,150,20);
        f.add(txtName);
        
        JLabel lblAddress=new JLabel("Address");
        lblAddress.setBounds(10,70,160,20);
        f.add(lblAddress);
        
        JTextField txtAddress=new JTextField();
        txtAddress.setBounds(100,70,150,20);
        f.add(txtAddress);
        
        JButton btnInsert = new JButton("Insert");
        btnInsert.setBounds(20,110,80,20);
        f.add(btnInsert);
        
        btnInsert.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/st_info","root","");
                    String sql="insert into student(ID,Rollno,Name,Address) values(NULL,?,?,?)";//why we have given null in id cause we have given auto increment option
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setInt(1,Integer.parseInt(txtRollNumber.getText()));
                    pst.setString(2,txtName.getText());
                    pst.setString(3,txtAddress.getText());
                    pst.executeUpdate();
                    if(pst.getUpdateCount()>0)
                    JOptionPane.showMessageDialog(null,"Data Inserted Sucessfully");
                }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null,e);
                }
            }
        }
        );
           f.setSize(400,500);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            
    }
    
public static void main(String[] args)
        {
            new StudentInfo();
}
}

