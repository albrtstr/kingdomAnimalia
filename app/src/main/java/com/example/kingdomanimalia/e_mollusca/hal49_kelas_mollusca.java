package com.example.kingdomanimalia.e_mollusca;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;

public class hal49_kelas_mollusca extends AppCompatActivity {

    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal49_kelas_mollusca);
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
                    Intent i = new Intent(hal49_kelas_mollusca.this, hal50_mollusca_1_gastropoda.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 > x2){
                    Intent i = new Intent(hal49_kelas_mollusca.this, hal48_struktur_mollusca.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
