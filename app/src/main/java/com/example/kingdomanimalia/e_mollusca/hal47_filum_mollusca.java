package com.example.kingdomanimalia.e_mollusca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.d_annelida.hal46_annelida_3_hirudinea;

public class hal47_filum_mollusca extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal47_filum_mollusca);
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
                    MediaPlayer mp = MediaPlayer.create(hal47_filum_mollusca.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal47_filum_mollusca.this, hal48_struktur_mollusca.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}
