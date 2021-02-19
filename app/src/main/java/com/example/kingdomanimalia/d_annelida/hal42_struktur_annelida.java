package com.example.kingdomanimalia.d_annelida;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.c_nemathelminthes.hal34_filum_nemathelminthes;
import com.example.kingdomanimalia.c_nemathelminthes.hal36_contoh_nemathelminthes;
import com.example.kingdomanimalia.c_nemathelminthes.hal40_nemathelmintes_4_wuchereria;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal42_struktur_annelida extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal42_struktur_annelida);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal42_struktur_annelida.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal42_struktur_annelida.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal42_struktur_annelida.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal42_struktur_annelida.this, hal7_menu_jelajah_filum.class));
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
                    MediaPlayer mp = MediaPlayer.create(hal42_struktur_annelida.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal42_struktur_annelida.this, hal43_kelas_annelida.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}
