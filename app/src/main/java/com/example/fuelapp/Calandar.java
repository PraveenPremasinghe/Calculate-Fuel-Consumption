package com.example.fuelapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calandar extends AppCompatActivity {

CalendarView calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calandar);

        calendar = (CalendarView) findViewById(R.id.calendar1);
       calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

               Toast.makeText(getBaseContext(),"Selected Date "+dayOfMonth+"/"+month+"/"+year,Toast.LENGTH_LONG).show();

           }
       });

    }
}