package com.example.robot;

import androidx.appcompat.app.AppCompatActivity;

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

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
            window.setNavigationBarColor(Color.BLACK); // lub ContextCompat.getColor(this, R.color.your_color)
        }

        ImageView logo = findViewById(R.id.logoImage);
        Animation blinkSequence = AnimationUtils.loadAnimation(this, R.anim.blink_sequence);
        // Nasłuchujemy zakończenia animacji
        blinkSequence.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) { }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Po zakończeniu animacji przechodzimy do MainActivity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();  // żeby nie wracać do splash screena po back button
            }

            @Override
            public void onAnimationRepeat(Animation animation) { }
        });

        logo.startAnimation(blinkSequence);
    }
}