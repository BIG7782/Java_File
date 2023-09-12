
package Unit6;
public class GetBytes {
    public static void main(String args[])
    {
    String s="ABCD EFGH";
    byte[] b=s.getBytes();
    for(byte i:b)
    {
        System.out.println(i);
    }
}//ascii
}
