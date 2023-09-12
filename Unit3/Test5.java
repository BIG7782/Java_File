
package Unit3;
class Test5 {
    void display()
    {
        // calling function show()
        this.show();
        System.out.println("Inside display function");
    }
    void show()
    {
        System.out.println("Inside show function: ");
    }
public static void main (String args[])
{
Test5 t1 = new Test5();
        t1.display();
   }
}
