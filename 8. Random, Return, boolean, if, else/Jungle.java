import java.util.Random;

public class Jungle{

  
   public static void main(String[]args){
 
   //Attributter
   Random r = new Random(); 
   int kill = 0;
   String deadAnimals = "";
   
   //Objects Animals
   Animal an1 = new Animal(r.nextInt(100)+1,r.nextInt(100)+1,"Herold Hippo");
   Animal an2 = new Animal(r.nextInt(100)+1,r.nextInt(100)+1,"Leo Lion");
   Animal an3 = new Animal(r.nextInt(100)+1,r.nextInt(100)+1,"Mandy Monkey");
   Animal an4 = new Animal(r.nextInt(100)+1,r.nextInt(100)+1,"Freddy Frog");
   Animal an5 = new Animal(r.nextInt(100)+1,r.nextInt(100)+1,"Lizzy Lizard");
   
   //Object Hunter
   Hunter hunt = new Hunter(r.nextInt(100)+1,r.nextInt(100)+1,"The Hunter");

   //Print intro
   System.out.println("Welcome to the jungle, let's find all the animals.");
   System.out.println();
   
   //Area to search in
   do{
   for (int x = 1; x <= 100; x++){ 
      for (int y = 1; y <= 100; y++){        
  
   //Finding animals    
     
         
         if(an1.isAnimalHere(x,y) == true){
         System.out.println(an1.getSpecies() + ":\t " + "(" + x + "," + y + ")");
         if (hunt.isWithinRange(x,y) == true){
            kill = kill+1;
            deadAnimals = deadAnimals + an1.getSpecies();
         }
         }  
            else if(an2.isAnimalHere(x,y) == true){
            System.out.println(an2.getSpecies() + ":\t\t " + "(" + x + "," + y + ")");
            if (hunt.isWithinRange(x,y) == true){
            kill = kill+1;
            deadAnimals = deadAnimals + an2.getSpecies();
            }
            }
            else if(an3.isAnimalHere(x,y) == true){
            System.out.println(an3.getSpecies() +":\t " + "(" + x + "," + y + ")");      
            if (hunt.isWithinRange(x,y) == true){
            kill = kill+1;
            deadAnimals = deadAnimals + an3.getSpecies();
            }
            }     
            else if(an4.isAnimalHere(x,y) == true){
            System.out.println(an4.getSpecies() +":\t " + "(" + x + "," + y + ")");      
            if (hunt.isWithinRange(x,y) == true){
            kill = kill+1;
            deadAnimals = deadAnimals + an4.getSpecies();
            }
            } 
            else if(an5.isAnimalHere(x,y) == true){
            System.out.println(an5.getSpecies() +":\t " + "(" + x + "," + y + ")");      
            if (hunt.isWithinRange(x,y) == true){
            kill = kill+1;
            deadAnimals = deadAnimals + an5.getSpecies();
            }
            }
      }
      
   }
   }while(kill != 1);
   
   //Hunter print hvis han rammer og misser
   System.out.println("");
   if (kill == 0){
   System.out.println(hunt.getHunter() + " on location " + hunt.getterHunter() + " killed no animals and went home hungry.");   
   }else{
   System.out.println(hunt.getHunter() + " on location " + hunt.getterHunter() + " Shot and killed: " + deadAnimals);   
   }
}

}