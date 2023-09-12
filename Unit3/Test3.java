package Unit3;
public class Test3 
    {
        int a;
        int b;
          //Default constructor
        Test3()
        {
            a = 10;
            b =20;
        }
        //Method that returns current class instance
        Test3 get()
        {
            return this;
        }
        //Displaying value of variables a and b
        void display()
        {
            System.out.println("a = "+a+ " b = "+b);
        }
        public static void main(String[] args)
        {
            Test3 obj = new Test3();
            obj.get().display();
        }        
}
