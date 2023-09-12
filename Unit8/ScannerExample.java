
package Unit8;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name=sc.next();
        System.out.print("Gender: ");
        char gender=sc.next().charAt(0);
        System.out.print("Age");
        int age = sc.nextInt();
        System.out.print("Mobile no:");
        long mobileno=sc.nextLong();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("\nName: "+name);
        System.out.print("Gender: "+gender);
        System.out.print("Age: "+age);
        System.out.print("Mobileno: "+mobileno);
        System.out.print("\nGPA: "+gpa);    
    }
    
}
