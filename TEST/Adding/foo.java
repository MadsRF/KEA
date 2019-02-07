import java.util.*;

public class foo{

   static Scanner scan = new Scanner(System.in);
   private static int input;
   static A a = new A(0);
   static B b = new B(-5);


   public static void main(String[] args){

   while(1 != 2){  

      keepValue();

   }         

   }

   public static void keepValue(){
     
     a.setI(a.getI() + scan.nextInt());
     
     int sum;
     
     sum = a.getI() + b.getJ();
      
     System.out.println("the sum of the two numbers is: "+sum);
   


   }







}