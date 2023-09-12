
package Unit8;
import java.io.*;
public class SerializationExample {
        public static void main(String[] args)
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
    }  
}
