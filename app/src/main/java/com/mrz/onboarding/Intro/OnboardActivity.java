package com.mrz.onboarding.Intro;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cuberto.liquid_swipe.LiquidPager;
import com.mrz.onboarding.R;


public class OnboardActivity extends AppCompatActivity {

    public Button btn;
    LiquidPager pager;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);

        pager=findViewById(R.id.pager);
        viewPager=new ViewPager(getSupportFragmentManager(),1);
        pager.setAdapter(viewPager);



    }
}