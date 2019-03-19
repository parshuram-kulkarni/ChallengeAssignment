package com.android.challengeassignment.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.challengeassignment.CalculatorActivity;
import com.android.challengeassignment.R;
import com.android.challengeassignment.calculation.Calculate;
import com.android.challengeassignment.calculation.ChangeBorderColor;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicFragment extends Fragment implements Calculate, ChangeBorderColor {

    Button addButton;
    Button subButton;
    Button mulButton;
    Button divButton;
    TextView result;
    EditText firstInput;
    EditText secondInput;


    double addResult;
    double subResult;
    double mulResult;
    double divResult;

    public BasicFragment() {  }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

     View view = inflater.inflate(R.layout.fragment_basic, container, false);

        addButton = view.findViewById(R.id.buttonAdd);
        subButton = view.findViewById(R.id.buttonSub);
        mulButton = view.findViewById(R.id.buttonMlt);
        divButton = view.findViewById(R.id.buttonDiv);
        result = view.findViewById(R.id.textfinalResult);
        firstInput = view.findViewById(R.id.inputOne);
        secondInput = view.findViewById(R.id.inputTwo);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstInput.getText().toString().isEmpty()){
                    /*firstInput.setError("please enter the first number");*/
                    Toast.makeText(getContext(),"please enter the first number",Toast.LENGTH_SHORT).show();
                }

               else if(secondInput.getText().toString().isEmpty()){
                    /*secondInput.setError("please enter ");*/
                    Toast.makeText(getContext(),"please enter the second number",Toast.LENGTH_SHORT).show();
                }
                else{
                    double a = Double.parseDouble(firstInput.getText().toString());
                    double b = Double.parseDouble(secondInput.getText().toString());
                    add(a, b);
                    result.setText(String.valueOf(addResult)); }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstInput.getText().toString().isEmpty()){
                    /*firstInput.setError("please enter the first number");*/
                    Toast.makeText(getContext(),"please enter the first number",Toast.LENGTH_SHORT).show();
                }

                else if(secondInput.getText().toString().isEmpty()){
                    /*secondInput.setError("please enter ");*/
                    Toast.makeText(getContext(),"please enter the second number",Toast.LENGTH_SHORT).show();
                }
                else{

                double a = Double.parseDouble(firstInput.getText().toString());
                double b = Double.parseDouble(secondInput.getText().toString());
                substract(a, b);
                result.setText(String.valueOf(subResult)); }
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstInput.getText().toString().isEmpty()){
                   /* firstInput.setError("please enter the first number");*/
                    Toast.makeText(getContext(),"please enter the first number",Toast.LENGTH_SHORT).show();
                }

               else if(secondInput.getText().toString().isEmpty()){
                  /*  secondInput.setError("please enter ");*/
                    Toast.makeText(getContext(),"please enter the second number",Toast.LENGTH_SHORT).show();
                }
                else{
                double a = Double.parseDouble(firstInput.getText().toString());
                double b = Double.parseDouble(secondInput.getText().toString());
                multiply(a, b);
                result.setText(String.valueOf(mulResult)); }
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstInput.getText().toString().isEmpty()){
                   /* firstInput.setError("please enter the first number");*/
                    Toast.makeText(getContext(),"please enter the first number",Toast.LENGTH_SHORT).show();
                }

               else if(secondInput.getText().toString().isEmpty()){
                    /*secondInput.setError("please enter ");*/
                    Toast.makeText(getContext(),"please enter the second number",Toast.LENGTH_SHORT).show();
                }
                else{
                double a = Double.parseDouble(firstInput.getText().toString());
                double b = Double.parseDouble(secondInput.getText().toString());
                divide(a, b);
                result.setText(String.valueOf(divResult));}
            }
        });

     return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CalculatorActivity calculatorActivity = (CalculatorActivity) getActivity();
        calculatorActivity.setColorChangeListener(this);
    }

    @Override
    public double add(double a, double b) {
        addResult = a+b;
        return addResult;
    }

    @Override
    public double substract(double a, double b) {
        subResult = a-b;
        return subResult;
    }

    @Override
    public double multiply(double a, double b) {
        mulResult = a * b;
        return mulResult;
    }

    @Override
    public double divide(double a, double b) {
        divResult = a/b;
        return divResult;
    }

    @Override
    public void changeColor(int buttonColor) {
        RelativeLayout viewId = getView().findViewById(R.id.secondRelative);
        viewId.setBackgroundColor(buttonColor);
    }
}
