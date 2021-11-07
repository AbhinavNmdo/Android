package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText email;
    public static final String EXTRA_NAME = "com.example.multiscreen.EXTRA.NAME";
    public static final String EXTRA_EMAIL = "com.example.multiscreen.EXTRA.EMAIL";
    public static final String EXTRA_PHONE = "com.example.multiscreen.EXTRA.PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Toast.makeText(this, "Opening New activity", Toast.LENGTH_SHORT).show();

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

        String nameText = name.getText().toString();
        String phoneText = phone.getText().toString();
        String emailText = email.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_NAME, nameText);
        intent.putExtra(EXTRA_EMAIL, emailText);
        intent.putExtra(EXTRA_PHONE, phoneText);

        startActivity(intent);
    }
}