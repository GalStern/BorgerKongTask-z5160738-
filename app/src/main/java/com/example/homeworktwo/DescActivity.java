package com.example.homeworktwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itempagelayout);

        Intent receivedIntent = getIntent();
        final int numReceived = receivedIntent.getIntExtra("ID", 0);

        TextView itemName = findViewById(R.id.itemName);
        TextView description = findViewById(R.id.description);
        TextView price = findViewById(R.id.numberOfItems);
        final Button button = findViewById(R.id.addButton);

        itemName.setText(Database.getItemById(numReceived).getName());
        description.setText(Database.getItemById(numReceived).getDescription());
        price.setText(Database.getItemById(numReceived).getPriceString());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderDB.getAllItemsInOrder().add(Database.getItemById(numReceived));
                System.out.println("Runs");

            }
        });

        
    }

    public void spinner(){

        Integer[] numberArray = {1,2,3,4,5,6,7,8,9};

        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, numberArray);
        Spinner spinner = findViewById(R.id.spinner);

        spinner.setAdapter(adapter1);

    }

}
