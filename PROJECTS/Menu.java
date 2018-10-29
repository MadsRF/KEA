import java.util.*;
import java.io.*;

public class Menu{

   //attri
   private Scanner input = new Scanner(System.in);
   private String name;
   private int credit = 0;
  
   //objects
   WashCard washcard = new WashCard();
   Statistic stats = new Statistic();
   BuyWash buywash = new BuyWash();
   
   //methods
   public void entryMenu(){
      
      //start
      System.out.println("Do you have a washcard?  [yes/no?]");
      String answer = input.nextLine(); 
   
      if(answer.equals("no") || answer.equals("NO")){
         entryUser(null,0);
         washcard.createUser(name, credit, listOfUsers);
      }
      else if(answer.equals("yes") || answer.equals("YES")){
         System.out.println("Insert Washcard... [Type Username]");
         input.nextLine();
      
      //If owner logs on
      else if(answer.equals("1234"));
      System.out.println("Welcome Owner this is the overall statistic of the Carwash");
      stats.statistic(name, credit, listOfUsers); 
      }
      
      //insert skal ændres til at søge efter oprettet brugersnavn fra users.txt
      if(answer.equals(??){
         System.out.println("Welcome. Choose on of the following:");
         System.out.println("");
         System.out.println("[Buy Wash]       [Check Balance]     [Refill Card]     [Exit]");
         input.nextLine();
         
         if(answer.equals("buy wash") || answer.equals("BUY WASH")){
            buywash.wash(name, credit, listOfUsers);
         }
         else if(answer.equals("check balance") || answer.equals("CHECK BALANCE")){
            washcard.balance(name, credit, listOfUsers);
         }
         else if(answer.equals("refill card") || answer.equals("REFILL CARD")){
            washcard.recharge(name, credit, listOfUsers);
         }
         else if(answer.equals("exit") || answer.equals("EXIT")){
            System.exit(0);
         }else{
            System.out.println("Error, Wrong Input");
         }
      } 
   }
   //ask user for information     
   public void entryUser(String name, int credit) {
      System.out.println("input name");
      name = input.nextLine();  
      
         if(credit > 1000 || credit < 200){
            System.out.println("Wrong credit amount");
         }
      System.out.println("input amount of credit you want on wash card  [200-1000]");
      credit = input.nextInt();
   }
   
   
   
}