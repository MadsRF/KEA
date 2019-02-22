import java.util.*;

public class Monsters{

   private int life;
   private int atk;
   private String name;
   
   private int h_Life;
   private int h_Atk;
   
      /*public Monsters(int life, int atk, String name){
      this.life = life;
      this.atk = atk;
      this.name = name; 
   }*/
         
   public int getH_Life(){
      return h_Life;
   } 
   public void setH_Life(int life){
      this.h_Life = life;
   }   
   public int getH_Atk(){
      return h_Atk;
   }     
   public void setLife(int life){
      this.life = life;
   }  
   public int getLife(){
      return life;
   }
   public int getAtk(){
      return atk;
   }
   public String getName(){
      return name;
   }      
  
   public void setE_Attack(int setH_Life)throws InterruptedException {  
      
      //Adventurer ad = new Adventurer();
      MenuHandling menu = new MenuHandling();
      
      setH_Life(getH_Life() - getAtk());    
      menu.timer();
      System.out.println(getName()+" hit you back for "+setH_Life);
      System.out.println();
      Thread.sleep(1000);
           
      if(getH_Life() <= 0){
         System.out.println();
         System.out.println("You got defeated by the "+getName());
         System.out.println();
         System.out.println("~You Lose!~");
         System.exit(0);    
      }     
   }
   
   public void enemy1(){
      this.life = 10;
      this.atk = 2;
      this.name = "Goblin";     
   }

   public void setH_Attack(int setLife)throws InterruptedException {
    
      //Monsters mon = new Monsters();
      MenuHandling menu = new MenuHandling();
    
      setLife(getLife() - getH_Atk());    
      System.out.println("you're attacking!");
      menu.timer();
      System.out.println("you hit for: "+setLife);
      System.out.println();
            
      if(getLife() <= 0){
         System.out.println();
         System.out.println("You defeated the "+getName());
         System.out.println();
         System.out.println("~Congratulations!~");
         System.exit(0);    
      }  
   }
   
   public void hero(){
      this.h_Life = 20;
      this.h_Atk = 5;
      System.out.println();   
   }

}
