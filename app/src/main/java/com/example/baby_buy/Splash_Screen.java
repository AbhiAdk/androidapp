package com.example.baby_buy;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        imageView=findViewById(R.id.sImg);
        textView=findViewById(R.id.appTxt);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent=new Intent(Splash_Screen.this,Login.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread.start();
    }
}