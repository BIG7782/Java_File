
package Unit11;
import javax.swing.*;
public class FormExample {
    public static void main(String args[])
    {
        JFrame f = new JFrame("Student Information ");
        
        JLabel lblRollno= new JLabel("Rollno");
        lblRollno.setBounds(10,20,100,20);
        f.add(lblRollno);
        
         JTextField txtRollno= new JTextField();
         txtRollno.setBounds(150,20,200,20);
         f.add(txtRollno);
         
         JLabel lblName=new JLabel("Name");
         lblName.setBounds(10,50,100,20);
         f.add(lblName);
         
         JTextField txtName= new JTextField();
         txtName.setBounds(150,50,200,20);
         f.add(txtName);
         
          JLabel lblAddress= new JLabel("Address");
        lblAddress.setBounds(10,80,100,20);
        f.add(lblAddress);
        
         JTextArea txtAddress= new JTextArea();
         txtAddress.setBounds(150,80,200,30);
         f.add(txtAddress);
         
         JLabel lblSubjects=new JLabel("Subjects");
         lblSubjects.setBounds(10,120,100,20);
         f.add(lblSubjects);
         
         
         JCheckBox chjava=new JCheckBox("OOP in Java");
         chjava.setBounds(150,120,200,20);
         f.add(chjava);
         
         JCheckBox chSAD=new JCheckBox("SAD");
         chSAD.setBounds(150,150,200,20);
         f.add(chSAD);
         
         
         JCheckBox chProbability=new JCheckBox("Probability and Statistics");
         chProbability.setBounds(150,180,200,20);
         f.add(chProbability);
         
         JCheckBox chWT=new JCheckBox("Web Tech");
         chWT.setBounds(150,210,200,20);
         f.add(chWT);
         
         JCheckBox chDSA=new JCheckBox("DSA");
         chDSA.setBounds(150,240,200,20);
         f.add(chDSA);
         
         JLabel lblGender=new JLabel("Gender");
         lblGender.setBounds(10,270,100,20);
         f.add(lblGender);
         
         JRadioButton rbtnMale = new JRadioButton("Male");
         rbtnMale.setBounds(150,270,70,20);
         f.add(rbtnMale);
         rbtnMale.setSelected(true);
         
         JRadioButton rbtnFemale = new JRadioButton("Female");
         rbtnFemale.setBounds(230,270,100,20);
         f.add(rbtnFemale);
         
         ButtonGroup btngroup = new ButtonGroup();
         btngroup.add(rbtnMale);
         btngroup.add(rbtnFemale);
         
         JLabel lblCollege=new JLabel("College");
         lblCollege.setBounds(10,300,100,20);
         f.add(lblCollege);
        
         String s[]={"Birendra Multiple Campus","Sungava College","Saptagandaki College","Saheed Smarak College","Lubmbini ICT College"};
         
         JComboBox cmbCollege= new JComboBox(s);
         cmbCollege.setBounds(150,300,200,20);
         f.add(cmbCollege);
         
         JButton btnOk=new JButton("OK");
         btnOk.setBounds(150, 350, 70, 20);
         f.add(btnOk);
         
         JButton btnCancel=new JButton("Cancel");
         btnCancel.setBounds(230, 350, 100, 20);
         f.add(btnCancel);
          
         
        f.setSize(500,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
