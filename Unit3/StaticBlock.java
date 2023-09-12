
package Unit3;

public class StaticBlock {
    static class InnerClass
    {
        public void display()
        {
            System.out.println("Inside Nested class: ");
        }
    }
    public static void main(String args[])
    {
        StaticBlock.InnerClass obj = new StaticBlock.InnerClass();
        obj.display();
    }
}
