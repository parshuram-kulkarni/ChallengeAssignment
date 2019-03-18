package com.android.challengeassignment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.challengeassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScientificFragment extends Fragment {

    TextView Result;
    EditText inputOne;
    Button logButton;
    Button lnButton;

    public ScientificFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_scientific, container, false);

        Result = view.findViewById(R.id.scientificValue);
        inputOne = view.findViewById(R.id.valueOne);
        logButton = view.findViewById(R.id.logButton);
        lnButton = view.findViewById(R.id.lnButton);


        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(inputOne.getText().toString());
                double result = Math.log(num);
                Result.setText(String.format("%.2f",result));
            }
        });

        lnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(inputOne.getText().toString());
                double result = (-Math.log(1-num))/num;
                Result.setText(String.valueOf(result));
            }
        });
        return view;
    }
}
