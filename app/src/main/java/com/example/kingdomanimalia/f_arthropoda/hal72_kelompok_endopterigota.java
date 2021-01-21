package com.example.kingdomanimalia.f_arthropoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;

public class hal72_kelompok_endopterigota extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal72_kelompok_endopterigota);
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
                    Intent i = new Intent(hal72_kelompok_endopterigota.this, hal73_kelompok_endopterigota2.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    Intent i = new Intent(hal72_kelompok_endopterigota.this, hal71_kelompok_eksopterigota2.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
