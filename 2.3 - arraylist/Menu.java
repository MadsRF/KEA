import java.util.*;
import java.io.*;

public class Menu{

   private String answer; 
   
   private Scanner input = new Scanner(System.in);
   private PhoneCreate entry = new PhoneCreate();
   
   public void entryMenu(ArrayList<ContactValues> listOfContacts)throws FileNotFoundException, InterruptedException{ 
   
      System.out.println("Welcome to your Smartphone");
      System.out.println();
      System.out.println("[1] Add contact");
      System.out.println("[2] Remove contact");
      System.out.println("[3] Show all contacts");
      System.out.println("[4] Exit");
         
      answer = input.next();
         
            if (answer.equals("1")){
               entry.createNew(listOfContacts);                            
            }
            else if(answer.equals("2")){
               System.out.println("Which contact do you want to remove?");
               entry.delete(input.nextInt(),listOfContacts);
            }
            else if(answer.equals("3")){
               entry.showAll(listOfContacts);
            }
            else if(answer.equals("4")){
               System.out.println(".");
               Thread.sleep(500);
               System.out.println(".");
               Thread.sleep(500);
               System.out.println("Goodbye!");
               System.exit(0);          
            }else{
               System.out.println("Ah ah ah, you didn't say the magic word");
            } 
   }
}