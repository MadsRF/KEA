public class Jungle {   
   public static void main (String[] args){
      int kills = 0;
      String listOfAnimals = ("");
      Hunter predator = new Hunter("Buffalo Bill");
      Animal animal1 = new Animal("Hest");
      Animal animal2 = new Animal("Gnu");
      Animal animal3 = new Animal("Antilope");
      Animal animal4 = new Animal("Giraf");
      Animal animal5 = new Animal("Boeffel");
      
      System.out.println("Welcome to the Jungle! \n "+predator.getName()+ " is hunting from "+predator.getLocation()+"\n ");
      
      for (int x=1;x<=100;x++){
         for (int y=1;y<=100;y++){
            if(animal1.isAnimalHere(x,y)){
               System.out.println(animal1.getSpecies()+" fundet paa lokation("+x+","+y+")");
               if (predator.isWithinRange(x,y)){
                  kills++;
                  listOfAnimals+=animal1.getSpecies()+" ";
               }
             
            }  
            if(animal2.isAnimalHere(x,y)){
               System.out.println(animal2.getSpecies()+" fundet på lokation("+x+","+y+")");
               if (predator.isWithinRange(x,y)){
                  kills++;
                  listOfAnimals+=animal2.getSpecies()+" ";
               }             
            }
            if(animal3.isAnimalHere(x,y)){
               System.out.println(animal3.getSpecies()+" fundet på lokation("+x+","+y+")");
               if (predator.isWithinRange(x,y)){
                  kills++;
                  listOfAnimals+=animal3.getSpecies()+" ";
               }
            }
            if(animal4.isAnimalHere(x,y)){
               System.out.println(animal4.getSpecies()+" fundet på lokation("+x+","+y+")");
               if (predator.isWithinRange(x,y)){
                  kills++;
                  listOfAnimals+=animal4.getSpecies()+" ";
               }           }
            if(animal5.isAnimalHere(x,y)){
               System.out.println(animal5.getSpecies()+" fundet på lokation("+x+","+y+")");
               if (predator.isWithinRange(x,y)){
                  kills++;
                  listOfAnimals+=animal5.getSpecies()+" ";
               }
            }
         
          
           
         }
      }
      
    if (kills!=0){
      System.out.println("\n"+predator.getName()+" har nedlagt "+kills+" dyr: "+listOfAnimals);
    }else{
      System.out.println("\n"+predator.getName()+" har ikke set nogen byttedyr i dag!");
    }
   }  
}