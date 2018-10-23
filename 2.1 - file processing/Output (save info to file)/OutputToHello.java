// Variation of Hello2 that prints to a file.

import java.io.*;

public class OutputToHello {
   
   public static void main(String[] args) throws FileNotFoundException {
      
      PrintStream output = new PrintStream(new File("hello.txt"));
      
      
      
      output.println("Hello world.");
      output.println();
      output.println("This program produces four");
      output.println("lines of output.");
   }
}