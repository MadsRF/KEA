import java.io.*;
import java.util.*;

public class Merger{

   //Attributs
   static Scanner input = new Scanner(System.in);   

   
   public static void main(String[]args) throws FileNotFoundException{
   
      Copy();
      Count();
   
   }

   //method to read content from output file 
   public static void Count() throws FileNotFoundException{
      
      input = new Scanner(new File("outputFile.txt"));
      int words = 0;
      int numbers = 0;
      
      while (input.hasNext()){ 
      
         if (input.hasNextInt()) {            
            numbers++;
            input.nextInt();
         }else{   
            words++;
            input.next();
         }         
      }
      System.out.println("Total words: " + words);
      System.out.println("Total numbers: " + numbers);
   } 
   
   //copies content from input file to output file 
   public static void Copy() throws FileNotFoundException{
      String file = "outputFile.txt";
      File myFile = new File(file);
      input = new Scanner(new File("inputFile.txt"));
      PrintStream output = new PrintStream (new FileOutputStream(myFile, true));
   
      while (input.hasNextLine()) {
         String text = input.nextLine(); 
         output.println(text);
      }
   }      
   
}