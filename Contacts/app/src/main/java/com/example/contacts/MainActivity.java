package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contacts c1 = new Contacts(1, "Ashu", "8358919704");
    Contacts c2 = new Contacts(2, "PapaJi", "9300272994");
    Contacts c3 = new Contacts(3, "MummyJi", "9713853131");
    Contacts c4 = new Contacts(4, "Abhay", "7828566675");
    Contacts c5 = new Contacts(5, "Palak", "9898989898");
    Contacts c6 = new Contacts(6, "Aryan", "7896321452");
    Contacts c7 = new Contacts(7, "Jai", "9632587412");
    Contacts c8 = new Contacts(8, "Shubh", "4567892345");
    Contacts c9 = new Contacts(9, "Ayush", "9856321475");
    Contacts c10 = new Contacts(10, "Shiv", "5689741235");

    Contacts [] contacts = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}