import java.io.*;
import java.util.*;

public class MainReadWrite{
      
   //Attributs
   static Scanner input = new Scanner(System.in); 
   
   public static void main(String[]args) throws FileNotFoundException{
   
    
   //Notebook main programm   
      
      do{  
         System.out.println("Do you want to read or write in your notebook?");
         System.out.println("To do following, type: 'write' 'read' 'exit'");
         String answer = input.nextLine();
         
         if(answer.equals("read") || answer.equals("READ")){
            System.out.println("Here's what you wrote:");
            System.out.println();
            Read();
            
         }else if(answer.equals("write") || answer.equals("WRITE")){
            System.out.println("What do you want to write?");
            System.out.println();
            Write();
            
         }else if(answer.equals("exit") || answer.equals("EXIT")){   
            break;
         }   
      }while(2 != 1); 
      
   }
   //Read mytext.txt
   public static void Read() throws FileNotFoundException{
      Scanner input = new Scanner(new File("myText.txt"));
      while (input.hasNextLine()) {
         String text = input.nextLine(); 
         System.out.println(text);  
      }
      System.out.println();
   }
   //Writes to mytext.txt
   public static void Write() throws FileNotFoundException{
      Scanner input = new Scanner(System.in);
      String f = "myText.txt";
      File myf = new File(f);
      PrintStream output = new PrintStream (new FileOutputStream(myf, true));
      
      do{
         String check = input.hasNext();
         if(check.equals("//STOP")){
            break;
         }else{
            output.print(check + " ");
            output.println("");
         }      
         
      }while(1 != 2);
      System.out.println();
   }
}