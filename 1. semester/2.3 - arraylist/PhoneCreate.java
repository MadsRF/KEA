import java.io.*;
import java.util.*;

public class PhoneCreate{   
   
   private String first;
   private String last;
   private int age;
   private int phone;
   private String mail;   
   
   private ArrayList<ContactValues> listOfContacts = new ArrayList<ContactValues>();
   private Scanner input = new Scanner(System.in);

   public void PhoneCreate(String first, String last, int age, int phone, String mail, ArrayList<ContactValues> listOfContacts){
      listOfContacts.add(new ContactValues(first,last,age,phone,mail));  
   }     
   
   public void createNew(ArrayList<ContactValues> listOfContacts){
      try{ 
         System.out.print("First Name: ");
         first = input.next();
         System.out.print("Last Name: ");
         last = input.next();
         System.out.print("Age: ");
         age = input.nextInt();
         System.out.print("Phone nr: ");
         phone = input.nextInt();
         System.out.print("E-mail: ");
         mail = input.next();
      
         PhoneCreate(first,last,age,phone,mail,listOfContacts);      
      }catch(InputMismatchException i){
         System.out.println("Wrong input");
         System.out.println();
      }
   }
   
   public void delete(int index, ArrayList<ContactValues> listOfContacts){
      try{
         listOfContacts.remove(index);
      }catch(IndexOutOfBoundsException i){
         System.out.println("Wrong input");
         System.out.println();
      }  
   }   
   
   public void showAll(ArrayList<ContactValues> listOfContacts)throws InterruptedException{
      int count = 0;
      for(ContactValues e : listOfContacts){
         System.out.println("ARRAY INDEX: " + count);
         System.out.println("--------------");
         count++;  
         System.out.println(e.first + " " + e.last);
         System.out.println("Age:\t " + e.age);
         System.out.println("Phone: " + e.phone);
         System.out.println("Mail:\t " + e.mail);
         System.out.println();
         Thread.sleep(1000);
      }
   }
}  

