package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView name2;
    TextView phone2;
    TextView email2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name2 = findViewById(R.id.name2);
        phone2 = findViewById(R.id.phone2);
        email2 = findViewById(R.id.email2);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String phone = intent.getStringExtra(MainActivity.EXTRA_PHONE);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);

        name2.setText(name);
        phone2.setText(phone);
        email2.setText(email    );
    }

}