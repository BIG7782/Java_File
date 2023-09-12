
package Unit3;
public class StaticMethod {
    static int roll;
    static String name;
    static String subject;
    StaticMethod(int r,String n,String s) 
    {
        roll=r;
        name=n;
        subject=s;
    }
    static void display()
    {
        System.out.println(roll+" "+name+" "+subject);
    }
public static void main(String args[])
{
    StaticMethod obj=new StaticMethod(1,"Niruta","Java");
    display();
}
}
