import java.util.*;

public class Menu{

   private boolean stop = true;
   private Scanner scan = new Scanner(System.in);
   private String select;
   Game gm = new Game();
   
      
   public void gameMenu() throws InterruptedException{
   
      while(stop != false){
      
         System.out.println("Welcome to the RPG - Monster Dungeon Fighter");  
         System.out.println();
         System.out.println("[1] Play Game");
         System.out.println("[2] How To Play");
         System.out.println("[3] Story");
         System.out.println("[4] Exit");
         System.out.println();
         System.out.print("Select:  ");   
      
         select = scan.next();
      
         if(select.equals("1")){     
            gm.fight();
         }
         
         else if(select.equals("2")){ 
            howToPlay();        
         }
         
         else if(select.equals("3")){               
            story();
         }
         
         else if(select.equals("4")){    
            exit();
         }else {
            System.out.println("Wrong input");            
         }  
      }
   }
  
   public void howToPlay() throws InterruptedException{
      System.out.println();
      System.out.println("Purpose of the game is to slay the monsters of the dungeon.");
      System.out.println("Go to the dungeon and fight the monster and win by killing it.");
      System.out.println("Remember to block incomming attacks and use your potions since the monsters are way stronger than any human adventurer.");
      System.out.println("if you die, you lose.");
      System.out.println();
            
      System.out.print("Done reading?: ");
      
      select = scan.next().toUpperCase();
      if(select.equals("YES")){
         timer();
         gameMenu();
      }else{
         howToPlay();
      } 
   }
   
   public void story() throws InterruptedException{
      System.out.println();
      System.out.println("You are an Adventurer who loves to fight dungeon monsters...");
      System.out.println();   
            
      System.out.print("Done reading?: ");
      
      select = scan.next().toUpperCase();
      if(select.equals("YES")){
         timer();
         gameMenu();
      } 
   }

   public void exit() throws InterruptedException{
      timer();
      System.out.println("Shutting down...");
      this.stop = false;           
   }
   
   public void timer() throws InterruptedException{
      System.out.println(".");
      Thread.sleep(500);
      System.out.println(".");
      Thread.sleep(500);      
   }
}