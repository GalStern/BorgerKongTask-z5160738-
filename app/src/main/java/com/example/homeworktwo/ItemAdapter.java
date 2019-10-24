package com.example.homeworktwo;

import androidx.recyclerview.widget.RecyclerView;

import android.view.ViewGroup;

import android.view.View;
import android.view.LayoutInflater;
import android.content.Intent;

import java.util.ArrayList;


public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    public ArrayList<Item> itemsList;

    public ItemAdapter(ArrayList<Item> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mainitemviewholder, parent, false);
        ItemViewHolder myViewHolder = new ItemViewHolder(view);
        return myViewHolder;


    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {

        final Item item= this.itemsList.get(position);
        holder.getItemName().setText(item.getName());

        holder.getItemName().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.getItemName().getContext(), DescActivity.class);
                intent.putExtra("ID",item.getId());
                holder.getItemName().getContext().startActivity(intent);


            }
        });









    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsList.size();
    }





}
