//nye filer tilføje slette
//skrivemaskine
import java.io.*;
import java.util.*;

public class FileFun{
  
  public static void main(String args[]) throws IOException {
  
   String inputToken = "";
   Scanner scan = new Scanner(System.in);
  
   System.out.println("Velkommen til din Dagbog - Vil du hente indhold? skriv: [1]");
   System.out.print("Vil du Tilføje til din log o skriv [2] (afslut skrivning ved at skrive: //STOP) :");  
   inputToken=scan.nextLine();
   
   if (inputToken.equals("1")){
     ReadFileFun reader = new ReadFileFun();
     reader.readDiary() ;
   } else {
     if (inputToken.equals("2")){
       WriteFileFun writer = new WriteFileFun();
       writer.appendToDiary();
     } else {
       System.out.println("Input ikke genkendt - prgrammet afsluttes");
     }
   }
}
}
   
