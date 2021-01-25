package com.example.kingdomanimalia.h_platyhelminthes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.a_porifera.hal14_kelas_porifera_1_calcarea;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal28_kelas_platyhelminthes_1_turbellaria extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal28_kelas_platyhelminthes_1_turbellaria);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal28_kelas_platyhelminthes_1_turbellaria.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal28_kelas_platyhelminthes_1_turbellaria.this,hal27_kelas_platyhelminthes.class));
                finish();
            }
        });


        ImageView menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal28_kelas_platyhelminthes_1_turbellaria.this, hal7_menu_jelajah_filum.class));
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
//                    Intent i = new Intent(hal28_kelas_platyhelminthes_1_turbellaria.this,hal29_kelas_platyhelminthes_2_trematoda.class);
//                    startActivity(i);
//                    finish();
//
//                }
//                else if(x1 < x2){
//                    Intent i = new Intent(hal28_kelas_platyhelminthes_1_turbellaria.this,hal27_kelas_platyhelminthes.class);
//                    startActivity(i);
//                    finish();
//                }
//                break;
//        }
//        return false;
//    }
}