public class Adventurer extends Monsters{

   public int getLife(){
      return super.defLife + 10;
   }
   public int getDamage(){
      return super.defDamage + 3;
   }
   public String getName(){
      return super.defName = "Adventurer";
   }

   public void attack(){
      
      System.out.println("You Attacked the " + getName() + "for " + getDamage());
   }
   public void parry(){
      
      System.out.println("You attacked the " + getName() + " for " + getDamage());
   
   }
   public void heal(){
      
      System.out.println("You healed back to " + getLife());
   
   } 



}