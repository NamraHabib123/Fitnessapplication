package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {

    TextView toptext, bottomtext;
    EditText Edittext;
    Button continuebtn, calculatebtn;
    ProgressBar progressBar;
    String toparray[]={"What's your name?","What's your age?","What's your weight?","What's your height?","What's your target weight?"};
    String bottomarray[]={"Enter your full name","Enter your age in round years","what's your weight in kg we need to calculate your bmi","how tall are you enter height in centimeters(feet x30.48)","what's your target weight which you want to achieve?"};
    int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        toptext=findViewById(R.id.topquestions);
        bottomtext=findViewById(R.id.tvtext);
        continuebtn=findViewById(R.id.btncontinue);
        calculatebtn=findViewById(R.id.btncalculate);
        progressBar=findViewById(R.id.progress_bar);

       index=0;
       progressBar.setProgress(index);

      continuebtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             nexttext();
          }
      });





    }

    public  void nexttext()
    {

        if (index<4)
        {
            if(Edittext.toString().isEmpty())
            {
                Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, ""+Edittext, Toast.LENGTH_SHORT).show();
            }

        }
        else
        {
            index=index+1;
            toptext.setText(toparray[index]);
            bottomtext.setText(bottomarray[index]);
            progressBar.setProgress(index);


        }

    }

}


