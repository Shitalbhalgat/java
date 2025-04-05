public class Wrapper {
    public static void main(String[] args) {
        Byte b =new Byte("123");
        System.out.println(b);
        Short s =new Short("20");
        System.out.println(s);

        Integer i=new Integer(20);
        System.out.println(i);
        Float f=new Float(10.3);
        System.out.println(f);

        //Valueof(String s )
        Byte b1 =Byte.valueOf("123");
        System.out.println(b1);
        Short s1 =Short.valueOf("20");
        System.out.println(s1);
        Integer i2=Integer.valueOf("10");
        System.out.println(i2);
       // Integer i3=Integer.valueOf("ten");
       // System.out.println(i3);

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


        Integer i1=Integer.valueOf("10",2);
        System.out.println(i1);
        Integer I4=Integer.valueOf("1111",4);
        System.out.println(I4);


        Integer I5 =Integer.valueOf(120);
        System.out.println(I5.byteValue());
        System.out.println(I5.shortValue());
        System.out.println(I5.intValue());
        System.out.println(I5.floatValue());
        System.out.println(I5.doubleValue());
      

        //Autoboxing datatype->object
        char ch='a';
        Character ch1=ch;
        System.out.println(ch);
        System.out.println(ch1);

        //Unboxing object->primitie value
        Integer x=Integer.valueOf(10);
        int y= x;
        System.out.println(x);
        System.out.println(y);




    }
    
}
