package com.example.suvrat.helpdcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

// a list to store all products

    List<cards> cardList;

    // the recyclerView

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //gettting the recycler view from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initialisation the product list
        cardList = new ArrayList<>();

        //adding some items to our list
        cardList.add(
                new cards(1, "Sara Rohilla","Washing",4.2,2500,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(2, "Sushma Swaraj","Washing,Cooking",4.4,3500,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(3, "Manju Jhula","Cleaning",3.4,1500,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(4, "Vrandika Chanduka","Dusting",4.8,2800,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(5, "Devi Nanda","Cleaning",4.1,1700,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(5, "Devi Nanda","Cleaning",4.1,1700,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(5, "Devi Nanda","Cleaning",4.1,1700,R.drawable.ic_launcher_background)
        );
        cardList.add(
                new cards(5, "Devi Nanda","Cleaning",4.1,1700,R.drawable.ic_launcher_background)
        );


        //creating recyclerview adapter
        cardAdapter adapter = new cardAdapter(this, cardList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
