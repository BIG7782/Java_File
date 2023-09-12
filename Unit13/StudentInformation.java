
package Unit13;

import SingleLevelInheritence.java;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class StudentInformation {
    StudentInformation()
    {
        JFrame f = new JFrame("Student Information");
        
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
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(110,110,80,20);
        f.add(btnDelete);
        
        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(200,110,80,20);
        f.add(btnUpdate);
   
        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(290,110,80,20);
        f.add(btnSearch);
        
        btnInsert.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                    String sql="insert into tbstd(ID,Rollno,Name,Address) values(NULL,?,?,?)";//why we have given null in id cause we have given auto increment option
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
        
        btnDelete.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                    String sql="delete from tbstd where Rollno=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setInt(1,Integer.parseInt(txtRollNumber.getText()));
                     
                    pst.executeUpdate();
                    if(pst.getUpdateCount()>0)
                    JOptionPane.showMessageDialog(null,"Data deleted Sucessfully");
                    else
                        JOptionPane.showMessageDialog(null, "Data not found");
                }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null,e);
                }
            }
        }
        );
        
        btnUpdate.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                    String sql="update tbstd set Rollno=?,Name=?,Address=? where Rollno=?";//why we have given null in id cause we have given auto increment option
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setInt(1,Integer.parseInt(txtRollNumber.getText()));
                    pst.setString(2,txtName.getText());
                    pst.setString(3,txtAddress.getText());
                    pst.setInt(4,Integer.parseInt(txtRollNumber.getText()));
                    pst.executeUpdate();
                    if(pst.getUpdateCount()>0)
                    JOptionPane.showMessageDialog(null,"Data Updated Sucessfully: ");
                    else
                         JOptionPane.showMessageDialog(null,"Data not Found: ");
                }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null,e);
                }
            }
        }
        );
        
        btnSearch.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                    String sql="select * from tbstd where Rollno=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setInt(1,Integer.parseInt(txtRollNumber.getText()));
                    ResultSet rs=pst.executeQuery();
                    
                    if(rs.next())
                    {
                        txtName.setText(rs.getString("Name"));
                        txtAddress.setText(rs.getString("Address"));
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Data not Found");
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
            new StudentInformation();
}
}