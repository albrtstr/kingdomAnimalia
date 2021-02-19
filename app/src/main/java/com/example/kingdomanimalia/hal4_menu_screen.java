package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kingdomanimalia.a_porifera.hal10_porifera;
import com.example.kingdomanimalia.a_porifera.hal8_filum_porifera;

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

        MediaPlayer mp = MediaPlayer.create(this,R.raw.klik);

        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(hal4_menu_screen.this,hal5_menu_kdi.class));

            }
        });

        jelajahfilum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(hal4_menu_screen.this, hal7_menu_jelajah_filum.class));

            }
        });

        soalevaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://quizizz.com/join?gc=46674764"));
                startActivity(implicit);
            }
        });

        tts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(hal4_menu_screen.this,hal86_tts.class));
            }
        });

        profilpengembang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                ////startActivity(new Intent(hal4_menu_screen.this,hal89_profil_pengembang.class));
            }
        });

        ImageView help = findViewById(R.id.btnHelp);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(hal4_menu_screen.this,hal3_petunjuk_screen.class));
            }
        });
    }

}