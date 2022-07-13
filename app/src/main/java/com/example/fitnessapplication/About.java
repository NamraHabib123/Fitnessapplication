package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {

    TextView toptext, bottomtext;
    EditText Edittext;
    Button continuebtn;
    ProgressBar progressBar;
    String toparray[]={"What's your name?","What's your age?","What's your weight?","What's your height?","What's your target weight?"};
    String bottomarray[]={"Enter your full name","Enter your age in round years","what's your weight in kg we need to calculate your bmi","how tall are you enter height in centimeters(feet x30.48)","what's your target weight which you want to achieve?"};
    String gettingans[]={"name","age","weight","height","target"};

    int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        toptext=findViewById(R.id.topquestions);
        bottomtext=findViewById(R.id.tvtext);
        continuebtn=findViewById(R.id.btncontinue);
        progressBar=findViewById(R.id.progress_bar);
        Edittext=findViewById(R.id.ETanswers);

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
       if (index<5)
       {
           if (index<4)

           {

               if(Edittext.getText().toString().isEmpty())
               {
                   Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show();
               }
               else {
                   index=index+1;
                   toptext.setText(toparray[index]);
                   bottomtext.setText(bottomarray[index]);
                   progressBar.setProgress(index);
                   Toast.makeText(this, ""+Edittext.getText().toString(), Toast.LENGTH_SHORT).show();
                   gettingans[index]=Edittext.getText().toString();
                   Edittext.getText().clear();
               }

           }
           else
           {
               continuebtn.setText("calculate results");
               index=index+1;
           }

       }

        else
        {
            //continuebtn.setText("calculate results");
            double weightkg, Height,BMIvalue,weightpounds;
            weightkg= Double.valueOf(gettingans[2]).doubleValue();
            Height= Double.valueOf(gettingans[3]).doubleValue();
            weightpounds=weightkg/0.45359237;
            BMIvalue=(weightpounds /(Height*Height))*703;
            int trimvalue= (int) (BMIvalue*100);
            double shortBMIvalue= ((double)trimvalue)/100;




            //diaglogbox layna hai us main result show karna hai

            final Dialog dialog = new Dialog(About.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setContentView(R.layout.resultdialoge);

            TextView name= dialog.findViewById(R.id.TVname);
            TextView bodymass= dialog.findViewById(R.id.TVbodymass);
            TextView height=dialog.findViewById(R.id.TVheight);
            TextView  targetweight= dialog.findViewById(R.id.TVtargetweight);
            TextView  calculatedbmi=dialog.findViewById(R.id.TVbmi);
            Button plan=dialog.findViewById(R.id.btngetplan);
            Button back= dialog.findViewById(R.id.btnback);


            name.setText("name:                         "+gettingans[1]);
            bodymass.setText("bodymass:                 "+gettingans[2]);
            height.setText("your height:                 "+gettingans[3]);
            targetweight.setText("targetweight:               "+gettingans[4]);
            calculatedbmi.setText("calculated BMI:              "+shortBMIvalue);




            plan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(About.this,MainActivity.class);
                    startActivity(intent);
                    dialog.cancel();

                }
            });


            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(About.this,GenderSelectionscreen.class);
                    startActivity(intent);
                    dialog.cancel();

                }
            });


            dialog.show();



        }

    }




}


