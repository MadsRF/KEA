import java.util.*;

public class TestMain{
   

   public static void main(String[] args){
   
   
      //Test2 test2 = new Test2();
      Scanner scan = new Scanner(System.in);   
      boolean stop = true;
      String[] names = {"mads", "kasper", "oliver", "nadia"};
   
      
   
      while(stop){
      
         int input = scan.nextInt();
         
      
         switch(input){
         
            case 1:
               System.out.println("input 1 switch/case");  
               break;
         
            case 2:
               System.out.println("input 2 switch/case");
               break;
            
            case 3:
               for(String n: names){
                  System.out.println("this is a enhanced forloop that shows all the name in the String array "+n);
               }
               break;
               
            case 4:
               System.out.println("this is the call of another class ");
               break;    
         }
      
         int input1 = scan.nextInt();
         
         if(input1 == 1){
            System.out.println("input if statement 1");
         
         }else if(input1 == 2){
            stop = false;
         }
         else{
            for(int i = 1; i <= 10; i-){
               System.out.println(i+" hello world");
            }
         } 
      
      
      }
   }
}