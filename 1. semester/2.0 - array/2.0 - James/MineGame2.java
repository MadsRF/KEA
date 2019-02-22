import java.util.*;  //Scanner & Random
public class MineGame2 {
   public static void main(String args[]){
      boolean[][] gameMatrix= new boolean[10][10];
      Mines2 mineField = new Mines2();
      mineField.newMines(gameMatrix);   
      Scanner getInput = new Scanner(System.in);
      int x = 0;
      int y = 0;
      int input = 0;
      String answer = "N";      
      System.out.println("Du Skal sejle fra (1,1) til (10,10) uden at ramme en mine (2-ned,4-tv,6-th,8-op, 5=ESC") ;   
      do{
         do{
            System.out.println("Du staar paa : ("+ (x+1) +","+ (y+1) +")");
            
            // her bruger vi && på den smarte måde vi spørger om x>1 og om arrayet i x-1 - er x 1 bliver det ulovlligt men && redder os
            if ((x<9 && gameMatrix[x+1][y]) || (x>0 && gameMatrix[x-1][y]) || (y>0 && gameMatrix[x][y-1]) || (y<9 && gameMatrix[x][y+1])){
               System.out.println("ADVARSEL - Mine tæt paa!!!");
            }
            System.out.print("Flyt (2=ned,8=op,4=th,6=tv, [5=ESC] :");
            input = getInput.nextInt();
            System.out.println();
           
            if (x>0 & input==4){
               x--;
            } 
            if (x<9 & input==6){
               x++;
            } 
            if (y>0 & input==2){
               y--;
            } 
            if (y<9 & input==8){
               y++;
            }                
                    
            if (gameMatrix[x][y]) {
               System.out.println("BOOOM!!! Du ramte en mine");
               break;
            }
            if (x==9 & y==9){
               System.out.println("FLOT!! Du sejlede sikkert igennem minefeltet");
               break;
            }
         
         } while (input != 5);
         System.out.print(" Vil du spille igen? [J/N]: ");
         answer = getInput.next();
         x=0;
         y=0;
         mineField.newMines(gameMatrix);
      } while ((answer.equals("j") || answer.equals("J")));
   }
}