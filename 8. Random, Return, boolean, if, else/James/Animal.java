import java.util.*; 
public class Animal {   
   private int x=0;
   private int y=0;
   String species="Alien";
   Random r= new Random();
   
   public Animal (String species){
      this.species=species;
      x=r.nextInt(100)+1; 
      y=r.nextInt(100)+1;
    }  
    public String getSpecies(){
      return this.species;
    }
    public boolean isAnimalHere(int x,int y){
      return this.x==x && this.y==y;
    }
    
}