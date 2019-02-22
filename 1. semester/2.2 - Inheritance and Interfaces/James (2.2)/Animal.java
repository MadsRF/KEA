import java.lang.Math;
public abstract class Animal{ //genrelle egenskaber for dyr BEMÆRK Abstarkt klasse = vi kan både have metoder med og uden krop (og variable :-))
   private int[] xyPos = new int[2];//xy-koord
   private String name = "Guinea Pig";  
   int maxX = -1;
   int maxY = -1; 
   public Animal(int x, int y, String name){//constructor
      this.name=name;
      this.maxX=x;//banen som dyret må være i
      this.maxY=y;
   }
   public String getName(){
      return this.name;
   }
   public int[] getPos(){
      return xyPos;
   }
   public void setPos(int[] pos){
      this.xyPos[0]=pos[0];//sætter koord enekltvis så arrayet ikke bare peger samme sted hen :-)
      this.xyPos[1]=pos[1];
    //kontroller at vi er indenfor banen.
      if (this.xyPos[0]<1){
         this.xyPos[0]=1;
      }else{
         if (this.xyPos[0]>maxX){
            this.xyPos[0]=maxX;
         }
      }
      if (this.xyPos[1]<1){
         this.xyPos[1]=1;
      }else{
         if (this.xyPos[1]>maxY){
            this.xyPos[1]=maxY;
         }
      }
   
       
   }
   public boolean isEqual(int[] a){
      int[] b = getPos();
      return (a[0]==b[0] && a[1]==b[1]);
   }  
   public boolean isWithinRange(int moves, int[] a){
      int[] b = getPos();
      if (Math.abs(a[0]-b[0])<=moves && Math.abs(a[1]-b[1])<=moves) {
         return true;
      }else{
         return false;
      }
   }

}