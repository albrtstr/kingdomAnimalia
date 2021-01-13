package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hal4_menu_screen extends AppCompatActivity {
    ImageButton kd,jelajahfilum,soalevaluasi,tts,profilpengembang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal4_menu_screen);

        kd = findViewById(R.id.button_kdi);
        jelajahfilum = findViewById(R.id.button_jelajahfilum);
        soalevaluasi = findViewById(R.id.button_soalevaluasi);
        tts = findViewById(R.id.button_tts);
        profilpengembang = findViewById(R.id.button_develpoer);

        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menu_screen.this,hal5_menu_kdi.class));
            }
        });

        jelajahfilum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menu_screen.this,hal7_menu_jelajah_filum.class));
            }
        });

        soalevaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        profilpengembang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menu_screen.this,hal89_profil_pengembang.class));
            }
        });
    }
}