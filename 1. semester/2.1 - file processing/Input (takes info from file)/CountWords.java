// Counts the number of words in Hamlet.

import java.io.*;
import java.util.*;

public class CountWords {
   
   public static void main(String[] args)
   
   //needs this to not make error
   throws FileNotFoundException {
      
      //remember "new file"
      Scanner input = new Scanner(new File("hamlet.txt"));
      
      //Counts words in file
      
      //start from 0
      int count = 0;
      
      //keep doing this until there is no more words
      while (input.hasNext()) {
         String word = input.next();
         count++;
      }
      //print
      System.out.println("total words = " + count);
   }
}