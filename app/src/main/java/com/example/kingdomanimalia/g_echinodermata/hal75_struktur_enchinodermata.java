package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.f_arthropoda.hal53_filum_arthropoda;
import com.example.kingdomanimalia.f_arthropoda.hal54_struktur_arthropoda;
import com.example.kingdomanimalia.f_arthropoda.hal73_kelompok_endopterigota2;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal75_struktur_enchinodermata extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal75_struktur_enchinodermata);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal75_struktur_enchinodermata.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal75_struktur_enchinodermata.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal75_struktur_enchinodermata.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal75_struktur_enchinodermata.this, hal7_menu_jelajah_filum.class));
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
                    MediaPlayer mp = MediaPlayer.create(hal75_struktur_enchinodermata.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal75_struktur_enchinodermata.this, hal76_kelas_enchinodermata.class);
                    startActivity(i);
                    finish();

                }

                break;
        }
        return false;
    }
}
