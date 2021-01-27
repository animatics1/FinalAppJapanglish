package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Greetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetings);

        Button next = (Button) findViewById(R.id.Greetings1NextBTN);
        Button back = (Button) findViewById(R.id.Greetings1BackBTN);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greetings.this, Greetings2.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greetings.this, CommonPhrases2.class));
            }
        });

    }
}
