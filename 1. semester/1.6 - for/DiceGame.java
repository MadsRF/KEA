public class DiceGame{

//atributter
   private static int j;
   private static int i;

   public static void main(String [] args){
      
   //object
      Dice d6 = new Dice(-1);
   
   
   //Rolls 10 times
      for (i=1; i <=10; i++){ 
         System.out.println("Try: " + i + " This times it's: ");
      
      //Random number between 1 and 6
         for (j=1; j <=3; j++){
         
         //Getter
            d6.rollDice(6);
         
         //PrintRoll
            System.out.println("#: " + d6.getDice());
         
         //WINNER
            if (d6.getDice() == 6){
               System.out.println("Congratulations! you win");
               System.out.println(""); 
               break;
            }                
            
            //LOSER
            else {
               if (j>=3 & d6.getDice() != 6){ 
                  System.out.println("LOSER!");
                  System.out.println("");        
               }        
            }
         }
      }
   }
}