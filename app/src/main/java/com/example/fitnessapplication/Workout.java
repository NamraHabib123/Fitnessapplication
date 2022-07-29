package com.example.fitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.pe.burt.android.lib.faimageview.FAImageView;

public class Workout extends AppCompatActivity {

    FAImageView faimage1;
    Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().hide();
        btnstart=findViewById(R.id.btnstart);

        faimage1=(FAImageView)findViewById(R.id.FA1);
        faimage1.setInterval(1000);
        faimage1.setLoop(true);
        faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_a);
        faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_b);
        faimage1.addImageFrame(R.drawable.neo_bicycle_crunches_c);




        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //faimage1.startAnimation();

                if(btnstart.getId()==R.id.btnstart)
                {
                    onResume();
                    btnstart.setText("PAUSE");
                }
                else
                {
                    onPause();
                    btnstart.setText("start");
                }
            }
        });

    }



    @Override
    public void onResume() {
        super.onResume();
        faimage1.startAnimation();

    }

    @Override
    public void onPause() {
        super.onPause();
        faimage1.stopAnimation();

    }



}