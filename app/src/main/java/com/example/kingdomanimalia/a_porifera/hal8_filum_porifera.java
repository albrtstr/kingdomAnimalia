package com.example.kingdomanimalia.a_porifera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;

public class hal8_filum_porifera extends AppCompatActivity {
    float x1,x2,y1,y2;
    MediaPlayer klik, swipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal8_filum_porifera);

        klik = MediaPlayer.create(this,R.raw.klik);
        swipe = MediaPlayer.create(this,R.raw.sipe);

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
                    swipe.start();
                    Intent i = new Intent(hal8_filum_porifera.this, hal9_struktur_porifera.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }
}