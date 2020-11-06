package com.example.fuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcom extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topanim,bottomanim;
    ImageView image1,image2;
    TextView text1,text2,text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        topanim = AnimationUtils.loadAnimation(this,R.anim.topanimation);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottemanimation);

        image1 = findViewById(R.id.logoid);
        image2 = findViewById(R.id.bottemid);

        text1 = findViewById(R.id.welid);
        text2 = findViewById(R.id.wel2id);
        text3 = findViewById(R.id.appnameid);

        image1.setAnimation(topanim);
        image2.setAnimation(bottomanim);
        text1.setAnimation(topanim);
        text2.setAnimation(topanim);
        text3.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Welcom.this,Menu_page.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}