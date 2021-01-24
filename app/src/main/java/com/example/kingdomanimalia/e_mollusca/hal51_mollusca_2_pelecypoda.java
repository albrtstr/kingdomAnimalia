package com.example.kingdomanimalia.e_mollusca;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal51_mollusca_2_pelecypoda extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal51_mollusca_2_pelecypoda);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal51_mollusca_2_pelecypoda.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal51_mollusca_2_pelecypoda.this, hal47_filum_mollusca.class));
                finish();
            }
        });
    }

//    public boolean onTouchEvent(MotionEvent touchEvent) {
//
//        switch(touchEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                x1 = touchEvent.getX();
//                y1 = touchEvent.getY();
//                break;
//            case MotionEvent.ACTION_UP:
//                x2 = touchEvent.getX();
//                y2 = touchEvent.getY();
//                if(x1 > x2){
//                    Intent i = new Intent(hal51_mollusca_2_pelecypoda.this, hal52_mollusca_3_cephalopoda.class);
//                    startActivity(i);
//                    finish();
//
//                }
//                else if(x1 < x2){
//                    Intent i = new Intent(hal51_mollusca_2_pelecypoda.this, hal50_mollusca_1_gastropoda.class);
//                    startActivity(i);
//                    finish();
//                }
//                break;
//        }
//        return false;
//    }
}

