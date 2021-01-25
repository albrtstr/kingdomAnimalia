package com.example.kingdomanimalia.h_platyhelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.g_echinodermata.hal74_filum_enchinodermata;
import com.example.kingdomanimalia.g_echinodermata.hal75_struktur_enchinodermata;
import com.example.kingdomanimalia.hal31_regenerasi_dugesia;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal27_kelas_platyhelminthes extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal27_kelas_platyhelminthes);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal27_kelas_platyhelminthes.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal27_kelas_platyhelminthes.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });

        ImageButton b1 = findViewById(R.id.button1_porifera);
        ImageButton b2 = findViewById(R.id.button2_porifera);
        ImageButton b3 = findViewById(R.id.button3_porifera);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal27_kelas_platyhelminthes.this, hal28_kelas_platyhelminthes_1_turbellaria.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal27_kelas_platyhelminthes.this,hal29_kelas_platyhelminthes_2_trematoda.class));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal27_kelas_platyhelminthes.this,hal30_kelas_platyhelminthes_3_cestoda.class));
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
                    Intent i = new Intent(hal27_kelas_platyhelminthes.this, hal31_regenerasi_dugesia.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    Intent i = new Intent(hal27_kelas_platyhelminthes.this,hal26_struktur_platyhelminthes.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}