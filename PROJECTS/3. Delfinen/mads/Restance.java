import java.util.*;
import java.io.*;

public class Restance{

   private String first;
   private String last;
   private int age;
   private String type; 
   
   private int dayRead;
   private int monthRead;
   private int yearRead; 
   
   private int day;
   private int month;
   private int year; 
   
   ArrayList list = new ArrayList
 
   public void entryRead()throws FileNotFoundException{
   
      try{   
         Scanner read = new Scanner(new File("members.txt"));
      
         while(read.hasNextLine()){
            this.first = read.next();
            this.last = read.next();
            this.age = read.nextInt();
            this.dayRead = read.nextInt();
            this.monthRead = read.nextInt();
            this.yearRead = read.nextInt();
            this.type = read.next();            
         
               //test print
      System.out.println(dayRead+" "+monthRead+" "+yearRead);  

         }           
      }catch(InputMismatchException i){
         System.out.println("'Wrong input'");
         System.out.println(""); 
         entryRead();   
      }            
    
      
      askDate();

   }         
         
   public void askDate()throws FileNotFoundException{     
      
      Scanner input = new Scanner(System.in);
      String answer ="";
      
      try{     
         System.out.println("What is the date of today?");
         System.out.println("");
         System.out.print("Day: ");
         day = input.nextInt();
         if(day > 30 || day <= 0){
            System.out.println("Wrong amount of days");
            entryRead();
         }                     
         System.out.print("Month: ");
         month = input.nextInt();  
         if(month > 12){
            System.out.println("There are only 12 months!");
            entryRead();
         }   
         System.out.print("Year: ");
         year = input.nextInt();   
            
         System.out.println("Is this the correct date?: " + day+"/"+month+"/"+year);
         System.out.print("yes/no?: ");
            
         answer = input.next();
             
         if(answer.equals("no")){   
            System.out.println("");
            entryRead();   
         }   
         else if(answer.equals("yes")){
            if(year > yearRead /*|| month > monthRead*/){
               System.out.println("");
               System.out.println("These people owes contingent: ");
               System.out.println("");
               
               System.out.println("Name: "+first+" "+last+" "+"Age: "+age+" "+"Created: "+dayRead+"/"+monthRead+"/"+yearRead+" "+"Status: "+type);
                  
            }
            else{
               System.out.println("All contingents are upToDate");
            }  
         }else{
            System.out.println("'Wrong input'");
            System.out.println(""); 
            entryRead();   
         }
         
      }catch(InputMismatchException i){
         System.out.println("'Wrong input'");
         System.out.println(""); 
         entryRead();   
      }                                                        
   }         
}