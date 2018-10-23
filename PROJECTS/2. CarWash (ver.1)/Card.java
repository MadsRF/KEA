import java.io.*;
import java.util.*;

public class Card{

    public String createCard(String name)throws FileNotFoundException{

      PrintStream output = new PrintStream(new File(name+".txt"));
      output.println("0");
      return name;
    }


    public int recharge(int amount,String name)throws FileNotFoundException{

    Scanner input = new Scanner(new File(name+".txt"));
    amount = amount + input.nextInt();

    PrintStream output = new PrintStream(new File(name+".txt"));

    output.println(amount);

    return amount;
    }


    public int deduct(int amount, String name)throws FileNotFoundException{

    Scanner input = new Scanner(new File(name+".txt"));
    amount = input.nextInt() - amount;


    PrintStream output = new PrintStream(new File(name+".txt"));

    output.println(amount);


    return amount;
    }

    public int balance(String name)throws FileNotFoundException{

    Scanner input = new Scanner(new File(name+".txt"));
    int amount = input.nextInt();

    return amount;

    }

}
