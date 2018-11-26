import java.util.*;
import java.io.*;

public class DelfinenMenu{

   private Scanner input = new Scanner(System.in);
   private boolean stop = false;
   private String answer = ""; 
   Restance restance = new Restance();
   
   public void startMenu()throws InterruptedException, FileNotFoundException{
      
      while(stop != true){
      
         System.out.println("Welcome to club Delfinen");
         System.out.println();
         System.out.print("Login: ");
         
         answer = input.next();
         
         
         System.out.println(".");
         Thread.sleep(500);
         System.out.println(".");
         Thread.sleep(500);
                
         if(answer.equals("123")){
            formand();     
         }
         else if(answer.equals("456")){
            kassere();
         }
         else if(answer.equals("789")){
            coach();
         }
         else if(answer.equals("+")){
            System.out.println("'System shutting down'");
            stop = true;
         }else{
            System.out.println("'Wrong login, try again'");
            System.out.println("");
         }
      }
   }

   public void formand()throws InterruptedException{
      System.out.println("Welcome 'Formand'");
      System.out.println("[1] Create new member");
      System.out.println("[2] Exit");
      
      try{
         System.out.print("Input: ");
         answer = input.next();
      
         if(answer.equals("1")){
            //go to create member
         }
         else if(answer.equals("2")){
            System.out.println("");
            System.out.println("'Logging off Formand'");
            System.out.println("");
            Thread.sleep(500);
            stop = false;
         }else{
            System.out.println("");
            System.out.println("'Input not recognized'");
            System.out.println("");
            Thread.sleep(500);
            formand();
              
         }
         
      }catch(InputMismatchException i){
         System.out.println("'Wrong input'");
         System.out.println("");  
      }   
   }

   public void kassere()throws InterruptedException, FileNotFoundException{
      System.out.println("Welcome 'Kassere'");
      System.out.println("[1] Unpaid contingent");
      System.out.println("[2] Exit");
     
      try{   
         System.out.print("Input: ");
         answer = input.next();
         
         if(answer.equals("1")){
            restance.entryRead();
            System.out.println("");
            kassere();      
         }
         else if(answer.equals("2")){
            System.out.println("");
            System.out.println("'Logging off Kassere'");
            System.out.println("");
            Thread.sleep(500);
            stop = false;
         }else{
            System.out.println("");
            System.out.println("'Input not recognized'");
            System.out.println("");
            Thread.sleep(500);
            kassere();
              
         }
            
      }catch(InputMismatchException i){
         System.out.println("'Wrong input'");
         System.out.println("");      
      } 
   }
   
   public void coach()throws InterruptedException{
      System.out.println("Welcome 'Coach'");
      System.out.println("[1] See training statistic");      
      System.out.println("[2] See competition statistic");
      System.out.println("[3] Add new time");
      System.out.println("[4] Exit");   
      
      try{   
         System.out.print("Input: ");
         answer = input.next();
         
         if(answer.equals("1")){
            //go to training statistic/5 fastest
         }
         else if(answer.equals("2")){
            //go to competition statistic/5 fastest
         }
         else if(answer.equals("3")){
            //setNewTime();
         }         
         else if(answer.equals("4")){
            System.out.println("");
            System.out.println("'Logging off Coach'");
            System.out.println("");
            Thread.sleep(500);
            stop = false;
         }else{
            System.out.println("");
            System.out.println("'Input not recognized'");
            System.out.println("");
            Thread.sleep(500);
            coach();
             
         }
         
      }catch(InputMismatchException i){
         System.out.println("'Wrong input'");
         System.out.println("");     
      } 
   }   
}