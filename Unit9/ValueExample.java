package Unit9;
public class ValueExample {
    public static void main(String[] args)
    { 
        Double d = new Double("6.9685");
        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        long l = d.longValue();
        float f  = d.floatValue();
        double d1 = d.doubleValue();
        System.out.println("Values of d after converting it to byte : "+b);
        System.out.println("Values of d after converting it to short : "+s);
        System.out.println("Values of d after converting it to int : "+i);
        System.out.println("Values of d after converting it to long : "+l);
        System.out.println("Values of d after converting it to float : "+f);
        System.out.println("Values of d after converting it to double : "+d1);
    }
}
