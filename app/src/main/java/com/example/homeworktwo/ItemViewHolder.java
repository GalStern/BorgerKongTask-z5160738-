package com.example.homeworktwo;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class ItemViewHolder extends RecyclerView.ViewHolder{
   private View view;
   private TextView itemName;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemName = itemView.findViewById(R.id.itemName);
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public TextView getItemName() {
        return itemName;
    }


}
