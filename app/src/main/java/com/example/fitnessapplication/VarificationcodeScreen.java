package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VarificationcodeScreen extends AppCompatActivity {
    EditText code;
    Button btncode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varificationcode_screen);
        getSupportActionBar().hide();
        code=findViewById(R.id.codeverify);
        btncode=findViewById(R.id.btnverification);



        btncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verification();

            }
        });

    }


    public void verification()
    {
        if(code.toString().isEmpty())
        {
            Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent myIntent = new Intent(VarificationcodeScreen.this, GenderSelectionscreen.class);
            startActivity(myIntent);
        }




    }

}


