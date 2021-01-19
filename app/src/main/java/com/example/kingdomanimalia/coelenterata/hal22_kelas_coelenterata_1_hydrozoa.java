package com.example.kingdomanimalia.coelenterata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.kingdomanimalia.R;

public class hal22_kelas_coelenterata_1_hydrozoa extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal22_kelas_coelenterata_1_hydrozoa);
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
                    Intent i = new Intent(hal22_kelas_coelenterata_1_hydrozoa.this,hal23_kelas_coelenterata_2_scypozoa.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 > x2){
                    Intent i = new Intent(hal22_kelas_coelenterata_1_hydrozoa.this, hal21_kelas_coelenterata.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}