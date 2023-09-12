
package Unit3;
public class Test1 {
    int a;
    int b;
    //parameterized constructors
    Test1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
       //Displaying the value of variables a and b 
        System.out.println("a = " + a + " b = " +b );
    }
    public static void main(String args[])
    {
        Test1 obj = new Test1(10,20);
        obj.display();
    }
}
