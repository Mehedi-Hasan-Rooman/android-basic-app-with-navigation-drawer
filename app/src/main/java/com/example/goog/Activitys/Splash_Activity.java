package com.example.goog.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import com.example.goog.R;

public class Splash_Activity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        progressBar = findViewById(R.id.progress_bar);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                progressBar.setVisibility(View.VISIBLE);
                Intent intent = new Intent(Splash_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();


            }
        },3000);
    }
}
