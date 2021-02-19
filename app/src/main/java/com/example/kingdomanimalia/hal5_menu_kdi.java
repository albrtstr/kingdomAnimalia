package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.a_porifera.hal10_porifera;
import com.example.kingdomanimalia.a_porifera.hal8_filum_porifera;
import com.example.kingdomanimalia.a_porifera.hal9_struktur_porifera;
import com.example.kingdomanimalia.h_platyhelminthes.hal33_daurfasciola_2;

public class hal5_menu_kdi extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal5_menu_kdi);

        ImageView home = findViewById(R.id.btnhomee);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal5_menu_kdi.this,R.raw.klik);
                mp.start();
                startActivity(new Intent(hal5_menu_kdi.this, hal4_menu_screen.class));
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
                    MediaPlayer mp = MediaPlayer.create(hal5_menu_kdi.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal5_menu_kdi.this, hal6_menu_kdi_2.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }

}