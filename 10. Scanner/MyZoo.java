import java.util.*;
import javax.swing.JOptionPane;

public class MyZoo{

//Attributs
   private static int xcheck;
   private static int ycheck;

   public static void main(String[]args){
   
   //Objects
      Random r = new Random();
      InputXY snakeInput = new InputXY(1,1);
      InputXY rabbitInput = new InputXY(6,6);
   
   //Print start game
      System.out.println("\t\t\tWelcome to my Little Horror Zoo");
      System.out.println("The objective of the game is to catch and eat the Rabbit");
      System.out.println("Use the keypad to move using 1-9 (Press 5 to quit)");
      System.out.println("");
      System.out.println("You the Snake are standing in:\t" + snakeInput.getx() + "," + snakeInput.gety());
      System.out.println("The Rabbit is standing in:\t\t\t" + rabbitInput.getx() + "," + rabbitInput.gety());
     
     //Game
      while (snakeInput.getx() != rabbitInput.getx() || snakeInput.gety() != rabbitInput.gety()){
       
        
        //Snake move
         snakeInput.move();
         System.out.println("You moved to:\t\t" + snakeInput.getx() + "," + snakeInput.gety());     
         
         xcheck = Math.abs(snakeInput.getx() - rabbitInput.getx());
         ycheck = Math.abs(snakeInput.gety() - rabbitInput.gety());
         
        /*Rabbit random move 
        "Sometimes checks if the Snake is near the Rabbit" (dosen't really work)*/
         if (xcheck != 1 || ycheck != 1){
            rabbitInput.move2(r.nextInt(9) + 1);
            System.out.println("Rabbit Jumped to:\t" + rabbitInput.getx() + "," + rabbitInput.gety());
         }else{
            System.out.println("Rabbit Jumped to:\t" + rabbitInput.getx() + "," + rabbitInput.gety() + " OH! NO! PLZ DON'T EAT ME");
         }
         if (snakeInput.getx() == rabbitInput.getx() && snakeInput.gety() == rabbitInput.gety()){
            System.out.println("OH! NO! I'm Dead!");
         }
      }   
      
      //Win print dialogbox
      JOptionPane.showMessageDialog(null, "  Congratulations! You Win!");
      JOptionPane.showMessageDialog(null, "  Try Again? Press Ctrl+R");
   
   
   
   }

}