package com.example.kingdomanimalia.a_porifera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal13_kelas_porifera extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal13_kelas_porifera);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal13_kelas_porifera.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal13_kelas_porifera.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });


        ImageView calcarea = findViewById(R.id.button1_porifera);
        ImageView hexa = findViewById(R.id.button2_porifera);
        ImageView demos = findViewById(R.id.button3_porifera);

        calcarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal13_kelas_porifera.this,hal14_kelas_porifera_1_calcarea.class));
            }
        });

        hexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal13_kelas_porifera.this,hal15_kelas_porifera_2_hexatinellide.class));
            }
        });

        demos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal13_kelas_porifera.this,hal16_kelas_porifera_3_demospongiae.class));
            }
        });
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
//                if(x1 > x2){
//                    Intent i = new Intent(hal13_kelas_porifera.this,hal14_kelas_porifera_1_calcarea.class);
//                    startActivity(i);
//                    finish();
//
//                }
//                else
                if(x1 < x2){
                    MediaPlayer mp = MediaPlayer.create(hal13_kelas_porifera.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal13_kelas_porifera.this,hal12_porifera.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}