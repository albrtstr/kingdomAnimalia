package com.example.kingdomanimalia;

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

import com.example.kingdomanimalia.h_platyhelminthes.hal25_filum_platyhelminthes;
import com.example.kingdomanimalia.h_platyhelminthes.hal27_kelas_platyhelminthes;
import com.example.kingdomanimalia.h_platyhelminthes.hal29_kelas_platyhelminthes_2_trematoda;
import com.example.kingdomanimalia.h_platyhelminthes.hal30_kelas_platyhelminthes_3_cestoda;
import com.example.kingdomanimalia.h_platyhelminthes.hal33_daurfasciola_2;

public class hal31_regenerasi_dugesia extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal31_regenerasi_dugesia);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal31_regenerasi_dugesia.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal31_regenerasi_dugesia.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        //animasi
        Animation knifeAnimasi = AnimationUtils.loadAnimation(this,R.anim.knife);
        //animasi pisau
        ImageView knife1 = findViewById(R.id.knife1);
        ImageView knife2 = findViewById(R.id.knife2);

        knife1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.klik);
                mp.start();
                knife1.startAnimation(knifeAnimasi);
                Toast.makeText(hal31_regenerasi_dugesia.this, "Jika kepala dipotong, kepalanya akan bertambah 1", Toast.LENGTH_SHORT).show();
            }
        });

        knife2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.klik);
                mp.start();
                knife2.startAnimation(knifeAnimasi);
                Toast.makeText(hal31_regenerasi_dugesia.this, "Jika tubuh dipotong akan membuat tumbuh kepala di bagian bawah", Toast.LENGTH_SHORT).show();
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
                    MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal31_regenerasi_dugesia.this, hal32_daur_fasciola.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    MediaPlayer mp = MediaPlayer.create(hal31_regenerasi_dugesia.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal31_regenerasi_dugesia.this, hal27_kelas_platyhelminthes.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}