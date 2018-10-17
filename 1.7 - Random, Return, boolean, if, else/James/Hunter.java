import java.util.*; 
public class Hunter {   
   int x = 0;
   int y = 0;
   String name = "?";
   Random r = new Random();
   
   
   public Hunter (String name){
      x=r.nextInt(100)+1;
      y=r.nextInt(100)+1;
      this.name=name;      
   } 
   public String getName(){
     return this.name;
   } 
   public boolean isWithinRange(int x, int y){
     return this.x-16 <= x && x<= this.x+16 && this.y-16<=y && y<=this.y+16;
   }
    public String getLocation(){
     return "("+this.x+","+this.y+")";
   }
}