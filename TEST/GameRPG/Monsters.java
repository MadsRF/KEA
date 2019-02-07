import java.util.*;

public class Monsters{
   
   protected int defLife = 10;
   protected int defDamage = 1;
   protected String defName = "monster";

   protected Random rand = new Random();

   /*public Monsters(int life, int damage, String name){

      this.defLife = life;
      this.defDamage = damage;
      this.defName = name;
   }*/
    
   void setLife(int life){
      this.defLife = life;
   }
   public int getLife(){
      return defLife;
   }
   void setDamage(int damage){
      this.defDamage = damage;
   }
   public int getDamage(){
      return defDamage;
   }
   void setName(String name){
      this.defName = name;
   }
   public String getName(){
      return defName;
   }
  
  
   public void attack(){
      
      System.out.println("You got Attacked by the " + getName() + "for " + getDamage());
   }
   public void parry(){
      
      System.out.println(getName() + " attacked you for " + getDamage());
   
   }
   public void heal(){
      
      System.out.println("The " + getName() + " healed back to " + getLife());

   } 







}