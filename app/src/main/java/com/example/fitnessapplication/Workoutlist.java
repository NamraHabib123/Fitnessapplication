package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import kr.pe.burt.android.lib.faimageview.FAImageView;

public class Workoutlist extends AppCompatActivity {

    TextView title,TV1,TV2,TV3,TV4,TV5;
    FAImageView faimage1,faimage2,faimage3,faimage4,faimage5;
CardView cardview1,cardview2, cardview3, cardview4, cardview5;
    Drawable myDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutlist);
        getSupportActionBar().hide();



        title=findViewById(R.id.WorkoutlistTitle);
        TV1= findViewById(R.id.TV1);
        TV2= findViewById(R.id.TV2);
        TV3= findViewById(R.id.TV3);
        TV4= findViewById(R.id.TV4);
        TV5= findViewById(R.id.TV5);

        cardview1= findViewById(R.id.card1);
        cardview2= findViewById(R.id.card2);
        cardview3= findViewById(R.id.card3);
        cardview4= findViewById(R.id.card4);
        cardview5= findViewById(R.id.card5);

        faimage1=(FAImageView)findViewById(R.id.FA1);
        faimage2=(FAImageView)findViewById(R.id.FA2);
        faimage3=(FAImageView)findViewById(R.id.FA3);
        faimage4=(FAImageView)findViewById(R.id.FA4);
        faimage5=(FAImageView)findViewById(R.id.FA5);



        Bundle extras = getIntent().getExtras();
        int getvalue = extras.getInt("key");
        Toast.makeText(Workoutlist.this, ""+getvalue, Toast.LENGTH_SHORT).show();

        if(getvalue==1)
        {
           title.setText("FULL BODY WORKOUT");
           faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_a);
           faimage2.addImageFrame(R.drawable.neo_butt_bridge_a);
           faimage3.addImageFrame(R.drawable.neo_long_arm_crunches_a);
           faimage4.addImageFrame(R.drawable.neo_mountain_climbers_a);
           faimage5.addImageFrame(R.drawable.neo_flutter_kicks_a);

           TV1.setText("Bicycle crunches");
            TV2.setText("Butt bridge");
            TV3.setText("arm crunches");
            TV4.setText("mountain climber");
            TV5.setText("flutter kicks");

            cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 1;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 2;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);

                }
            });

            cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 3;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 4;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 5;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

        }


        if(getvalue==2)
        {
            title.setText("ABS WORKOUT");
            faimage1.addImageFrame(R.drawable.neo_neo_bent_leg_twist_a);
            faimage2.addImageFrame(R.drawable.neo_butt_bridge_a);
            faimage3.addImageFrame(R.drawable.neo_reverse_crunches_a);
            faimage4.addImageFrame(R.drawable.neo_mountain_climbers_a);
            faimage5.addImageFrame(R.drawable.neo_swimmer_and_superman_a);

            TV1.setText("bent leg twist");
            TV2.setText("Butt bridge");
            TV3.setText("reverse crunches");
            TV4.setText("mountain climber");
            TV5.setText("swimmer and superman");

            cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 6;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 7;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);

                }
            });

            cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 8;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 9;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 10;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

        }


        if(getvalue==3)
        {
            title.setText("ARMS WORKOUT");
            faimage1.addImageFrame(R.drawable.neo_dead_bug_a);
            faimage2.addImageFrame(R.drawable.neo_trunk_rotation_a);
            faimage3.addImageFrame(R.drawable.neo_long_arm_crunches_a);


            TV1.setText("Dead bug");
            TV2.setText("Trunk rotation");
            TV3.setText("Long arm crunches");


            cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 11;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 12;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);

                }
            });

            cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 13;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

        }




        if(getvalue==4)
        {
            title.setText("THIGHS WORKOUT");
            faimage1.addImageFrame(R.drawable.neo_dead_bug_a);
            faimage2.addImageFrame(R.drawable.neo_flutter_kicks_a);
            faimage3.addImageFrame(R.drawable.neo_leg_drop_a);
            faimage4.addImageFrame(R.drawable.neo_clapping_crunches_a);
            faimage5.addImageFrame(R.drawable.neo_reclined_oblique_twist_a);

            TV1.setText("Dead bug");
            TV2.setText("Flutter kicks");
            TV3.setText("Leg drop");
            TV4.setText("Clapping crunches");
            TV5.setText("Reclined oblique twist");

            cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 14;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 15;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);

                }
            });

            cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 16;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 17;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int value= 18;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

        }



        if(getvalue==5)
        {
            title.setText("CHEST WORKOUT");
            faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_a);
            faimage2.addImageFrame(R.drawable.neo_cross_arm_crunches_a);
            faimage3.addImageFrame(R.drawable.neo_mountain_climbers_a);


            TV1.setText("Bicycle crunches");
            TV2.setText("Cross arms crunches");
            TV3.setText("mountain climber");


            cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 19;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

            cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 20;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);

                }
            });

            cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int value= 21;
                    Intent myIntent = new Intent(Workoutlist.this, Workout.class);
                    myIntent.putExtra("key",value);
                    startActivity(myIntent);
                }
            });

        }





        }
    }
