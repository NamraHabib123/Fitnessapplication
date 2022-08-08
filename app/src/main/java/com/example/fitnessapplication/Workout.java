package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import kr.pe.burt.android.lib.faimageview.FAImageView;

public class Workout<getvalue, getvalues> extends AppCompatActivity {

    FAImageView faimage1;
    Button btnstart;
    boolean btnclick;
    TextView countertv,title;
    int  counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().hide();
        btnstart=findViewById(R.id.btnstart);
        countertv=findViewById(R.id.counter);
        title= findViewById(R.id.title);
        faimage1=(FAImageView)findViewById(R.id.FA1);


        Bundle extras1 = getIntent().getExtras();
        int myvalue = extras1.getInt("key");


            if (myvalue == 1) {
                title.setText("Bicycle crunches");
                faimage1.setInterval(1000);
                faimage1.setLoop(true);
                faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_a);
                faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_b);
                faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_c);

            }
            if (myvalue == 2) {
                title.setText("Butt bridge");
                faimage1.setInterval(1000);
                faimage1.setLoop(true);
                faimage1.addImageFrame(R.drawable.neo_butt_bridge_a);
                faimage1.addImageFrame(R.drawable.neo_butt_bridge_b);

            }
          if (myvalue== 3) {
              title.setText("arm crunches");
              faimage1.setInterval(1000);
              faimage1.setLoop(true);
              faimage1.addImageFrame(R.drawable.neo_long_arm_crunches_a);
              faimage1.addImageFrame(R.drawable.neo_long_arm_crunches_b);

          }
          if (myvalue == 4) {
              title.setText("mountain climber");
              faimage1.setInterval(1000);
              faimage1.setLoop(true);
              faimage1.addImageFrame(R.drawable.neo_mountain_climbers_a);
              faimage1.addImageFrame(R.drawable.neo_mountain_climbers_b);
              faimage1.addImageFrame(R.drawable.neo_mountain_climbers_c);
              faimage1.addImageFrame(R.drawable.neo_mountain_climbers_d);


          }
          if (myvalue == 5) {
              title.setText("flutter kicks");
              faimage1.setInterval(1000);
              faimage1.setLoop(true);
              faimage1.addImageFrame(R.drawable.neo_flutter_kicks_a);
              faimage1.addImageFrame(R.drawable.neo_flutter_kicks_b);
              faimage1.addImageFrame(R.drawable.neo_flutter_kicks_c);
          }



        if (myvalue == 6) {
            title.setText("bent leg twist");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_neo_bent_leg_twist_a);
            faimage1.addImageFrame(R.drawable.neo_neo_bent_leg_twist_b);

        }
        if (myvalue == 7) {
            title.setText("Butt bridge");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_butt_bridge_a);
            faimage1.addImageFrame(R.drawable.neo_butt_bridge_b);

        }

        if (myvalue == 8) {
            title.setText("reverse crunches");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_reverse_crunches_a);
            faimage1.addImageFrame(R.drawable.neo_reverse_crunches_b);
        }

        if (myvalue == 9) {
            title.setText("mountain climber");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_a);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_b);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_c);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_d);

        }
        if (myvalue == 10) {
            title.setText("swimmer and superman");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_swimmer_and_superman_a);
            faimage1.addImageFrame(R.drawable.neo_swimmer_and_superman_b);
            faimage1.addImageFrame(R.drawable.neo_swimmer_and_superman_c);
        }

        if (myvalue == 11) {
            title.setText("Dead bug");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_a);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_b);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_c);

        }
        if (myvalue == 12) {
            title.setText("Trunk rotation");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_trunk_rotation_a);
            faimage1.addImageFrame(R.drawable.neo_trunk_rotation_b);
        }
        if (myvalue == 13) {
            title.setText("Long arm crunches");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_long_arm_crunches_a);
            faimage1.addImageFrame(R.drawable.neo_long_arm_crunches_b);
        }

        if (myvalue == 14) {
            title.setText("Dead bug");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_a);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_b);
            faimage1.addImageFrame(R.drawable.neo_dead_bug_c);
        }
        if (myvalue == 15) {
            title.setText("Flutter kicks");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_flutter_kicks_a);
            faimage1.addImageFrame(R.drawable.neo_flutter_kicks_b);
            faimage1.addImageFrame(R.drawable.neo_flutter_kicks_c);
        }
        if (myvalue == 16) {
            title.setText("Leg drop");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_leg_drop_a);
            faimage1.addImageFrame(R.drawable.neo_leg_drop_b);
        }
        if (myvalue == 17) {
            title.setText("Clapping crunches");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_clapping_crunches_a);
            faimage1.addImageFrame(R.drawable.neo_clapping_crunches_b);
            faimage1.addImageFrame(R.drawable.neo_clapping_crunches_c);

        }
        if (myvalue == 18) {
            title.setText("Reclined oblique twist");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_reclined_oblique_twist_a);
            faimage1.addImageFrame(R.drawable.neo_reclined_oblique_twist_b);
            faimage1.addImageFrame(R.drawable.neo_reclined_oblique_twist_c);
        }
        if (myvalue == 19) {
            title.setText("Bicycle crunches");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_a);
            faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_b);
            faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_c);
        }
        if (myvalue == 20) {
            title.setText("Cross arms crunches");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_cross_arm_crunches_a);
            faimage1.addImageFrame(R.drawable.neo_cross_arm_crunches_b);

        }
        if (myvalue == 21) {
            title.setText("mountain climber");
            faimage1.setInterval(1000);
            faimage1.setLoop(true);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_a);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_b);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_c);
            faimage1.addImageFrame(R.drawable.neo_mountain_climbers_d);
        }
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(btnclick)
                {
                    btnclick= false;
                    faimage1.startAnimation();
                    btnstart.setText("PAUSE");
                }
                else
                {
                    btnclick= true;
                    faimage1.stopAnimation();
                    btnstart.setText("start");
                }
            }
        });


        faimage1.setOnFinishAnimationListener(new FAImageView.OnFinishAnimationListener() {
            @Override
            public void onFinishAnimation(boolean isLoopAnimation) {
                if(isLoopAnimation) {
                    Log.v("FAImageView", "finished an animation cycle.");

                    if(counter< 10)
                    {
                        counter=counter+1;
                        countertv.setText(""+counter);

                    }
                    else{

                        faimage1.stopAnimation();
                        countertv.setText("complete");
                        btnstart.setText("Restart");
                    }

                }
                else {
                    Log.v("FAImageView", "Animation is completed");
                }
            }
        });

    }





}