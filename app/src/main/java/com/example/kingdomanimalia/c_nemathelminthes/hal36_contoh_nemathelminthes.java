package com.example.kingdomanimalia.c_nemathelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.b_coelenterata.hal17_filum_coelenterata;
import com.example.kingdomanimalia.b_coelenterata.hal18_struktur_coelenterata;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal36_contoh_nemathelminthes extends AppCompatActivity {
    float x1,x2,y1,y2;

    ImageButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal36_contoh_nemathelminthes);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this,hal37_nemathelmintes_1_ascaris.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this,hal38_nemathelmintes_2_ancylostoma.class));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this,hal39_nemathelmintes_3_oxyuris.class));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal36_contoh_nemathelminthes.this,hal38_nemathelmintes_2_ancylostoma.class));
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
                 if(x1 < x2){
                     MediaPlayer mp = MediaPlayer.create(hal36_contoh_nemathelminthes.this,R.raw.sipe);
                     mp.start();
                    Intent i = new Intent(hal36_contoh_nemathelminthes.this, hal35_struktur_nemathelminthes.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}