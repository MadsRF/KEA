import java.util.*;
import java.io.*;

public class DogKennelMain{
   
   //main
   public static void main(String []args) throws FileNotFoundException{
   
      //objects
      Scanner input = new Scanner(new File("DogInfo.txt"));
      ArrayList<DogsValues> listOfDogs = new ArrayList<DogsValues>();  
            
      //reads from file
      while(input.hasNext()){
         String name = input.next();
         String race = input.next();
         String color = input.next();
         int age = input.nextInt();
         int cage = input.nextInt();        
         
         listOfDogs.add(new DogsValues(name, race, color, age, cage));
      }
     
      //keeps running code
      while (2 != 1){
      
         //writes to file
         PrintStream output = new PrintStream("DogInfo.txt");
         for(DogsValues d : listOfDogs){
            output.println(d.getName() + " " + d.getRace() + " " + d.getColor() + " " + d.getAge() + " " + d.getCage());
         }  
         
         Menu menu = new Menu();
         menu.entryMenu(listOfDogs);
         
         
      }   
   }   
}