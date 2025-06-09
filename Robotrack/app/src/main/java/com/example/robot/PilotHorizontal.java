package com.example.robot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PilotHorizontal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilot_horizontal);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
            window.setNavigationBarColor(Color.BLACK);
        }

        TextView tilt = findViewById(R.id.tilt);
        TextView distance = findViewById(R.id.distance);

        ImageButton btnUp = findViewById(R.id.btnUp);
        ImageButton btnDown = findViewById(R.id.btnDown);
        ImageButton btnLeft = findViewById(R.id.btnLeft);
        ImageButton btnRight = findViewById(R.id.btnRight);

        SwitchCompat switchbtn = findViewById(R.id.switchbtn);

        View overlayView = findViewById(R.id.overlayView);

        switchbtn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                overlayView.setVisibility(View.VISIBLE);
                switchbtn.setThumbTintList(ColorStateList.valueOf(Color.parseColor("#ffffff")));
                switchbtn.setTrackTintList(ColorStateList.valueOf(Color.parseColor("#2F76B1")));
            } else {
                overlayView.setVisibility(View.GONE);
            }
        });
    }


}