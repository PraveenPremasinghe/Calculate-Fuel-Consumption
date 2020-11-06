package com.example.fuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Menu_page extends AppCompatActivity {


    TextView month,day,year;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);







        month = findViewById(R.id.month);
        day = findViewById(R.id.day);
        year = findViewById(R.id.year);





        Date currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);


        String[] splitDate = formattedDate.split(",");

        Log.d("MyLOG",currentTime.toString());
        Log.d("MyLOG",formattedDate);

        month.setText(splitDate[1]);
        day.setText(splitDate[0]);
        year.setText(splitDate[2]);

        Log.d("MyLOG",splitDate[0].trim());
        Log.d("MyLOG",splitDate[1].trim());
        Log.d("MyLOG",splitDate[2].trim());

    }




    public void fuelbtn(View view) {


        Toast.makeText(this,"fuel button clicked",Toast.LENGTH_SHORT).show();

    }

    public void calndbtn(View view) {
        Toast.makeText(this,"Calander button clicked",Toast.LENGTH_SHORT).show();
    }

    public void travbtn(View view) {
        Toast.makeText(this,"travel button clicked",Toast.LENGTH_LONG).show();
    }
}