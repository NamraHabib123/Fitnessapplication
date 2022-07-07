package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class signup extends AppCompatActivity {

    EditText phonnoE;
    Button Register;
    CountryCodePicker ccodeV;
    String countryCode,phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        phonnoE = findViewById(R.id.phonnov);
        ccodeV  = findViewById(R.id.ccp);
        Register = findViewById(R.id.btnRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countryCode = ccodeV.getSelectedCountryCode();
                phoneNumber = phonnoE.getText().toString();
                Toast.makeText(signup.this, ""+countryCode+phoneNumber, Toast.LENGTH_SHORT).show();
//

            }
        });


     Register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            checks();
         }
     });


    }

    public void checks()
    {
        if(phonnoE.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent myIntent = new Intent(signup.this, VarificationcodeScreen.class);
            startActivity(myIntent);
        }
    }


}