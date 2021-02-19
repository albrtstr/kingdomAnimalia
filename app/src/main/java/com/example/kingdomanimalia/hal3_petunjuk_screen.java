package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.h_platyhelminthes.hal33_daurfasciola_2;

public class hal3_petunjuk_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal3_petunjuk_screen);

        ImageView home = findViewById(R.id.btnhome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal3_petunjuk_screen.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal3_petunjuk_screen.this, hal4_menu_screen.class));
                finish();
            }
        });
    }
}