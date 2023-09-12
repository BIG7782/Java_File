
package Unit3;

public class StaticClass {
    static class InnerClass
    {
        public void display()
        {
            System.out.println("Inside Nested class: ");
        }
    }
    public static void main(String args[])
    {
        StaticClass.InnerClass obj = new StaticClass.InnerClass();
        obj.display();
    }
}
    

