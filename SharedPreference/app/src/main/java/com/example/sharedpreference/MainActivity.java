package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                SharedPreferences sP = getSharedPreferences("MySelf", MODE_PRIVATE);
                SharedPreferences.Editor ed = sP.edit();
                ed.putString("name", name);
                ed.apply();
                textView.setText(name);
            }
        });

        SharedPreferences sP = getSharedPreferences("MySelf", MODE_PRIVATE);
        String n = sP.getString("name", "No Name there");
        textView.setText(n);
    }
}