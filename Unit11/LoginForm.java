
package Unit11;
import javax.swing.*;
public class LoginForm {
public static void main(String[] args)   
{
   JFrame f = new JFrame("Login Form");
        
        JLabel lblUsername= new JLabel("Username: ");
        lblUsername.setBounds(10,20,100,20);
        f.add(lblUsername);
        
         JTextField txtUsername= new JTextField();
         txtUsername.setBounds(100,20,150,20);
         f.add(txtUsername);
         
         JLabel lblPassword=new JLabel("Password: ");
         lblPassword.setBounds(10,50,100,20);
         f.add(lblPassword);
         
         JPasswordField txtPassword= new JPasswordField();
         txtPassword.setBounds(100,50,150,20);
         f.add(txtPassword);
         
         JButton btnLogin=new JButton("Login");
         btnLogin.setBounds(150, 100, 100, 20);
         f.add(btnLogin);

        f.setSize(300,200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
