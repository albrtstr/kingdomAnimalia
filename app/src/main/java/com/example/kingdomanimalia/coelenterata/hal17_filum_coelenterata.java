package com.example.kingdomanimalia.coelenterata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.porifera.hal10_porifera;
import com.example.kingdomanimalia.porifera.hal8_filum_porifera;
import com.example.kingdomanimalia.porifera.hal9_struktur_porifera;

public class hal17_filum_coelenterata extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal17_filum_coelenterata);
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
                    Intent i = new Intent(hal17_filum_coelenterata.this,hal18_struktur_coelenterata.class);
                    startActivity(i);
                    finish();

                }
               
        }
        return false;
    }
}