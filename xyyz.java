
public class xyyz {
    class A
    {
        void display()
        {
            int num=5;
            System.out.println("num = "+num);
        }
    }
    public class xyyz extends A
    {
        int num=10;
        void display()
        {
            super.display();
            System.out.println("num = "+num);
        }
        public static void main(String args[])
        {
            xyyz obj = new xyyz ();
            obj.display();
        }
    }
}
