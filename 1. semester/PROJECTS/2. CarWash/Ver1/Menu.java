import java.util.*;
import java.io.*;

public class Menu{

private int go=0;
Card washcard = new Card();
Wash wash = new Wash();
private String name;
Scanner input = new Scanner(System.in);
//private String answer;


public int entryMain()throws FileNotFoundException{
    String answer = null;
    System.out.println("Do you have a washCard acc?");
    answer = input.nextLine();

    if (answer.equals("yes")){
      entryCard();
    }else if(answer.equals("no")){
      entryCreateCard();
    }/*else{
      System.out.println("wrong input");
    }*/
    return go;
}


public int entryCreateCard()throws FileNotFoundException{
  System.out.println("name?");
  String answer = input.nextLine();
  System.out.println("a card will be created in your name");
  washcard.createCard(answer);
  return go;
}

public void entryCard()throws FileNotFoundException{
  System.out.println("username?");
  this.name = input.nextLine();

  System.out.println("1.  wash");
  System.out.println("2.  recharge");
  System.out.println("3.  balance");
  System.out.println("choose action");
  int menuanswer = input.nextInt();

  if(menuanswer==1){
    entryWashType();
  }
  else if(menuanswer==2){
    entryRecharge();
  }
  else if(menuanswer==3){
    System.out.println("Your balance is:"+washcard.balance(name));

  }else{
    System.out.println("wrong input");
  }
}

public int entryRecharge()throws FileNotFoundException{
  System.out.println("how much");
  int answer1 = input.nextInt();
  washcard.recharge(answer1, name);
  return go;
}

public void entryWashType()throws FileNotFoundException{
  System.out.println("which wash");
  System.out.println("1.  clean=100kr");
  System.out.println("2.  maximus=200kr");
  int menuanswer = input.nextInt();

  if(menuanswer==1){
    wash.wash(menuanswer,name);
  }else if(menuanswer==2){
    wash.wash(menuanswer,name);
  }else{
    System.out.println("wrong input");
  }

}

}
