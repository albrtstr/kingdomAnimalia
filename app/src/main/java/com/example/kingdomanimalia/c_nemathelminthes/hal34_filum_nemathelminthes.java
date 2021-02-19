package com.example.kingdomanimalia.c_nemathelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.b_coelenterata.hal24_kelas_coelenterata_3_anthozoa;

public class hal34_filum_nemathelminthes extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal34_filum_nemathelminthes);
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
                    MediaPlayer mp = MediaPlayer.create(hal34_filum_nemathelminthes.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal34_filum_nemathelminthes.this, hal35_struktur_nemathelminthes.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}