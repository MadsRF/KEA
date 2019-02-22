//nye filer tilføje slette
//skrivemaskine
import java.io.*;
import java.util.*;

public class WriteFileFun{
  
  public void appendToDiary()  {
  
   String inputToken = "";
   try {
   PrintStream writeFile = new PrintStream(new FileOutputStream("Logbog.txt",true));//FileWriter writeFile = new FileWriter(new OutputStreamWriter("Logbog2.txt",true));
   Scanner scan = new Scanner(System.in);
  
   System.out.println("Velkommen til din Dagbog - Tilføj til din log og afslut ved at skrive: //STOP :");  
   
   inputToken = scan.nextLine();
   while ( !inputToken.equals("//STOP") ){
     writeFile.println(inputToken);
     inputToken = scan.nextLine();
   }
   writeFile.close(); // lukker og frigiver filen 
   
  
  }
  catch (FileNotFoundException e) {
    System.err.println("FileNotFound!!!" + e.getMessage());
  }
}
}