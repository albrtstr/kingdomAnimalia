package com.example.kingdomanimalia.e_mollusca;

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

public class hal52_mollusca_3_cephalopoda extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal52_mollusca_3_cephalopoda);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal52_mollusca_3_cephalopoda.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal52_mollusca_3_cephalopoda.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal52_mollusca_3_cephalopoda.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal52_mollusca_3_cephalopoda.this, hal49_kelas_mollusca.class));
                finish();
            }
        });


        ImageView menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal52_mollusca_3_cephalopoda.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal52_mollusca_3_cephalopoda.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
    }
}

