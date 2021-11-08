package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;
    TextView quesction;

    private String [] quesctions = {"Are the HTML tags and elements the same thing ?", "Is first version of HTML was written by Tim Berners-Lee in 1993 ?", "Is '<big>' is an HTML tag ?", "Can we add YouTube videos in HTML ?", "Is there is an property like 'display: nothing;' ?", "'<Link>' tag is HTML tag ?", "'<tr>' is the tag who gives us horizontal ruler ?"};

    private boolean [] answers = {false, true, true, true, false, false, false};

    private int score = 0;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        quesction = findViewById(R.id.quesction);
        quesction.setText(quesctions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index+1 != quesctions.length){
                    if(answers[index]){
                        score++;
                        index++;
                        Toast.makeText(MainActivity.this, "Correct Answer!! Your Score: " + score, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        index++;
                        Toast.makeText(MainActivity.this, "Wrong Answer!! Your Score: " + score, Toast.LENGTH_SHORT).show();
                    }
                    quesction.setText(quesctions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Quesctions finished! Your Score is: " + score, Toast.LENGTH_SHORT).show();
                    quesction.setText("Your Score is: " +  score);
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index+1 != quesctions.length){
                    if(!answers[index]){
                        score++;
                        index++;
                        Toast.makeText(MainActivity.this, "Correct Answer!! Your Score: " + score, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        index++;
                        Toast.makeText(MainActivity.this, "Wrong Answer!! Your Score: " + score, Toast.LENGTH_SHORT).show();
                    }
                    quesction.setText(quesctions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Quesctions finished! Your Score is: " + score, Toast.LENGTH_SHORT).show();
                    quesction.setText("Your Score is: " +  score);
                }

            }
        });
    }
}