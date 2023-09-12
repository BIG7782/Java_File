package Unit3;
public class PassByReference {
    int a=5,b=10;
    void add(PassByReference ob)
    {
        ob.a+=3;
        ob.b+=3;
    }
    public static void main(String[] args)
    {
        PassByReference obj=new PassByReference();
        System.out.println("Before function call a = "+obj.a+" b= "+obj.b);
        obj.add(obj);
        System.out.println("After function call a = "+obj.a+" b= "+obj.b);
    }
    
}
