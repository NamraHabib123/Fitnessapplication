package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GenderSelectionscreen extends AppCompatActivity {

    ImageView male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_selectionscreen);
        getSupportActionBar().hide();

        male=findViewById(R.id.male);
        female=findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent myIntent = new Intent(GenderSelectionscreen.this, About.class);
                startActivity(myIntent);
            }
        });


        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GenderSelectionscreen.this, About.class);
                startActivity(myIntent);
            }
        });

    }
}