package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;

public class hal81_enchinodermata_4_holo2 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal81_enchinodermata_4_holo2);
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
                    Intent i = new Intent(hal81_enchinodermata_4_holo2.this, hal82_enchinodermata_5_crino.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 > x2){
                    Intent i = new Intent(hal81_enchinodermata_4_holo2.this, hal80_enchinodermata_4_holo.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
