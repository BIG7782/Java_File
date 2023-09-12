
package Unit3;

public class StaticVariable {
    int roll;
    String name;
    static String subject="Java";
    StaticVariable(int r, String n)
    {
        roll=r;
        name=n;
    }
    void display()
    {
        System.out.println(roll+" "+name+" "+subject);
    }
    public static void main(String args[])
    {
        StaticVariable obj1=new StaticVariable(1,"Anjila");
        StaticVariable obj2=new StaticVariable(2,"Sophin");
        obj1.display();
        obj2.display();
    }
}
