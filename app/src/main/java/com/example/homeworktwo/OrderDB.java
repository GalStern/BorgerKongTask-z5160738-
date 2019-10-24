package com.example.homeworktwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrderDB {

    private float totalOfOrder;

    private static final HashMap<Integer, Item> itemsInOrderList;

    static {
        itemsInOrderList = new HashMap<>();
        itemsInOrderList.put(3, new Item(3, "Onion Rings", 1.99, "A box of 10 of our delicious onion rings, seasoned with our signature herbs."));
    }


    public static ArrayList<Item> getAllItemsInOrder() {
        return new ArrayList<Item>((List) Arrays.asList(itemsInOrderList.values().toArray()));

    }

    public void setTotalOfOrder(){

    }


}
