import java.util.*;  //Scanner & Random
public class MineGame {
   public static void main(String args[]){
      Mines mineField = new Mines();
      mineField.newMines();
      Scanner getInput = new Scanner(System.in);
      int x = 1;
      int y = 1;
      int input = 0;
      String answer = "N";
      System.out.println("Du skal sejle fra (1,1) til (10,10) uden at ramme en mine (2-ned,4-tv,6-th,8-op, 5=ESC");
      do{
         do{
         
            System.out.println("Du staar paa : ("+x+","+y+")");
            if (mineField.isMine(x+1,y) || mineField.isMine(x-1,y) || mineField.isMine(x,y+1) || mineField.isMine(x,y-1)){
               System.out.println("ADVARSEL - Mine tæt paa!!!");
            }
            System.out.print("Flyt (2=ned,8=op,4=th,6=tv, [5=ESC] :");
            input = getInput.nextInt();
            System.out.println();
            if ((input==4)&&(x>1)){
               x--;
            }
            if ((input==6)&&(x<10)){
               x++;
            }
            if ((input==2)&&(y>1)){
               y--;
            }
            if ((input==8)&&(y<10)){
               y++;
            }
            if (mineField.isMine(x,y)){
               System.out.println("BOOOM!!! Du ramte en mine");
               break;
            }    
         }while (input != 5);
         System.out.print(" Vil du spille igen? [J/N]: ");
         answer = getInput.next();
         x=1;
         y=1;
         mineField.newMines();
      }while ((answer.equals("j") || answer.equals("J")));
   }
}