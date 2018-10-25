//nye filer tilføje slette
//skrivemaskine
import java.io.*;
import java.util.*;

public class ReadFileFun{
  
 public void readDiary() throws IOException, FileNotFoundException {
   String inputToken = "";
   Scanner readFile = new Scanner(new File("Logbog.txt"));
   while (readFile.hasNextLine()) {
      System.out.println(readFile.nextLine());  
   }
 }
}