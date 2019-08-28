import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.util.Scanner;


    public class Menu {

        private boolean stop = true;
        private Scanner scan = new Scanner(System.in);

        MemberHandling mH = new MemberHandling();

        public void menu() throws InterruptedException, FileNotFoundException {

           mH.readMember();

            while (stop) {
                try {
                    System.out.println("~Welcome to the Soccer club~");
                    System.out.println();
                    System.out.println("[1] Create new member");
                    System.out.println("[2] Remove member");
                    System.out.println("[3] Show all members");
                    System.out.println("[4] Search for spec. member by name");
                    System.out.println("[5] Search for spec. member by age");
                    System.out.println("[6] Search for spec. team");
                    System.out.println("[7] Exit");

                    System.out.println();
                    System.out.print("Input: ");
                    int input = scan.nextInt();

                    if (input == 1) {
                        mH.newMember();
                    } else if (input == 2) {
                        mH.removeMember();
                    } else if (input == 3) {
                        mH.showMember();
                    } else if (input == 4) {
                        mH.searchMemberName();
                    }else if (input == 5) {
                        mH.searchMemberAge();
                    } else if (input == 6) {
                        mH.searchMemberTeam();
                    } else if (input == 7) {
                        System.out.println("Exiting Program!");
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
        } //Kalder metoder fra MemberHandling og er min "U.I"
    }

