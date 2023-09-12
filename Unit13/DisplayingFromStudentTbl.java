//qn44 this one is correct
package Unit13;
import SingleLevelInheritence.java;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Scanner;
public class DisplayingFromStudentTbl {
     DisplayingFromStudentTbl()
   {
         try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/st_info","root","");
            {
               String sql="select * from st_info  value(?,?,?,?)";
                    
                PreparedStatement pst = con.prepareStatement(sql);
           
            }
            String sql="Select * from student ";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            System.out.println("ID\tRollno\tName\tAddress");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void main(String[] args) {
        new DisplayingFromStudentTbl();
    }
    
}

  