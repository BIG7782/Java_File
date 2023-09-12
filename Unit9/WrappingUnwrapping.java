package Unit9;
public class WrappingUnwrapping {
    public static void main(String[] args)
    { 
        //byte data type
        byte a = 1;
        Byte byteobj = new Byte(a);
        int b = 10;
        //wraping around Integer objcect
        Integer intobj = new Integer(b);
        float c = 18.6f;
        Float floatobj = new Float(c);
        double d =250.5;
        Double doubleobj = new Double(d);
        char e='a';
        Character charobj=e;
         System.out.println("Values of Wrapper objects (printing as objects)");
         System.out.println("Byte object byteobj = "+byteobj);
         System.out.println("Integer object byteobj = "+intobj);
         System.out.println("Float object byteobj = "+floatobj);
         System.out.println("Character object byteobj = "+charobj);
         byte bv = byteobj;
         int iv = intobj;
         float fv = floatobj;
         double dv = doubleobj;
         char cv = charobj;
         System.out.println("Unwrapped values (printing as data types)");
          System.out.println("byte value, bv: "+bv);
          System.out.println("int value, bv: "+iv);
          System.out.println("float value, bv: "+fv);
          System.out.println("double value, bv: "+dv);
          System.out.println("char value, bv: "+cv);     
    }  
}
