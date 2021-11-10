package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] arr = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13"};
    public static final String EXTRA_ITEM = "com.example.listviewpractice.EXTRA_ITEM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);


        // Using Inbuilt Adapter
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arr);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item = adapter.getItem(position).toString();
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra(EXTRA_ITEM, item);
//                startActivity(intent);
//            }
//        });

        // Using Custom Adapter
        AbhinavAdapter adapter = new AbhinavAdapter(MainActivity.this, R.layout.abhinav_adapter, arr);
        listView.setAdapter(adapter);
    }
}