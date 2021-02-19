package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.a_porifera.hal14_kelas_porifera_1_calcarea;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal82_enchinodermata_5_crino extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal82_enchinodermata_5_crino);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal82_enchinodermata_5_crino.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal82_enchinodermata_5_crino.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal82_enchinodermata_5_crino.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal82_enchinodermata_5_crino.this, hal76_kelas_enchinodermata.class));
                finish();
            }
        });


        ImageView menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal82_enchinodermata_5_crino.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal82_enchinodermata_5_crino.this, hal7_menu_jelajah_filum.class));
                finish();
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
                if(x1 > x2){
                    MediaPlayer mp = MediaPlayer.create(hal82_enchinodermata_5_crino.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal82_enchinodermata_5_crino.this, hal83_enchinodermata_5_crino2.class);
                    startActivity(i);
                    finish();

                }

                break;
        }
        return false;
    }
}
