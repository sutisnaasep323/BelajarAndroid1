package com.example.basicandroid2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends Activity {

    TextView textSplash1, textSplash2;
    ImageView image;
    private static int SPLASH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);

        textSplash1 = findViewById(R.id.text_splash_1);
        textSplash2 = findViewById(R.id.text_splash_2);
        image = findViewById(R.id.splash_image);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        }, SPLASH);

        Animation nim = AnimationUtils.loadAnimation(this, R.anim.splash_screen);
        image.startAnimation(nim);
        textSplash1.startAnimation(nim);
        textSplash2.startAnimation(nim);

    }
}


