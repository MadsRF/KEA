import java.util.*;

public class Dice{

   //attribut
   private int dice;
 
   Random r = new Random();

   //construtor
   public Dice(int dice){
   
      this.dice = dice;
         
   }

   //Gettter 
   public int getDice(){
   return dice;
   }
   
   //Methods
   public void rollDice(int number){
   
      dice = r.nextInt(number)+1; 
   }

}