
package Unit6;

public class GetCharsExample {
       public static void main(String args[])
    {
        String s1="Object Oriented Programming in Java";
        int start=16;
        int end=30;
        char s2[]=new char[end-start];
        s1.getChars(start, end, s2, 0);
        System.out.println(s2);
    }
}
