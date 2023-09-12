
package Unit3;
import java.util.Scanner;
public class Time {
    int hh,mm,ss;
    Time(int h,int m,int s)
    {
        hh=h;
        mm=m;
        ss=s;
    }
    //function to add and return time object
    Time add(Time t2)
    {
        this.ss=ss+t2.ss;
        this.mm=mm+t2.mm;
        this.hh=hh+t2.hh;
        //implement mechanism to convert time in proper format
        if(this.ss>=60)
        {
            this.mm+=this.ss/60;
            this.mm+=this.ss%60;
        }
        if(this.mm>=60)
        {
            this.mm+=this.ss/60;
            this.mm+=this.ss%60;
    }
        return this;
    }
    //function to subtract and return time object 
    Time subtract(Time t2)
    {
        if(t2.ss>ss)
        {
            --mm;
            ss+=60;
        }
        this.ss=ss-t2.ss;
        if(t2.mm>mm)
        {
            --hh;
            mm+=60;
        }
        this.mm = mm=t2.mm;
        this.hh = hh-t2.hh;
        return this;
    }
    void display()
    {
        System.out.println("HH:MM:SS = "+hh+":"+mm+":"+ss);
    }
    public static void main(String args[])
    {
        Time t1= new Time(5,10,15);
        Time t2= new Time(4,35,55);
        Time t3,t4;
        System.out.println("Two times are: ");
        t1.display();
        t2.display();
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nPress 1 for Sum and 2 for Difference: ");
        choice=sc.nextInt();
        if(choice==1)
        {
            t3=t1.add(t2);
            System.out.print("\n Sum is: ");
            t3.display();
        }
        if(choice==2)
        {
            t4=t1.subtract(t2);
             System.out.print("\n Difference is: ");
            t4.display();    
        }
    }
}
