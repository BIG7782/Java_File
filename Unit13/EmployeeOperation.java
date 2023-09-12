//qn45
package Unit13;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EmployeeOperation {
    EmployeeOperation()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
            for(int i=1;i<=5;i++)
            {
                String sql="insert into employee(EID,Ename,Salary,Department) value(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                Scanner sc=new Scanner(System.in);
                System.out.print("ID ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String Ename =sc.next();
                System.out.print("Salary: ");
                int Salary = sc.nextInt();
                 System.out.print("Department: ");
                String Department = sc.next();
                pst.setInt(1, id);
                pst.setString(2, Ename);
                pst.setInt(3, Salary);
                pst.setString(4, Department);
                pst.executeUpdate();

            }
            String sql="Select * from employee where Department='sales'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            System.out.println("EID\tName\tSalary\tDepartment");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void main(String[] args) {
        new EmployeeOperation();
    }
    
}
