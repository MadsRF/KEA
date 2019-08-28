package com.company;

public class GroceryList {

    private int counter = 0;
    private double totalAmount = 0.0;
    private double taxAmount = 0.0;
    private double nonTaxAmount = 0.0;

    GroceryItemOrder[] list = new GroceryItemOrder[10];

    public void addItem(String name, double cost, int quantity) {

        //Hvis Counter er lig med listen længde. sig til kunde at der er for mange ting
        if (counter == list.length) {
            counter++;
            System.out.println("You put "+counter +" items to many in your grocery cart, which resultet in you dying of exchausting");
            System.exit(0);
        } else {
            list[counter] = new GroceryItemOrder(name, cost, quantity);
            counter++;
        }
    }

    public void getTotalCost() throws InterruptedException {

        try {
            System.out.println();
            System.out.println("       ---------------------------------------");
            System.out.format("%6S %1S%n","","\"~super discount supermarket receipt~\"");
            System.out.format("%15S %15S %14S%n","Grocery:","Cost:","Quantity:");
            System.out.println();

            //Udregning af skat samt totalpris
            for (int i = 0; i < counter; i++) {
                totalAmount += (list[i].getCost_Food() * list[i].getQuantity_Food());
                taxAmount += (list[i].getCost_Food() * list[i].getQuantity_Food() / 100 * 25);
                nonTaxAmount = totalAmount - taxAmount;

                System.out.format("%6s %-13S %10.2fKR. %6d stk.%n", "",list[i].getName_Food(),list[i].getCost_Food(),list[i].getQuantity_Food());
            }
            System.out.println();
            System.out.format("%6S %1S %20.2fKR.\n","","Tax amount is: ",taxAmount);
            System.out.format("%6S %1S %16.2fKR.\n","","Non-tax amount is: ",nonTaxAmount);
            System.out.format("%6S %1S %21.2fKR.\n","","The Total is: ",totalAmount);
            System.out.println();
            System.out.format("%8S %1S\n","","You were serviced by: Johnny Bravo");

            System.out.println("       ---------------------------------------");

            //bruges til at slukke for tråden. så output har pause mellem udprint
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }
}
