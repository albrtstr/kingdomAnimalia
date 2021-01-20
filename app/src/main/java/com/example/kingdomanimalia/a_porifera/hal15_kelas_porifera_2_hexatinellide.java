package com.example.kingdomanimalia.a_porifera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;

public class hal15_kelas_porifera_2_hexatinellide extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal15_kelas_porifera_2_hexatinellide);
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
                if(x1 < x2){
                    Intent i = new Intent(hal15_kelas_porifera_2_hexatinellide.this,hal16_kelas_porifera_3_demospongiae.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 > x2){
                    Intent i = new Intent(hal15_kelas_porifera_2_hexatinellide.this, hal14_kelas_porifera_1_calcarea.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}