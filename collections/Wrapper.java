// Wrapper class :Wrapper classes are predefined classes in java.lang package that are used to 
//                convert primitive data types into objects.

// Wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean
// General Syntax :WrapperClass object = new WrapperClass(value);

import javax.xml.crypto.KeySelector.Purpose;

public class Wrapper {
    public static void main(String[] args) {
    //Conversion methods
    //1)valueOf() Method Converts: primitive → wrapper object  
    //                              String → wrapper object
    //                            Syntax :WrapperClass.valueOf(value);
        Byte b1 =Byte.valueOf("123");
        System.out.println(b1);
        Short s1 =Short.valueOf("20");
        System.out.println(s1);
        Integer i2=Integer.valueOf("10");
        System.out.println(i2);
       // Integer i3=Integer.valueOf("ten");
       // System.out.println(i3);     // Throw NumberFormatException

        Float f1=Float.valueOf("10.3f");
        System.out.println(f1);

        Double d =Double.valueOf("12.3");
        System.out.println(d);

        Boolean B2=Boolean.valueOf("abc");
        System.out.println(B2);
        Boolean B3=Boolean.valueOf("pqr");
        System.out.println(B3);
        Boolean B4=Boolean.valueOf("True");
        System.out.println(B4);
        Boolean B5=Boolean.valueOf("true");
        System.out.println(B5);
        Boolean B6=Boolean.valueOf("False");
        System.out.println(B6);

        // 2)valueof(value)
        Integer I =Integer.valueOf(101);
        System.out.println(I);

        Float F =Float.valueOf(101.23f);
        System.out.println(F);

        Double D =Double.valueOf(101.23);
        System.out.println(D);

        Boolean B=Boolean.valueOf(true);
        System.out.println(B);
        Boolean B1=Boolean.valueOf(false);
        System.out.println(B1);


        Character c=Character.valueOf('a');
        System.out.println(c);

        Integer i1=Integer.valueOf("10",2);
        System.out.println(i1);
        Integer I4=Integer.valueOf("1111",4);
        System.out.println(I4);


        //2) xxxValue() Method:Converts: wrapper object → primitive
        //                               Syntax :object.xxxValue();
        Integer I5 =Integer.valueOf(120);
        System.out.println(I5.byteValue());
        System.out.println(I5.shortValue());
        System.out.println(I5.intValue());
        System.out.println(I5.floatValue());
        System.out.println(I5.doubleValue());
        System.out.println(I5.longValue());

        // 3) toString() Method: Converts: wrapper object → String
        Integer I6 =Integer.valueOf(130);
        String str=I6.toString();
        System.out.println(str);

        // 4) parseXXX() Method: Converts: String → primitive
        //                        Syntax :WrapperClass.parseXXX(String);
        int num=Integer.parseInt("1000");
        System.out.println(num);
        float num1=Float.parseFloat("10.5f");
        System.out.println(num1);

        //Autoboxing datatype->object
        char ch='a';
        Character ch1=ch;
        System.out.println(ch);
        System.out.println(ch1);

        //Unboxing object->primitie value
        Integer x=Integer.valueOf(100);
        int y= x;                               //  implicitly  compiler convert int y=x.intValue();
        System.out.println(x);
        System.out.println(y);
        
        // CompareTO() and Equals() Method
        Integer I7=Integer.valueOf(100);
        Integer I8=Integer.valueOf(200);
        System.out.println(I7.compareTo(I8));  //-1  if I7<I8
        System.out.println(I8.compareTo(I7));  //1   if I8>I7
        System.out.println(I7.compareTo(I7));  //0   if I7==I7
        System.out.println(I7.equals(I8));     //false
        System.out.println(I7.equals(I7));     //true

        // Max_Value and Min_Value
        System.out.println("Max Integer Value: "+Integer.MAX_VALUE);
        System.out.println("Min Integer Value: "+Integer.MIN_VALUE);
        // SIZE
        System.out.println("Size of Integer in bits: "+Integer.SIZE);
        // BYTES
        System.out.println("Size of Integer in bytes: "+Integer.BYTES);
        // TYPE
        System.out.println("Primitive type of Integer: "+Integer.TYPE);
        

 }
    
}
