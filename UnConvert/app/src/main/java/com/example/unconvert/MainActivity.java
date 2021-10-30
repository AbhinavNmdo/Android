package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textview2;
    private EditText editNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
        editNum = findViewById(R.id.editNum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String user = editNum.getText().toString();
                    double kg = Double.parseDouble(user);
                    if(editNum.getText().toString() == "0"){
                        textview2.setText("Enter Valid Value");
                    }
                    else{
//                        textview2.setText("Enter Valid Value" + user);
                        double pound = 2.205 * kg;
                        textview2.setText("The Pound value is: " + pound);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    textview2.setText("Error");
                }
            }
        });
    }
}