import java.util.*;

public class Adventurer{
      
   private int h_Life;
   private int h_Atk;
         
   public int getH_Life(){
      return h_Life;
   } 
   public void setH_Life(int life){
      this.h_Life = life;
   }   
   public int getH_Atk(){
      return h_Atk;
   }     

   public void hero(){
      this.h_Life = 20;
      this.h_Atk = 5;
      System.out.println();   
   }

   public void setH_Attack(int setLife)throws InterruptedException {
    
      Monsters mon = new Monsters();
      MenuHandling menu = new MenuHandling();
    
      mon.setLife(mon.getLife() - getH_Atk());    
      System.out.println("you're attacking!");
      menu.timer();
      System.out.println("you hit for: " + setLife);
      System.out.println();
            
      if(mon.getLife() <= 0){
         System.out.println();
         System.out.println("You defeated the "+mon.getName());
         System.out.println();
         System.out.println("~Congratulations!~");
         System.exit(0);    
      }  
   }
   


}