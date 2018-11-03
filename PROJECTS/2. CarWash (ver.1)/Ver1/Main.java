import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args)throws FileNotFoundException{

      int go=1;
      int go2=0;
      int go3;
      Scanner input = new Scanner(System.in);

      while(go==1){
      System.out.println("Welcome!");
      System.out.println("do you want to use the software?");
      String answer = input.nextLine();
      if(answer.equals("yes")){
        go3 = 0;
        go2 = 1;
      }else if(answer.equals("no")){
        go = 0;
      }else{
        System.out.println("wrong input");}

      while(go2==1){
      answer=null;
      Menu menu = new Menu();
      go3 = menu.entryMain();

      go2 = go3;
      }

      }

    }

}
