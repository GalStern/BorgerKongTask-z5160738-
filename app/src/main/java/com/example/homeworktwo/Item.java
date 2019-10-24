package com.example.homeworktwo;

public class Item {

    private int id;
    private String name;
    private double price;
    private String priceString;
    private String description;
    private int numberOfItems;
    private double TotalOfItem;

    public Item(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.priceString = "$" + price;
        this.numberOfItems = 0;
        this.TotalOfItem = 0;

    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numOfItems) {
        this.numberOfItems = numOfItems;
    }

    public double getTotalOfItem() {
        return TotalOfItem;
    }

    public void setTotalOfItem(double subTotalOfItem) {
        this.TotalOfItem = subTotalOfItem;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}