//copy the content of one file to another file.
package Unit8;
import java.io.*;
public class CopyFilee {
    public static void main(String args[]) throws IOException{
        FileReader in = null;
         FileWriter out = null;
        try {
            in = new FileReader("F:\\input.txt");
            out = new FileWriter("F:\\output.txt");
            int c;
            while (( c = in.read()) != -1 ){
                out.write(c);
            }
        }finally{
            if(in !=null) {
                in.close();
            }
            if(out !=null) {
                out.close();
            }
        }
    }
    
}

