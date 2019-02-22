import java.util.*;

//uses abstract to tell what the sub classes should have in them
//while superclass just gives it stuff
public abstract class SuperAnimal{
   
   //attributs 
   private String name;
   private int x = 1;
   private int y = 1;
   
   //object
   Random r = new Random(); 

   //constructor
   public SuperAnimal(String name, int x, int y){
   
   this.name = name;
   this.x = x;
   this.y = y;
   }
   
   public abstract void makeSound();
   
   //overloading
   public SuperAnimal(){
   }
   
   //getter og setter
   public void setName(String name){
      this.name = name; 
   }
   public String getName(){
      return name;
   }   
   public void setX(int x){
      this.x = x; 
   } 
   public int getX(){
      return x;
   }   
   public void setY(int y){
      this.y = y; 
   } 
   public int getY(){
      return y;
   }   
   
   //methods
   public void animalMove(){   
      
      this.x=r.nextInt(10)+1; 
      this.y=r.nextInt(10)+1;
   }
   public void talk(){
      System.out.println("im boring");
   }



}