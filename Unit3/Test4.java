//Using 'this' keyword as method parameter
package Unit3;
 class Test4 {
    int a;
    int b;
    //default constructor
    Test4()
    {
        a=10;
        b=20;
    }
    void display(Test4 obj)
    {
        System.out.println("a= " +obj.a+" b = "+obj.b);
    }
    //Method that returns current class instance
    void get()
    {
        display(this);
    }
    public static void main( String[] args)
    {
        Test4 object= new Test4();
        object.get();
    }
}
//MCQ static variable class variable vaninxa 
//