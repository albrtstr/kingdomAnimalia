package com.example.kingdomanimalia.a_porifera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal10_porifera extends AppCompatActivity {
    float x1,x2,y1,y2;

    int flag;
    ImageView siram,air;
    Animation animTranslate;
    Animation animTranslateAir ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal10_porifera);


        animTranslate  = AnimationUtils.loadAnimation(this, R.anim.anim);
        animTranslateAir = AnimationUtils.loadAnimation(this, R.anim.translate);

        Toast.makeText(this, "Ketuk gambar alat penyiram 1 kali", Toast.LENGTH_SHORT).show();
        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(hal10_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal10_porifera.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(hal10_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal10_porifera.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });

        //animasi
        siram = findViewById(R.id.sirami);
        air = findViewById(R.id.air_10);

        flag = 0;
        siram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(hal10_porifera.this,R.raw.klik);
                mp.start();
                air.setVisibility(View.INVISIBLE);
                animasi(flag);
            }
        });
    }
    public void animasi(int a) {
        switch (a) {
            case 0:
                siram.animate().translationY(-300);
                siram.animate().setDuration(2000);
                flag = 1;
                Toast.makeText(this, "Ketuk kembali alat penyiram", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                siram.startAnimation(animTranslate);
                air.setVisibility(View.VISIBLE);

                Toast.makeText(this, "Alat penyiram mengeluarkan air, masuk melaui dinding, dan porifera mengeluarkan air dari dalam dirinya.", Toast.LENGTH_LONG).show();
                flag = 2;
            case 2:
                air.startAnimation(animTranslateAir);
                flag = 3;
                break;

            case 3:
                siram.animate().translationY(0);
                siram.animate().setDuration(2000);
                flag = 0;
                break;
        }
    }
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 > x2){

                    MediaPlayer mp = MediaPlayer.create(hal10_porifera.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal10_porifera.this, hal11_porifera.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){

                    MediaPlayer mp = MediaPlayer.create(hal10_porifera.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal10_porifera.this,hal9_struktur_porifera.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}