import java.util.*;
import java.io.*;

public class Betaling{

   private String name;
   private int age;
   private int created;
   private String type; 
   private int date = 2018;
   

   public void restance()throws FileNotFoundException{

      Scanner input = new Scanner(new File("members.txt"));

      while(input.hasNext()){
         String name = input.next();
         int age = input.nextInt();
         int created = input.nextInt();
         String type = input.next();
         
         if(created < date){
            System.out.println("");
            System.out.println("These people owes contingent: ");
            System.out.println("");
            System.out.println("Name: "+ name +" "+"Age: "+ age +" "+"Created: "+ created +" "+"Status: "+ type);

         }
      }
   }
}