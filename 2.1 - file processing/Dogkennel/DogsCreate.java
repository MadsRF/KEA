import java.io.*;
import java.util.*;

public class DogsCreate{   
   
   //Methods
   public void createDog(String name, String race, String color, int age, int cage, ArrayList<DogsValues> listOfDogs){
   
      listOfDogs.add(new DogsValues(name,race,color,age,cage));  
   }     
}   