import java.io.*;
import java.util.*;


public class MainIO{

   

   public static void main(String[]args)throws FileNotFoundException{

      
      Scanner answer = new Scanner(System.in);
      Scanner input = new Scanner(new File("1.dat"));
      ArrayList<MainIO> list = new ArrayList<MainIO>();

      while(input.hasNext()){
      int id = input.nextInt();
      String firstName = input.next();
      String lastName = input.next();
      
      
      }
      
      
      
      
      
      
      
      //write
      String file = "outputFile.txt";
      File myFile = new File(file);
      input = new Scanner(new File("2.dat"));
      PrintStream output = new PrintStream (new FileOutputStream(myFile, true));


   }

   public static void info(){
      int id = 0;
      String firstName = "";
      String lastName = "";
      int age = -1;
      String phoneNumber = "";
      String emailAdress ="";

   }





}