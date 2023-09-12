package SingleLevelInheritence;
import java.util.Scanner;
class A
{
int rollno;
String name;
String address;
Scanner sc=new Scanner(System.in);
public void get()
{
    System.out.println("Enter rollno,name and address:");
    rollno=sc.nextInt();
    name=sc.next();
    address=sc.next();
}
}
class B extends A
{
    public void display(){
        get();
        System.out.print("Rollno:" + rollno);
        System.out.print("\n Name"+name);
        System.out.print("\n Address"+address);
    }
}
public class java {
    
}
