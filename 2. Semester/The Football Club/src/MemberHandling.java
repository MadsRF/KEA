import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.File;
import java.util.*;

public class MemberHandling {

    //private  static List<MemberPlayer> memberlist = new LinkedListTest<>();

    //private static List<MemberPlayer> memberlist = new LinkedList<>(); //Opretter et LinkedList-objekt af klassen MemberPlayer

    private static ArrayList<MemberPlayer> memberlist = new ArrayList(); // Opretter et ArrayList-objekt af klassen MemberPlayer


    private Scanner input = new Scanner(System.in); // Bruges til input fra bruger

    public void readMember() throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\madsr\\IdeaProjects\\The Football Club\\src\\MembersText"));
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            int age = input.nextInt();
            int team = input.nextInt();

            memberlist.add(new MemberPlayer(firstName, lastName, age, team));
        }
    } // Indlæser MemberPlayers fra text.fil (MemberText)

    public void newMember() throws FileNotFoundException {
        try {
            System.out.println("");
            System.out.print("First Name: ");
            String firstName = input.next().toUpperCase();
            System.out.print("Last Name: ");
            String lastName = input.next().toUpperCase();
            System.out.print("Age: ");
            int age = input.nextInt();
            System.out.print("Team: ");
            int team = input.nextInt();

            if (team != 1 && team != 2) {
                System.out.println("You can't those those teams");
                newMember();
            } else if (age < 10 || age > 35) {
                System.out.println("the Player is not the correct age");
                newMember();
            } else if ((team == 1 || team == 2) && (age > 10 || age < 35)) {
                System.out.println();
                memberlist.add(new MemberPlayer(firstName, lastName, age, team));
                System.out.println("Creating new PlayerMember was Successful");
                saveMember();
            }
        } catch (InputMismatchException ime) {
            System.out.println("Something went wrong trying to create a new MemberPlayer");
        }
        System.out.println();
    } // Opretter nye MemberPlayers

    public void saveMember() throws FileNotFoundException {
        PrintStream output = new PrintStream(new FileOutputStream("C:\\Users\\madsr\\IdeaProjects\\The Football Club\\src\\MembersText"));
        for (MemberPlayer m : memberlist) {
            output.println(m.getFirstName() + " " + m.getLastName() + " " + m.getAge() + " " + m.getTeam());
        }
        System.out.println();
    } // Gemmer Memberplayers til MemberText

    public void removeMember()throws FileNotFoundException {
        System.out.println("Which MemberPlayer are you looking to remove?:");
        System.out.print("Input first name: ");
        String fName1 = input.nextLine().toUpperCase();
        System.out.print("Input last name: ");
        String lName2 = input.nextLine().toUpperCase();

        for (MemberPlayer m : memberlist){

            if (m.getFirstName().equals(fName1) & m.getLastName().equals(lName2)) {
                System.out.println();
                memberlist.remove(m);
                System.out.println("You removed: "+m.getFirstName()+" "+m.getLastName());
                System.out.println();
                saveMember();
                break;
            } else {
                System.out.println();
                System.out.println("This MemberPlayer doesn't exist");
                System.out.println();
                break;
            }
        }
    } // Fjerner Memberplayer fra list og MemberText

    public void showMember() {
        int count = 0;
        System.out.printf("%-10S %-10S %10S %10S\n","First:","Last:","Age:","Team:");
        //sortEasyName();
        sortByName();
        for (MemberPlayer m : memberlist) {
            System.out.printf("%-10S %-10S %8d %8d\n",m.getFirstName(), m.getLastName(), m.getAge(), m.getTeam());
            count++;
        }
        System.out.println();
        System.out.println("There are " + count + " MemberPlayers in the club:");
        System.out.println();
    }  // Viser alle MemberPlayers i klubben

    public void searchMemberName() {
        int count = 0;
        System.out.println("what's the name of the MemberPlayer?:");
        System.out.print("Input first name: ");
        String fName = input.next().toUpperCase();
        System.out.print("Input last name: ");
        String lName = input.next().toUpperCase();

        for (MemberPlayer m : memberlist) {
            if (m.getFirstName().equals(fName) & m.getLastName().equals(lName)) {
                System.out.println();
                System.out.printf("%-10S %-10S %10S %10S\n","First:","Last:","Age:","Team:");
                System.out.printf("%-10S %-10S %8d %8d\n",m.getFirstName(), m.getLastName(), m.getAge(), m.getTeam());
                System.out.println();
                count++;
            }
        }
        if(count == 0) {
            System.out.println();
            System.out.println("This MemberPlayer doesn't exist");
            System.out.println();
        }
    } // søger efter specifik Memberplayer via fornavn/efternavn

    public void searchMemberAge(){

        try {
            int count = 0;
            System.out.println("What's the age range [10-35] of the MemberPlayers?:");
            System.out.print("Input youngest age: ");
            int youngAge = input.nextInt();
            System.out.print("Input oldest age: ");
            int oldAge = input.nextInt();

            sortEasyAge();
            //sortByAge();

            if (youngAge >= 10 && oldAge <= 35) {
                System.out.printf("%-10S %-10S %10S %10S\n", "First:", "Last:", "Age:", "Team:");
                for (MemberPlayer m : memberlist) {
                    if (m.getAge() >= youngAge & m.getAge() <= oldAge) {
                        System.out.printf("%-10S %-10S %8d %8d\n", m.getFirstName(), m.getLastName(), m.getAge(), m.getTeam());
                        count++;
                    }
                }
            }
            System.out.println();
            if (count == 0) {
                System.out.println("No MemberPlayer is within this scope");
                System.out.println();
            }
        }catch (InputMismatchException e){
            System.out.println("Your input was incorrect");
            System.out.println();
        }
    } // søger efter specifik Memberplayer via en alders-rækkevidde

    public void searchMemberTeam() {

        try {
            System.out.println("Which team do you wanna see?");
            System.out.println("[1] Team one");
            System.out.println("[2] Team two");
            System.out.print("Input: ");
            int i = input.nextInt();

            if (i == 1) {
                //sortByName();
                sortEasyName();
                System.out.printf("%-10S %-10S %10S %10S\n","First:","Last:","Age:","Team:");
                for (MemberPlayer m : memberlist) {
                    if (m.getTeam() == 1) {
                        System.out.printf("%-10S %-10S %8d %8d\n",m.getFirstName(), m.getLastName(), m.getAge(), m.getTeam());
                    }
                }
                System.out.println();
            }
            else if (i == 2) {
                //sortByName();
                sortEasyName();
                System.out.printf("%-10S %-10S %10S %10S\n","First:","Last:","Age:","Team:");
                for (MemberPlayer m : memberlist) {
                    if (m.getTeam() == 2) {
                        System.out.printf("%-10S %-10S %8d %8d\n",m.getFirstName(), m.getLastName(), m.getAge(), m.getTeam());
                    }
                }
                System.out.println();
            }
        }catch (InputMismatchException e){
            System.out.println("Something went wrong trying to read the team list");
        }
    } // Viser enten hele team 1 eller team 2


    private void sortByAge(){
        Collections.sort(memberlist, new Comparator<MemberPlayer>() {
            public int compare(MemberPlayer o1, MemberPlayer o2) {
                return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
            }
        });
    } // sortere alder (int værdi) fra memberlist objekt i faldende rækkefølge (1-2-3-*)

    private void sortByName(){
        Collections.sort(memberlist);
    /*{
            public int compare(MemberPlayer o1, MemberPlayer o2) {
                int compareInt = o1.getFirstName().compareTo(o2.getFirstName());
                if (compareInt < 0) return -1;
                if (compareInt > 0) return 1;
                return 0;
            }
        });*/
    } // sortere fornavn (String værdi) fra memberlist objekt i faldende rækkefølge (a-b-c-*) Bruger compareTo i MemberPlayer

    public void sortEasyName(){
        memberlist.sort(Comparator.comparing(MemberPlayer::getFirstName));
    } //easy sort name

    public void sortEasyAge(){
        memberlist.sort(Comparator.comparing(MemberPlayer::getAge));
    }   //easy sort age

}



