import java.util.*;
import java.io.*;

public class PhoneMain{
   
   public static void main(String []args) throws FileNotFoundException, InterruptedException{
   
      try{
         Scanner input = new Scanner(new File("Contacts.txt"));
         ArrayList<ContactValues> listOfContacts = new ArrayList<ContactValues>();  
            
         while(input.hasNext()){
            String first = input.next();
            String last = input.next();
            int age = input.nextInt();
            int phone = input.nextInt();
            String mail = input.next();        
         
            listOfContacts.add(new ContactValues(first, last, age, phone, mail));
         }
     
         while (2 != 1){
            PrintStream output = new PrintStream("Contacts.txt");
         
            for(ContactValues e : listOfContacts){
               output.println(e.getFirst() + " " + e.getLast() + " " + e.getAge() + " " + e.getPhone() + " " + e.getMail());
            }  
         
               Menu menu = new Menu();
               menu.entryMenu(listOfContacts);    
         }   
      }
      catch(IOException i){                 
         System.out.println("Something went wrong with saving the contacts");
         System.out.println();
      }
   }   
}