package com.example.kingdomanimalia.b_coelenterata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.a_porifera.hal14_kelas_porifera_1_calcarea;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal24_kelas_coelenterata_3_anthozoa extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal24_kelas_coelenterata_3_anthozoa);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal24_kelas_coelenterata_3_anthozoa.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal24_kelas_coelenterata_3_anthozoa.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal24_kelas_coelenterata_3_anthozoa.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal24_kelas_coelenterata_3_anthozoa.this, hal21_kelas_coelenterata.class));
                finish();
            }
        });

        ImageView menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal24_kelas_coelenterata_3_anthozoa.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal24_kelas_coelenterata_3_anthozoa.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
    }
//    public boolean onTouchEvent(MotionEvent touchEvent) {
//
//        switch(touchEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                x1 = touchEvent.getX();
//                y1 = touchEvent.getY();
//                break;
//            case MotionEvent.ACTION_UP:
//                x2 = touchEvent.getX();
//                y2 = touchEvent.getY();
//                if(x1 < x2){
//                    Intent i = new Intent(hal24_kelas_coelenterata_3_anthozoa.this,hal23_kelas_coelenterata_2_scypozoa.class);
//                    startActivity(i);
//                    finish();
//
//                }
//
//        }
//        return false;
//    }
}