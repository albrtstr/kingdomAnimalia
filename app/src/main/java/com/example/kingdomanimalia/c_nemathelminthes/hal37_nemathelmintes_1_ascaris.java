package com.example.kingdomanimalia.c_nemathelminthes;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;

public class hal37_nemathelmintes_1_ascaris extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal37_nemahelminthes_1_ascaris);
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
                    Intent i = new Intent(hal37_nemathelmintes_1_ascaris.this, hal38_nemathelmintes_2_ancylostoma.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 > x2){
                    Intent i = new Intent(hal37_nemathelmintes_1_ascaris.this, hal36_contoh_nemathelminthes.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
