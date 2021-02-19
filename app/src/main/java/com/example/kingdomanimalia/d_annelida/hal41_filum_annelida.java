package com.example.kingdomanimalia.d_annelida;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.c_nemathelminthes.hal40_nemathelmintes_4_wuchereria;

public class hal41_filum_annelida extends AppCompatActivity {
    float x1,x2,y1,y2;

    @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_hal41_filum_annelida);
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
                    MediaPlayer mp = MediaPlayer.create(hal41_filum_annelida.this,R.raw.sipe);
                    mp.start();
                    Intent i = new Intent(hal41_filum_annelida.this, hal42_struktur_annelida.class);
                    startActivity(i);
                    finish();

                }
        }
        return false;
    }
}
