public class Static_variable {
    //Static Variable
    int count ;
    Static_variable()
    {
        count++;
        System.out.println(count);
    }

   //Staic block
    static
    {
        //  count= 10;
        System.out.println("Staic block");
    }

    public static void main(String[] args) {
        Static_variable s1= new Static_variable();
        Static_variable s2= new Static_variable();
        Static_variable s3= new Static_variable();
        s3.count=3;
        System.out.println(s3.count);
        Static_variable s4=s3;
        System.out.println(s4.count);

        
    }
//     
}
