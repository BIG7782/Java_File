package Unit8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderExample {
   public static void main(String[] args)
           throws IOException
   {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
                  System.out.print("Name: ");
                  String name = reader.readLine();
                  System.out.println("Name: "+name);
   }
}
