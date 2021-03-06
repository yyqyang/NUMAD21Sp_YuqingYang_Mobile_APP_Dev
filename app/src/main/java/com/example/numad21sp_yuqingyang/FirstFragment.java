package com.example.numad21sp_yuqingyang;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

        }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.buttonA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonA:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:A");
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonB:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:B");
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonC:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:C");
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonD).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonD:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:D");
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonE:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:E");
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonF:
                        TextView tv = (TextView)getView().findViewById(R.id.textView_pressed);
                        tv.setText("Pressed:F");
                        break;
                }
            }
        });

    }

}