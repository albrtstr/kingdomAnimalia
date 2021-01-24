package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal76_kelas_enchinodermata extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal76_kelas_enchinodermata);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal76_kelas_enchinodermata.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal76_kelas_enchinodermata.this, hal74_filum_enchinodermata.class));
                finish();
            }
        });

        ImageButton asteroid = findViewById(R.id.asteroid);
        ImageButton ophi = findViewById(R.id.ophi);
        ImageButton enchi = findViewById(R.id.enchi);
        ImageButton holo = findViewById(R.id.holo);
        ImageButton crino = findViewById(R.id.crino);

        asteroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal76_kelas_enchinodermata.this,hal77_enchinodermata_1_asteroidea.class));
            }
        });

        ophi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal76_kelas_enchinodermata.this,hal78_enchinodermata_2_ophiuroidea.class));
            }
        });

        enchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal76_kelas_enchinodermata.this,hal79_enchinodermata_3_enchinoidea.class));
            }
        });

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal76_kelas_enchinodermata.this,hal80_enchinodermata_4_holo.class));
            }
        });

        crino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal76_kelas_enchinodermata.this,hal82_enchinodermata_5_crino.class));
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
                    Intent i = new Intent(hal76_kelas_enchinodermata.this, hal77_enchinodermata_1_asteroidea.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}
