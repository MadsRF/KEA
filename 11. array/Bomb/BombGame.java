import java.util.*;  

public class BombGame {

   public static void main(String args[]){

      //Objects
      boolean[][] gM = new boolean[10][10];
      NewBomb bombField = new NewBomb();
      bombField.bombs(gM);   
      Scanner scan = new Scanner(System.in);
      
      //Attributs
      int x = 0;
      int y = 0;
      int input = 0;
      String answer;      
      
      //Ask player to play
      System.out.println("Do you wanna play a game? [Yes/No]");
      String start = scan.nextLine();
      if(start.equals("yes") || start.equals("YES")) {
      //Game start print
      System.out.println("You are standing in " + (x+1) + "," + (y+1) + " get to 10,10 without hitting any bombs");
      System.out.println("Use the keypad to move: 4=Left, 6=Right, 8=Up, 2=Down and 5=Esc");
      }else if (start.equals("no") || start.equals("NO")) { 
         System.out.println("LOSER!");
         System.exit(0);
      }else{
         System.out.println("Error, Wrong Input");
      }
      
      do{
         do{ System.out.println("You are standing in " + (x+1) + "," + (y+1));
            //Checks if bombs are close to player
            if ((x<9 && gM[x+1][y]) || (x>0 && gM[x-1][y]) || (y>0 && gM[x][y-1]) || (y<9 && gM[x][y+1])){
               System.out.println("You are close to a bomb! Watch Out!");
            }
            //Input and move
            input = scan.nextInt();
            System.out.println();
           
            if (x>0 & input==4){
               x--;
            }if (x<9 & input==6){
               x++;
            }if (y>0 & input==2){
               y--;
            }if (y<9 & input==8){
               y++;
            }if (gM[x][y]) {
               System.out.println("BOOM! YOU ARE DEAD!");
               break;
            }if (x==9 & y==9){
               System.out.println("Congratulations! you didn't blow up!");
               break;
            }
         
         } while (input != 5);
         //Reset game
         System.out.print(" Play Again? [Yes/No] ");
         answer = scan.next();
         x=0;
         y=0;
         bombField.bombs(gM);
      
      } while ((answer.equals("yes") || answer.equals("YES")));
   }
}