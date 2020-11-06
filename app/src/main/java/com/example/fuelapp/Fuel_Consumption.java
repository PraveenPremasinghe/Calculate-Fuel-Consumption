package com.example.fuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fuel_Consumption extends AppCompatActivity {

    EditText liter,distance,price;
    Button resultbutton;
    TextView resultView1 , resultView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel__consumption);

        //Inputs
        liter    = (EditText) findViewById(R.id.inputL);
        distance = (EditText) findViewById(R.id.inputD);
        price    = (EditText) findViewById(R.id.inputP);

        //Buttons
        resultbutton = (Button) findViewById(R.id.btncal);

        //TextView
        resultView1 = (TextView) findViewById(R.id.idreslt1);
        resultView2 = (TextView) findViewById(R.id.idreslt2);


         //
        resultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double Lit = Double.parseDouble(liter.getText().toString());
                Double Dis = Double.parseDouble(distance.getText().toString());
                Double Pri = Double.parseDouble(price.getText().toString());

                //Fuel Consumption Calculation
                Double FuelConsumption = Lit / Dis;
                resultView1.setText(FuelConsumption.toString());

                //Fuel Cost
                Double FuelCost = Lit * Pri / Dis;
                resultView2.setText(FuelCost.toString());




            }
        });


    }
}