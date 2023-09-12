
package LabReport;
    
import Unit8.Student;
import java.io.*;
public class SerializaizeExample {
        public static void main(String[] args) throws ClassNotFoundException
        {
            Student s = new Student();
            s.rollno=5;
            s.name="Salina";
            try
            {
                FileOutputStream fout= new FileOutputStream("E:\\Student.ser");
                ObjectOutputStream out= new ObjectOutputStream(fout);
                out.writeObject(s);
                out.close();
                System.out.println("Serialized data is saved in Student.ser");   
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
            try
             {
             FileInputStream fin=new FileInputStream("E:\\Student.ser");
             ObjectInputStream in= new ObjectInputStream(fin);
             s=(Student)in.readObject();
             System.out.println("Rollno = "+s.rollno);
             System.out.println("Name = "+s.name);
             in.close();
             fin.close();
         }
           catch(IOException e)
           {
             System.out.println(e);
         }
     }
}

