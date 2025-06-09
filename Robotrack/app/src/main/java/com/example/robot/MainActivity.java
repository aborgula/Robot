package com.example.robot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView scan = findViewById(R.id.scan);
        TextView sense = findViewById(R.id.sense);
        LinearLayout analyze = findViewById(R.id.analyze);

        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        slideUp.setStartOffset(0);
        scan.startAnimation(slideUp);

        Animation slideUp2 = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        slideUp2.setStartOffset(300);
        sense.startAnimation(slideUp2);

        Animation slideUp3 = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        slideUp3.setStartOffset(600);
        analyze.startAnimation(slideUp3);


        CardView btnConnect = findViewById(R.id.btnConnect);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setNavigationBarColor(Color.BLACK);
        }

        btnConnect.setOnClickListener(v->{
            Intent intent = new Intent(this, PilotHorizontal.class);
            startActivity(intent);
        });


    }
}