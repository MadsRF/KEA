import java.util.Scanner;
import java.lang.Math;

public class Zoo{

   //Declare variables
   private static int xcheck;
   private static int ycheck;
   private static String direction;
   private static String convertDirection;

  public static void main(String[] args){
      //Create objects
      Scanner input = new Scanner(System.in);
      Animal snakemove = new Animal(2,2);
      Animal rabbitmove = new Animal(8,8);
      
      //Welcome Message
      System.out.println("Welcome to the Horror Zoo");
      System.out.println("Directions are: Left, Right, Up and Down. Enter q at anytime to quit");
      System.out.println("You are located in: " + snakemove.getx() + "," + snakemove.gety());
      System.out.println("The rabbit are located in: " + rabbitmove.getx() + "," + rabbitmove.gety() );
      System.out.println("");

      //while loop to keep program runnning until the animals is located on the same square
      while (snakemove.getx() != rabbitmove.getx() | snakemove.gety() != rabbitmove.gety()){
             
       //Snake move code (Player)
        System.out.println("Enter the direction for the snake");
        direction = input.nextLine();
        snakemove.moveunit(direction);
        System.out.println("");
        
        //Check to see how close animals are to each other
        xcheck = Math.abs(snakemove.getx() - rabbitmove.getx());
        ycheck = Math.abs(snakemove.gety() - rabbitmove.gety()); 
                 
        //Rabbit random move (Computer)
        //Rabbit only moves if the snake is not within 1 square, otherwise it is stunned by fear           
       if ((Math.min(xcheck, (10-xcheck)) == 1 && Math.min(ycheck, (10-ycheck)) == 0) || (Math.min(xcheck, (10-xcheck)) == 0 && Math.min(ycheck, (10-ycheck)) == 1)){
         System.out.println("Rabbit: aargh im getting eaten!");
       }else if(snakemove.getx() == rabbitmove.getx() & snakemove.gety() == rabbitmove.gety()){
         System.out.println("UGH IM DEADED!");
       }else{
         System.out.print("Rabbit moves: ");
         convertDirection = rabbitmove.convertarray();
        //use the converted int in the same move method as the snake
        rabbitmove.moveunit(convertDirection);
       } 
        System.out.println("");
        System.out.println("");
      }
   System.out.println("The snake ate the rabbit, you won the game!");
   }
}
