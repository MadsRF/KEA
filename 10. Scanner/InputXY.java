import java.util.*;
import javax.swing.JOptionPane;

public class InputXY{

   //objekter og atribut
   private int x = 5;
   private int y = 5;  
   private int lok;  
   private int maxX = 10;
   private int maxY = 10;
   Scanner scan = new Scanner(System.in);
   
   //constructor
   public InputXY(int x, int y){
      this.x = x;
      this.y = y;
   }
  
   //getx
   public int getx(){
      return x;
   }
  
   //gety
   public int gety(){
      return y;
   }
   
   //snake move
   public void move(){
            
      lok = scan.nextInt();
        
      if((lok == 1 || lok == 4 || lok == 7) && x>1){
         x=x-1;  
      }
      if((lok == 3 || lok == 6 || lok == 9) && x<maxX){
         x=x+1;  
      }
      if((lok == 1 || lok == 2 || lok == 3) && y>1){
         y=y-1;  
      }
      if((lok == 7 || lok == 8 || lok == 9) && y<maxY){
         y=y+1;   
      }
      if (lok == 5){
         JOptionPane.showMessageDialog(null,"   You Quit, You Suck!");
         System.exit(0);
      }
   }
      
   //rabbit move
   public void move2(int lok){
      
      if((lok == 1 || lok == 4 || lok == 7) && x>1){
         x=x-1;  
      }
      if((lok == 3 || lok == 6 || lok == 9) && x<maxX){
         x=x+1;  
      }
      if((lok == 1 || lok == 2 || lok == 3) && y>1){
         y=y-1;  
      }
      if((lok == 7 || lok == 8 || lok == 9) && y<maxY){
         y=y+1;   
      }          
   }

}





