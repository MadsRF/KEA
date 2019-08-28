import java.util.*;

public class Main {

    public static void main (String []args){

        int countP = 0;
        int countC = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        boolean stop = true;
        while(stop){


            System.out.println("input numbers...");

            int a = scan.nextInt();
            int b = scan.nextInt();

            int c = a+b;

            int d = rand.nextInt(1);
            int e = rand.nextInt(1);

            int f = d + e;

            System.out.println(a + " + " + b + " = " + c);
            System.out.println(d + " + " + e + " = " + f);


            if(c == f){
                System.out.println("It's a tie");
                countC++;
                countP++;
            }
            else if(c > f){
                System.out.println("player won that round");
                countP++;
            }
            else if(c < f) {
                System.out.println("Computer won that round");
                countC++;
            }

            if(countC == 3 && countP == 3){
                System.out.println("It's a tie. nobody wins, try again");
                stop = false;

            }

            else if(countC == 3){
                System.out.println("Computer wins you stupid Human");
                stop = false;
            }

            else if(countP == 3){
                System.out.println("Human wins you stupid Computer");
                stop = false;
            }

            System.out.println("Computer wins: " + countC);
            System.out.println("Player wins: " + countP);

        }
    }
}
