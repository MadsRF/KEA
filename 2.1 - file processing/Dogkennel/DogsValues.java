import java.util.*;
import java.io.*;

public class DogsValues{

   //Attributes 
   private String name;
   private String race;
   private String color;
   private int age;
   private int cage;
   
   //Constructor
   public DogsValues(String name, String race, String color, int age, int cage){
   
      this.name   =  name;
      this.race   =  race;
      this.color  =  color;
      this.age    =  age;
      this.cage   =  cage;   
   }
   
   //Setter and Getter
   public void setName(String name){
      this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setRace(String race){
      this.race=race;
   }
   public String getRace(){
      return race;
   }
   public void setColor(String color){
      this.color=color;
   }
   public String getColor(){
      return color;
   }
   public void setAge(int age){
      this.age=age;
   }
   public int getAge(){
      return age;
   }
   public void setCage(int cage){
      this.cage=cage;
   }
   public int getCage(){
      return cage;
   } 
}