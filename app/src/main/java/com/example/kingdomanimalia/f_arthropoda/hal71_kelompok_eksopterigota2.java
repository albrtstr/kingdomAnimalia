package com.example.kingdomanimalia.f_arthropoda;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal71_kelompok_eksopterigota2 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal71_kelompok_eksopterigota2);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal71_kelompok_eksopterigota2.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal71_kelompok_eksopterigota2.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal71_kelompok_eksopterigota2.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal71_kelompok_eksopterigota2.this, hal7_menu_jelajah_filum.class));
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
                    MediaPlayer mp = MediaPlayer.create(hal71_kelompok_eksopterigota2.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal71_kelompok_eksopterigota2.this, hal72_kelompok_endopterigota.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    MediaPlayer mp = MediaPlayer.create(hal71_kelompok_eksopterigota2.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal71_kelompok_eksopterigota2.this, hal70_kelompok_eksopterigota.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
