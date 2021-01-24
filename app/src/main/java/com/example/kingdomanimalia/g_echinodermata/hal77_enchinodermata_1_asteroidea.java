package com.example.kingdomanimalia.g_echinodermata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal77_enchinodermata_1_asteroidea extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal77_enchinodermata_1_asteroidea);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal77_enchinodermata_1_asteroidea.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal77_enchinodermata_1_asteroidea.this, hal76_kelas_enchinodermata.class));
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
//                    Intent i = new Intent(hal77_enchinodermata_1_asteroidea.this, hal78_enchinodermata_2_ophiuroidea.class);
//                    startActivity(i);
//                    finish();
//
//                }
//                else if(x1 < x2){
//                    Intent i = new Intent(hal77_enchinodermata_1_asteroidea.this, hal76_kelas_enchinodermata.class);
//                    startActivity(i);
//                    finish();
//                }
//                break;
//        }
//        return false;
//    }
}
