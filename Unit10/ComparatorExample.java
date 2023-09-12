
package Unit10;
import java.util.*;
public class ComparatorExample {
    public static void main(String args[])
    {
        ArrayList<Student> al=new ArrayList<Student>();
        int n,roll,age,i;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("No of Students: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Rollno, name and age: ");
            roll=sc.nextInt();
            name=sc.next();
            age=sc.nextInt();
            al.add(new Student(roll,name,age));
        }
        System.out.println("\nSorting by Name");
        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("\n\nSorting by age");
        Collections.sort(al,new AgeComparator());
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
    
}
