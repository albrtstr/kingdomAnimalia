package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.f_arthropoda.hal73_kelompok_endopterigota2;

public class hal74_filum_enchinodermata extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal74_filum_enchinodermata);
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
                    MediaPlayer mp = MediaPlayer.create(hal74_filum_enchinodermata.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal74_filum_enchinodermata.this, hal75_struktur_enchinodermata.class);
                    startActivity(i);
                    finish();

                }

                break;
        }
        return false;
    }
}
