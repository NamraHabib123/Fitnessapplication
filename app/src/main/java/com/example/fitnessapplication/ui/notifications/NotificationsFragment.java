package com.example.fitnessapplication.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.fitnessapplication.R;
import com.example.fitnessapplication.VarificationcodeScreen;
import com.example.fitnessapplication.Workoutlist;
import com.example.fitnessapplication.signup;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    CardView cardview1,cardview2, cardview3, cardview4, cardview5;
    TextView textview1, textview2, textview3, textview4, textview5;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      //  notificationsViewModel =  new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
       // final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//               // textView.setText(s);
//            }
//        });



        textview1= root. findViewById(R.id.TV1);
        textview2= root. findViewById(R.id.TV2);
        textview3= root. findViewById(R.id.TV3);
        textview4= root. findViewById(R.id.TV4);
        textview5= root. findViewById(R.id.TV5);

        cardview1=root. findViewById(R.id.card1);
        cardview2=root. findViewById(R.id.card2);
        cardview3= root.findViewById(R.id.card3);
        cardview4=root. findViewById(R.id.card4);
        cardview5=root.findViewById(R.id.card5);

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value= 1;
                Intent myIntent = new Intent(getActivity().getApplication(), Workoutlist.class);
                myIntent.putExtra("key",value);
                startActivity(myIntent);
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value= 2;
                Intent myIntent = new Intent(getActivity().getApplication(), Workoutlist.class);
                myIntent.putExtra("key",value);
                startActivity(myIntent);

            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value= 3;
                Intent myIntent = new Intent(getActivity().getApplication(), Workoutlist.class);
                myIntent.putExtra("key",value);
                startActivity(myIntent);
            }
        });

        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int value= 4;
                Intent myIntent = new Intent(getActivity().getApplication(), Workoutlist.class);
                myIntent.putExtra("key",value);
                startActivity(myIntent);
            }
        });

        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int value= 5;
                Intent myIntent = new Intent(getActivity().getApplication(), Workoutlist.class);
                myIntent.putExtra("key",value);
                startActivity(myIntent);
            }
        });



        return root;
    }
}