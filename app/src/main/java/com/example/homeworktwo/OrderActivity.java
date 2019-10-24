package com.example.homeworktwo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OrderActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderpagelayout);

        RecyclerView recyclerView = findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter myAdapter = new OrderAdapter(OrderDB.getAllItemsInOrder());
        recyclerView.setAdapter(myAdapter);












    }
}
