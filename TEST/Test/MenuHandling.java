import java.util.*;

public class MenuHandling{   
   
   private String userInput;
   private boolean stop = true;
   public int count;
     
   Scanner scan = new Scanner(System.in);
   //Adventurer ad = new Adventurer();
   Monsters mon = new Monsters();
      
   public void menuScreen()throws InterruptedException{
   
      while(stop != false){
      
         System.out.println("Welcome to the RPG - Monster Dungeon Fighter");  
         System.out.println();
         System.out.println("[1] Play Game");
         System.out.println("[2] How To Play");
         System.out.println("[3] Story");
         System.out.println("[4] Exit");
         System.out.println();
         System.out.print("Select:  ");   
      
         userInput = scan.next();
      
         if(userInput.equals("1")){     
            fight();
         }
         
         else if(userInput.equals("2")){ 
            howToPlay();        
         }
         
         else if(userInput.equals("3")){               
            story();
         }
         
         else if(userInput.equals("4")){    
            exit();
         }else {
            System.out.println("Wrong input");            
         }  
      }     
   }
   
   /*public void choose(){
   
   System.out.println("Choose your opponent..");
   System.out.println();
   System.out.println("[1] Goblin");
   System.out.println("[2] Skeleton");
   System.out.println("[3] Demon");
   
   }*/
   
   public void fight()throws InterruptedException{
     
      mon.hero();
      mon.enemy1();
     
      while(stop != false){    
      
         fightScreen();
      
      }
   }
   
   public void fightScreen()throws InterruptedException{
   
      count++;
      System.out.println("This is Turn: "+count);
      System.out.println();
      System.out.println("You are fighting: ");
      System.out.println("Name: "+mon.getName()+" Life: "+mon.getLife()+" Atk: "+mon.getAtk());
      System.out.println();
      System.out.println();
      System.out.println("Your stats:\n"+"Life: "+mon.getH_Life()+" Atk: "+mon.getH_Atk());        
      System.out.println();
      System.out.println("What are you gonna do?");
      
      System.out.println("[1] Attack");
      System.out.println("[2] Run");
         
      userInput = scan.next();
      
      if(userInput.equals("1")){
         mon.setH_Attack(mon.getH_Atk());
         mon.setE_Attack(mon.getAtk());
      }      
      else if(userInput.equals("2")){
         System.out.println();
         System.out.println("You ran away to fight another day..."); 
         stop = false;   
      }else{
         System.out.println("Wrong input, try again");
      }
   
   }
   
   public void howToPlay() throws InterruptedException{
      System.out.println();
      System.out.println("Purpose of the game is to slay the monsters of the dungeon.");
      System.out.println("Go to the dungeon and fight the monster and win by killing it.");
      System.out.println("Remember to block incomming attacks and use your potions since the monsters are way stronger than any human monventurer.");
      System.out.println("if you die, you lose.");
      System.out.println();
            
      System.out.print("Done remoning?: ");
      
      userInput = scan.next().toUpperCase();
      if(userInput.equals("YES")){
         timer();
         menuScreen();
      }else{
         howToPlay();
      } 
   }
   
   public void story() throws InterruptedException{
      System.out.println();
      System.out.println("You are an Adventurer who loves to fight dungeon monsters...");
      System.out.println();   
            
      System.out.print("Done remoning?: ");
      
      userInput = scan.next().toUpperCase();
      if(userInput.equals("YES")){
         timer();
         menuScreen();
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