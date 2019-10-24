package com.example.homeworktwo;



public class OrderList extends Item {

    private int numOfItems;
    private double subTotalOfItem;


    public OrderList(String name, double cost, String description, int id, int numOfItems) {
        super(id, name, cost, description);
        this.numOfItems = numOfItems;
        this.subTotalOfItem = super.getPrice() * numOfItems;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = this.numOfItems + numOfItems;
    }


    public double getSubTotalOfItem() {
        return subTotalOfItem;
    }

    public void setSubTotalOfItem(double subTotalOfItem) {
        this.subTotalOfItem = subTotalOfItem;
    }
}
