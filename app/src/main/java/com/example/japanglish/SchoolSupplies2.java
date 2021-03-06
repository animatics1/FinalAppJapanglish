package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SchoolSupplies2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easyschoolsupplies2);

        Button next = (Button) findViewById(R.id.SchoolSupplies2NextBTN);
        Button back = (Button) findViewById(R.id.SchoolSupplies2BackBTN);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SchoolSupplies2.this, EasyNumbers.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SchoolSupplies2.this, EasySchoolSupplies.class));
            }
        });

    }
}
