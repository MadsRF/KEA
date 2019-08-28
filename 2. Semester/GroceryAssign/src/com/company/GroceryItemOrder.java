package com.company;

public class GroceryItemOrder {

    private String name_Food;
    private double cost_Food;
    private int quantity_Food = 1;

    public GroceryItemOrder(String name, double cost, int quantity){
        this.name_Food = name;
        this.cost_Food = cost;
        this.quantity_Food = quantity;
    }
    public GroceryItemOrder(String name){
        this.name_Food = name;
    }
    public double getCost_Food() {
        return cost_Food;
    }
    public String getName_Food() {
        return name_Food;
    }
    public int getQuantity_Food() {
        return quantity_Food;
    }
    public void setName_Food(String name_Food) {
        this.name_Food = name_Food;
    }
    public void setCost_Food(double cost_Food) {
        this.cost_Food = cost_Food;
    }
    public void setQuantity_Food(int quantity_Food) {
        this.quantity_Food = this.quantity_Food+quantity_Food;
    }

    //bruges ikke pt. skal have oprettet et objekt i main.
    public String toString() {
        return name_Food +" "+cost_Food+" "+quantity_Food;
    }
}
