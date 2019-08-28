package com.company;
import java.util.*;

public class GroceryList2 {

    private int i;

    private double totalAmount = 0.0;
    private double taxAmount = 0.0;
    private double nonTaxAmount = 0.0;

    ArrayList<GroceryItemOrder> list2 = new ArrayList<GroceryItemOrder>();

    public void addItem(String name, double cost, int quantity) {

        if (list2.size() < 10) {
            list2.add(new GroceryItemOrder(name,cost,quantity));
        } else {
            System.out.println("You put to many items in your grocery cart, which resultet in you dying of exchausting");
            System.exit(0);
        }
    }

    public void getTotalCost() {

        //Søger efter forkomster af samme name og lægger dem sammen
        for(i = 0;i < list2.size(); i++){
            String name = list2.get(i).getName_Food();
            for (int j = i+1; j < list2.size(); j++){
                if(name.equals(list2.get(j).getName_Food())){
                    list2.get(i).setQuantity_Food(list2.get(j).getQuantity_Food());
                    list2.remove(j);
                    i = i-1;
                }
            }
        }
        try {
            System.out.println();
            System.out.println("       ---------------------------------------");
            System.out.printf("%6S %1S%n","","\"~super discount supermarket receipt~\"");
            System.out.printf("%15S %15S %14S%n","Grocery:","Cost:","Quantity:");
            System.out.println();

            //Udregning af skat samt totalpris
            for (i = 0; i < list2.size(); i++) {
                totalAmount += (list2.get(i).getCost_Food() * list2.get(i).getQuantity_Food());
                taxAmount += (list2.get(i).getCost_Food() * list2.get(i).getQuantity_Food() / 100 * 25);
                nonTaxAmount = totalAmount-taxAmount;

                System.out.format("%6s %-13S %10.2fKR. %6d stk.%n", "", list2.get(i).getName_Food(), list2.get(i).getCost_Food(), list2.get(i).getQuantity_Food());
            }
            System.out.println();
            System.out.format("%6S %1S %20.2fKR.\n","","Tax amount is: ",taxAmount);
            System.out.format("%6S %1S %16.2fKR.\n","","Non-tax amount is: ",nonTaxAmount);
            System.out.format("%6S %1S %21.2fKR.\n","","The Total is: ",totalAmount);
            System.out.println();
            System.out.format("%8S %1S\n","","You were serviced by: Arnold S.");

            System.out.println("       ---------------------------------------");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }
    //Laver variabler om til en String
    public String toString(){
        String result = "";
        for (i = 0; i < list2.size(); i++) {
            result += list2.get(i).getName_Food() + " " + list2.get(i).getCost_Food() + " " + list2.get(i).getQuantity_Food()+" ";
        }
        return result;
    }
}
