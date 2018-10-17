public class Hunter{

   //attributter
   private String name;
   private int x;
   private int y;
   
   //constructor
   public Hunter(int x, int y, String navn){
   this.x = x;
   this.y = y;
   this.name = navn;
   }
   //getter Hunter
   public String getHunter(){
      return this.name;
   }
   //getHunter location
   public String getterHunter(){
   return "(" + x +"," + y + ")";
   }     
   //Methods
   public boolean isWithinRange(int x, int y){   
   return((x >= this.x -16 & x <= this.x+16) & (y >= this.y -16 & y <= this.y+16));
   }    
}