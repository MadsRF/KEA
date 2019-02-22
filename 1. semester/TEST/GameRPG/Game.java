import java.util.*;

public class Game{

   Monsters mon = new Monsters();
   private Scanner scan = new Scanner(System.in);  
   private String select;
   Adventurer player = new Adventurer();
   
   public void fight()throws InterruptedException{
      
      Menu menu = new Menu();
      
      menu.timer();
      System.out.println("You're fighting:");    
      System.out.println("Type: " + mon.getName() + " Health: " + mon.getLife() + " ATK: " + mon.getDamage());
      System.out.println();
      System.out.println("What are you gonna do?");
      System.out.println();
      System.out.println("Type: " + player.getName() +" Health: " + player.getLife() + " ATK: " + player.getDamage());
      System.out.println("[1] Attack");
      System.out.println("[2] Defence");
      System.out.println("[3] Heal");
      System.out.println("[4] Run Away");
      
      select = scan.next();
      
      if(select.equals("1")){
         player.attack();
      }
      else if(select.equals("2")){
         player.parry();
      }
      else if(select.equals("3")){
         player.heal();
      }
      else if(select.equals("4")){
         menu.timer();
         System.out.println("You ran away too fight another day");
         menu.timer();     
      
      }else{
         System.out.println("Wrong input, try again");
         fight();
      }
   }
}