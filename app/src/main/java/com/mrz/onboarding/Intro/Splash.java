package com.mrz.onboarding.Intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.mrz.onboarding.MainActivity;
import com.mrz.onboarding.R;


public class Splash extends AppCompatActivity {

    Animation anim;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView=(ImageView)findViewById(R.id.imageView2); // Declare an imageView to show the animation.

            startActivity(new Intent(getApplicationContext(),OnboardActivity.class));
            finish();

    }
}