import java.util.*;

public class BombGame{

   //Attributs
   public static void main(String[] Args){
   
   //PLayer
      Mines p = new Mines(1,1);
   //Scan/Random/Objects
      Scanner scan = new Scanner(System.in);     
      Random r = new Random();
      int x;
      int y;
   //MINES
      Mines b1 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b2 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b3 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b4 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b5 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b6 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b7 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b8 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b9 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
      Mines b10 = new Mines(r.nextInt(10)+1,r.nextInt(10)+1);
   
   //start print
      System.out.println("Do you wanna play a game? [Y/N]");
      String answer = scan.nextLine();
      if(answer.equals("y") || answer.equals("Y")) {
         System.out.println("You are standing in " + p.getx() + "," + p.gety() + " get to 10,10 without hitting any bombs");
         System.out.println("Use keypad to move: 4=Left, 6=Right, 8=Up, 2=Down and 5=Esc");
      }else if (answer.equals("n") || answer.equals("N")) { 
         System.out.println("LOSER!");
         System.exit(0);
      }else{
         System.out.println("Error, Wrong Input");
      }
   
   //Game
      do {
         do {
         
         //player move display
            p.move();
            System.out.println("You are in: " + p.getx() + "," + p.gety());          
         
         //Close bomb
            if (p.bombRange(b1.getx(),b1.gety()) == true){ 
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b2.getx(),b2.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b3.getx(),b3.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b4.getx(),b4.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b5.getx(),b5.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b6.getx(),b6.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b7.getx(),b7.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b8.getx(),b8.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b9.getx(),b9.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }else if (p.bombRange(b10.getx(),b10.gety()) == true){
               System.out.println("You are close to a bomb! Watch Out!");
            }
         
         //Hit bomb
            if (p.getx() == b1.getx() && p.gety() == b1.gety() || p.getx() == b2.getx() && p.gety() == b2.gety() || p.getx() == b3.getx() && p.gety() == b3.gety() || p.getx() == b4.getx() && p.gety() == b4.gety() || p.getx() == b5.getx() && p.gety() == b5.gety() || p.getx() == b6.getx() && p.gety() == b6.gety() || p.getx() == b7.getx() && p.gety() == b7.gety() || p.getx() == b8.getx() && p.gety() == b8.gety() || p.getx() == b9.getx() && p.gety() == b9.gety() || p.getx() == b10.getx() && p.gety() == b10.gety()){
               System.out.println("BOOM! YOU ARE DEAD!");
               break;
            }
            
         //Win print
            if (p.getx() == 10 && p.gety() == 10){
               System.out.println(""); 
               System.out.println("Congratulations! you didn't blow up!");
               break;
            }
         }while (p.getx() != 10 || p.gety() != 10);
         
         //Win print
         System.out.println(""); 
         System.out.println("Play Again? [Y/N]");      
            
         scan.next();
         x=1;
         y=1;
         p.move();
            
      }while ((answer.equals("y") || answer.equals("Y")));
   }            
}