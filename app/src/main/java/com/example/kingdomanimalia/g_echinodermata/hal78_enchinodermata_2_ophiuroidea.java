package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;

public class hal78_enchinodermata_2_ophiuroidea extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal78_enchinodermata_2_ophiuroidea);
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
                    Intent i = new Intent(hal78_enchinodermata_2_ophiuroidea.this, hal79_enchinodermata_3_enchinoidea.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    Intent i = new Intent(hal78_enchinodermata_2_ophiuroidea.this, hal77_enchinodermata_1_asteroidea.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
