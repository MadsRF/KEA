package com.company;
import java.io.*;
import java.util.*;

public class Main {

    private static GroceryList gList = new GroceryList();
    private static GroceryList2 glist2 = new GroceryList2();

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{

        //Printer toString fra GroceryItemOrder
        //System.out.println(gList.toString());

        //Grocerylist - indlæser fra parameter med array
        manualList();

        //Grocerylist - indlæser fra fil med array
        //readFromList();

        //Grocerylist2 - indlæser fra fil med ArrayList
        readFromList2();

        //printer toString fra Grocerylist2 med ArrayList
        //System.out.println(glist2.toString());



        //printer kvittering fra GroceryList
        gList.getTotalCost();

        //printer kvittering fra GroceryList2
        glist2.getTotalCost();
    }

    public static void manualList(){

        gList.addItem("Bananers",2,6);
        gList.addItem("Toiletpaper",16.95,1);
        gList.addItem("Porkchops",30.99,2);
        gList.addItem("Paper",15.25,2);
        gList.addItem("Wholemilk",6.65,2);
        gList.addItem("Rope",25,1);
        gList.addItem("Chicken",20,4);
        gList.addItem("Coffee",43,1);
        gList.addItem("Beans",10.80,8);
        gList.addItem("Twinkies",10.15,1);

        /* Ekstra til kontrol af array størrelse
        gList.addItem("Chicken",20,4);
        gList.addItem("Coffee",43,1);
        gList.addItem("Beans",10.80,8);
        gList.addItem("Twinkies",10.15,1);
        */
    }

    public static void readFromList()throws FileNotFoundException {

        Scanner scan = new Scanner(new File("C:\\Users\\madsr\\IdeaProjects\\GroceryAssign\\src\\com\\company\\TextFile"));

        while(scan.hasNext()){
            String name = scan.next();
            double cost = scan.nextDouble();
            int quantity = scan.nextInt();

            gList.addItem(name,cost,quantity);

            //test print
            //System.out.println(name+" "+cost+" "+quantity);
        }
    }

    public static void readFromList2()throws FileNotFoundException {

        Scanner scan = new Scanner(new File("C:\\Users\\madsr\\IdeaProjects\\GroceryAssign\\src\\com\\company\\TextFile"));

        while (scan.hasNext()) {
            String name = scan.next();
            double cost = scan.nextDouble();
            int quantity = scan.nextInt();

            glist2.addItem(name, cost, quantity);

            //test print
            //System.out.println(name+" "+cost+" "+quantity);
        }
    }
}