package com.example.homeworktwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    public ArrayList<Item> itemsInOrderList;

    public OrderAdapter(java.util.ArrayList<Item> itemsInOrderList) {
        this.itemsInOrderList = itemsInOrderList;
    }

    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent,
                                              int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderpageviewholder, parent, false);
        OrderViewHolder myViewHolder = new OrderViewHolder(view);
        return myViewHolder;


    }

    @Override
    public void onBindViewHolder(final OrderViewHolder holder, int position) {
        final Item item = this.itemsInOrderList.get(position);

        holder.getNameOfItem().setText(item.getName());
        holder.getPrice().setText(item.getPriceString());
        holder.getNumberOfItems().setText(Integer.toString(item.getNumberOfItems()));



    }

    @Override
    public int getItemCount() {
        return itemsInOrderList.size();
    }




}
