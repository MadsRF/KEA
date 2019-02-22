import java.util.*;
import java.io.*;

public class Menu{
   
   //attributs
   private String name;
   private String race;
   private String color;
   private int age;
   private int cage;
   private String ans;
   
   //objects
   private Scanner input = new Scanner(System.in);
   DogsCreate create = new DogsCreate();
   
   //method startmenu
   public void entryMenu(ArrayList<DogsValues> listOfDogs)throws FileNotFoundException{ 
   
      System.out.println("Welcome to the dogkennel");
      System.out.println("");
   
      System.out.println("[1] Submit a new dog to the kennel?");
      System.out.println("[2] See dogs over 5 years?");
      System.out.println("[3] Exit system");
      
      ans = input.nextLine();
           
      if(ans.equals("1")){
         createNew(listOfDogs);
      }   
      else if(ans.equals("2")){
         findAge(listOfDogs);
      }   
      else if(ans.equals("3")){
         System.out.println("Bye");
         System.exit(0);
      }else{System.out.println("Wrong input");System.out.println();}
   }
   
   //make new dog
   public void createNew(ArrayList<DogsValues> listOfDogs){
      
      System.out.println("input your dog's name?");
      name = input.nextLine();
      System.out.println("input your dog's race?");
      race = input.nextLine();
      System.out.println("input your dog's color?");
      color = input.nextLine();
      System.out.println("input your dog's age?");
      age = input.nextInt();
      System.out.println("input your dog's cage?");
      cage = input.nextInt();
      
      create.createDog(name,race,color,age,cage,listOfDogs);      
   }
   
   //finds dogs whos 5 or older
   public void findAge(ArrayList<DogsValues> listOfDogs)throws FileNotFoundException{
      
      Scanner input = new Scanner(new File("DogInfo.txt"));
      
      for(DogsValues d : listOfDogs){
            
         if(d.getAge() >= 5){
            System.out.println("Dogs name: " + d.getName() + " and it's " + d.getAge() + " years old.");
         }    
      }   
      System.out.println();
   }


}