//l�se/skrive i filer
import java.io.*;
import java.util.*;

public class FileFun2cnt{
  
   public static void main(String args[]) throws FileNotFoundException {
   
      String inputToken = "";
      Scanner readFile = new Scanner(new File("a.txt"));
      Scanner stringAnalyze = new Scanner(inputToken);
      PrintStream writeFile = new PrintStream(new FileOutputStream("b.txt",true));  
   
      System.out.println("Velkommen til fil-fletning  (A->B) + antal ord og tal :" );
   
      while (readFile.hasNextLine()) {
         inputToken = readFile.nextLine();//l�s fra a.txt
         writeFile.println(inputToken);//tilf�j til B.txt
      }
      writeFile.println();//start p� ny line til appending file
      writeFile.close();//luk skrivning frigiv fil.
      readFile.close();//luk scanner
   
      Scanner analyzeFile = new Scanner(new File ("b.txt"));
      int numCnt  = 0;
      int wordCnt = 0;
      while (analyzeFile.hasNext()) {
         if (analyzeFile.hasNextFloat()) {
            numCnt++;
         }else{
            wordCnt++;
         }
         analyzeFile.next();//l�s og smid v�k!
      }
      analyzeFile.close();
      System.out.println("Fil B har: "+wordCnt+" Ord, og: "+numCnt+ " tal.");
    
   }
}
