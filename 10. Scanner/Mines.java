import java.util.*;

public class Mines{

   //attributter
   private int x;
   private int y;
   private int lok;  
   private int maxX = 10;
   private int maxY = 10;
   Scanner scan = new Scanner(System.in);
   
   //construtor
   public Mines(){
   this.x = x;
   this.y = y;
   } 
   //construtor overload
   public Mines(int x, int y){
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
   //move player
   public void move(){
      
      lok = scan.nextInt();
        
      if((lok == 4) && x>1){
         x=x-1;  
      }
      if((lok == 6) && x<maxX){
         x=x+1;  
      }
      if((lok == 2) && y>1){
         y=y-1;  
      }
      if((lok == 8) && y<maxY){
         y=y+1;   
      }   
      if (lok == 5){
         System.out.println("You Quit, You Suck!");
         System.exit(0);      
      }
   
   }
   public boolean bombRange(int x, int y){   
   return((x >= this.x -1 & x <= this.x+1) && (y >= this.y -1 & y <= this.y+1));
   }     
}