package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String [] arr = {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item10", "Item11", "Item12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AbhayAdapter adapter = new AbhayAdapter(arr);
        recyclerView.setAdapter(adapter);
    }
}