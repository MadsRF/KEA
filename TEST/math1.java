import java.util.*;

public class math1{

      private static boolean q = true;
      private static Scanner input = new Scanner(System.in);
      
      private static double i=0;
      private static double j=0; 
      private static double sum;

   public static void main(String[]args){
   

      
   
         while(q != false){
            
            multiply();   
            
         }       
   
   }
   
   public static void multiply(){
   
      try{
         System.out.print("First number: ");  
         i = input.nextDouble();
           
         System.out.print("Second number: ");        
         j = input.nextDouble();
                 
         sum = i*j;
      
         System.out.println("The sum equals: " + sum);
      }
             
      catch(Exception e){
         System.out.println("Exception occurred");
         q = false;   
         
      }         
   
   }


   
}