package com.example.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText email;
    EditText subject;
    EditText mailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        email = findViewById(R.id.email);
        subject = findViewById(R.id.subject);
        mailText = findViewById(R.id.mailText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] addresses = {};
                String emailText = email.getText().toString();
                addresses = Arrays.copyOf(addresses, addresses.length + 1);
                addresses[addresses.length - 1] = emailText;
                String subjectText = subject.getText().toString();
                String mailTexttext = mailText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subjectText);
                intent.putExtra(Intent.EXTRA_TEXT, mailTexttext);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}