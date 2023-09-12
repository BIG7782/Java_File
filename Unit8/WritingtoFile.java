
package Unit8;
import java.io.FileOutputStream;
import java.io.IOException;
public class WritingtoFile {
public static void main(String args[]) throws IOException
{
    FileOutputStream out = null;
    try{
        out = new FileOutputStream("F:\\output.txt");
                int a=65;
                out.write(a);
    }
    finally
    {
        if(out !=null)
        {
            out.close();
        }
    }
}
}
