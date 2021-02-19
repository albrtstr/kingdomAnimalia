package com.example.kingdomanimalia.e_mollusca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.d_annelida.hal41_filum_annelida;
import com.example.kingdomanimalia.d_annelida.hal43_kelas_annelida;
import com.example.kingdomanimalia.d_annelida.hal46_annelida_3_hirudinea;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal48_struktur_mollusca extends AppCompatActivity {

    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal48_struktur_mollusca);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal48_struktur_mollusca.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal48_struktur_mollusca.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal48_struktur_mollusca.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal48_struktur_mollusca.this, hal7_menu_jelajah_filum.class));
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
                    MediaPlayer mp = MediaPlayer.create(hal48_struktur_mollusca.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal48_struktur_mollusca.this, hal49_kelas_mollusca.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    MediaPlayer mp = MediaPlayer.create(hal48_struktur_mollusca.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal48_struktur_mollusca.this, hal47_filum_mollusca.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
