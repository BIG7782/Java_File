
package Unit6;

public class StringCompareTo {
    public static void main(String args[])
        {
            String s1="Monika";
            String s2="Monika"; //ascii value ko aadhar ma compare garxa
            String s3="Unisha";
            String s4="MONIKA"; 
       
            System.out.println( s1.compareTo(s2));
            System.out.println( s2.compareTo(s3));
            System.out.println( s1.compareTo(s4));
            System.out.println( s1.compareToIgnoreCase(s4));
        }
}


    
