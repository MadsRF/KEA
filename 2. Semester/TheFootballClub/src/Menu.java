import java.util.*;

public class Menu {

    private boolean stop = true;


    public void menu() throws InterruptedException{
        Scanner scan = new Scanner(System.in);

        while (stop != false) {
            try {
                System.out.println("welcome to the Soccer club");
                System.out.println();
                System.out.println("[1] Create new member");
                System.out.println("[2] Show all members");
                System.out.println("[3] Search for spec. member");
                System.out.println("[4] Search teams");
                System.out.println("[5] Remove member");
                System.out.println("[6] Exit");

                System.out.println();
                System.out.print("Input: ");
                int input = scan.nextInt();

                if (input == 1) {
                    menu();
                } else if (input == 2) {
                    menu();
                } else if (input == 3) {
                    menu();
                } else if (input == 4) {
                    menu();
                } else if (input == 5) {
                    menu();
                } else if (input == 6) {
                    System.out.println("Goodbye!");
                    stop = false;
                }
            }catch(InputMismatchException e) {
                System.out.println();
                System.out.println("Wrong input. Try again");
                System.out.println();
                Thread.sleep(1000);
                scan.nextLine();
                menu();
            }
        }
    }
}
