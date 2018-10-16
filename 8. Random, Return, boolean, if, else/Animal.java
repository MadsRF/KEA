public class Animal{

   //attributter
   private String species;
   private int x;
   private int y;
   
   //constructor
   public Animal(int x, int y, String species){
      this.x = x;
      this.y = y;
      this.species = species;
   }
   //getter X (not used)
   public int getx(){
      return this.x;
   }
   //getter Y (not used)
   public int gety(){
      return this.y;
   }
   //getter Species
   public String getSpecies(){
      return species;
   }   
   //method - where is animal
   public boolean isAnimalHere(int x, int y){   
      
      if ((this.x == x) & (this.y == y)){
      return true;     
   }
   return false; 
   }


}