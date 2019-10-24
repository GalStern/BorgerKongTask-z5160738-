package com.example.homeworktwo;

import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;

import android.view.View;
import android.widget.TextView;

public class OrderViewHolder extends RecyclerView.ViewHolder {
    private TextView nameOfItem;
    private TextView numberOfItems;
    private TextView price;

    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);
        this.nameOfItem = itemView.findViewById(R.id.nameOfItemInOrder);
        this.numberOfItems = itemView.findViewById(R.id.numberOfItems);
        this.price = itemView.findViewById(R.id.price);

    }

    public TextView getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(TextView nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public TextView getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(TextView numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

}
