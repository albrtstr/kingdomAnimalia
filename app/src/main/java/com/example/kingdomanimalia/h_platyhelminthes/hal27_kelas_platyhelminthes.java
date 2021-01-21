package com.example.kingdomanimalia.h_platyhelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;

public class hal27_kelas_platyhelminthes extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal27_kelas_platyhelminthes);
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
                    Intent i = new Intent(hal27_kelas_platyhelminthes.this, hal28_kelas_platyhelminthes_1_turbellaria.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    Intent i = new Intent(hal27_kelas_platyhelminthes.this,hal26_struktur_platyhelminthes.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}