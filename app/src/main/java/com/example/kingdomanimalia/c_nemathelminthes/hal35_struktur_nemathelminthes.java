package com.example.kingdomanimalia.c_nemathelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.b_coelenterata.hal17_filum_coelenterata;
import com.example.kingdomanimalia.b_coelenterata.hal18_struktur_coelenterata;
import com.example.kingdomanimalia.b_coelenterata.hal24_kelas_coelenterata_3_anthozoa;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal35_struktur_nemathelminthes extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal35_struktur_nemathelminthes);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal35_struktur_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal35_struktur_nemathelminthes.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal35_struktur_nemathelminthes.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal35_struktur_nemathelminthes.this, hal7_menu_jelajah_filum.class));
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

                    MediaPlayer mp = MediaPlayer.create(hal35_struktur_nemathelminthes.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal35_struktur_nemathelminthes.this, hal36_contoh_nemathelminthes.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}