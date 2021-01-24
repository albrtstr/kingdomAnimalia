package com.example.kingdomanimalia.e_mollusca;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.d_annelida.hal41_filum_annelida;
import com.example.kingdomanimalia.d_annelida.hal43_kelas_annelida;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal49_kelas_mollusca extends AppCompatActivity {

    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal49_kelas_mollusca);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal49_kelas_mollusca.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal49_kelas_mollusca.this, hal47_filum_mollusca.class));
                finish();
            }
        });

        ImageButton a = findViewById(R.id.button_mollusca_1_gastropoda);
        ImageButton b = findViewById(R.id.button_mollusca_2_pelecypoda);
        ImageButton c = findViewById(R.id.button_mollusca_3_cephalopoda);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal49_kelas_mollusca.this,hal50_mollusca_1_gastropoda.class));
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal49_kelas_mollusca.this,hal51_mollusca_2_pelecypoda.class));
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal49_kelas_mollusca.this,hal52_mollusca_3_cephalopoda.class));
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
                y2 = touchEvent.getY(); if(x1 < x2){
                    Intent i = new Intent(hal49_kelas_mollusca.this, hal48_struktur_mollusca.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
