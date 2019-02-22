import java.io.*;
import java.util.*;

public class Wash{

int[] washes = {100,200};
String[] washTypes ={"clean","maximus"};

  public void wash(int type,String name)throws FileNotFoundException{
    Card washcard = new Card();
    File file = new File("statistic.txt");
    PrintStream output = new PrintStream(new FileOutputStream(file,true));

    switch (type) {
         case 1:
            if(washes[type-1]<=washcard.balance(name)){
            washcard.deduct(washes[type-1],name);
            output.println(name+type+":"+washTypes[type-1]+"       "+washes[type-1]);
            break;
          }else{System.out.println("not enough funds!"); break;}

         case 2:
         if(washes[type-1]<=washcard.balance(name)){
            washcard.deduct(washes[type-1],name);
            output.println(name+type+":"+washTypes[type-1]+"       "+washes[type-1]);
            break;
          }else{System.out.println("not enough funds!"); break;}
    }

  }




}
