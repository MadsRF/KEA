import java.util.Scanner;

class Menu {

    private Scanner scan = new Scanner(System.in);
    private Scanner scan1 = new Scanner(System.in);
    private Queries queries = new Queries();
    private boolean stop = true;

    void start() {
        System.out.println("Welcome to you database - kailua_db - This is the car table.\n" );
        System.out.println("[1] Insert\n[2] Delete\n[3] Update\n[4] Select by different criteria\n[5] EXIT\n\n");


        while(stop){
            try {
                System.out.print("input: ");
                String input = scan.next();
                System.out.println("\n");

                if (input.equals("1")){
                    System.out.println("Input car info:\n");
                    System.out.print("Car ID: ");
                    int car_id = scan1.nextInt();
                    System.out.print("Fuel Type: ");
                    String fuel_type = scan1.next();
                    System.out.print("Reg. nr: ");
                    String reg_nr = scan1.next();
                    System.out.print("1. Reg. date: ");
                    String f_reg_date = scan1.next();
                    System.out.print("Odometer: ");
                    int odometer = scan1.nextInt();

                    queries.insert(car_id, fuel_type, reg_nr, f_reg_date, odometer);
                    start();
                }
                else if (input.equals("2")){
                    System.out.println("Which car do you wanna delete:");
                    System.out.print("Input car ID: ");
                    int car_id = scan1.nextInt();
                    queries.delete(car_id);
                    start();
                }
                else if (input.equals("3")){
                    System.out.println("Input car info:\n");
                    System.out.print("Car ID: ");
                    int car_id = scan1.nextInt();
                    System.out.print("New Car ID: ");
                    int car_id1 = scan1.nextInt();
                    System.out.print("New Fuel Type: ");
                    String fuel_type = scan1.next();
                    System.out.print("New Reg. nr: ");
                    String reg_nr = scan1.next();
                    System.out.print("New 1. Reg. date: ");
                    String f_reg_date = scan1.next();
                    System.out.print("New Odometer: ");
                    int odometer = scan1.nextInt();

                    queries.update(car_id, car_id1, fuel_type, reg_nr, f_reg_date, odometer);
                    start();
                }
                else if (input.equals("4")){
                    System.out.println("[1] Search by specific\n[2] Show all\n[3] Go to menu\n\n");
                    System.out.print("input: ");
                    String input1 = scan.next();

                    if(input1.equals("1")) {
                        System.out.print("Which column: ");
                        String temp = scan.next();
                        System.out.print("Specific: ");
                        String temp1 = scan.next();
                        queries.selectWhere(temp, temp1);
                        start();
                    }
                    else if(input1.equals("2")) {
                        queries.selectAll();
                        start();
                    }
                    else if(input1.equals("3")){
                        start();
                    }
                }
                else if (input.equals("5")){
                    System.out.println("Shutting down");
                    stop = false;
                }
                else{
                    System.out.println("Wrong input, try again");
                    start();
                }

            }catch(Exception e){
                System.out.println("Something went wrong, restarting system");
                start();
            }
        }
    }
}
