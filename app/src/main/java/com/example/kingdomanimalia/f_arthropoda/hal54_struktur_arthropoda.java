package com.example.kingdomanimalia.f_arthropoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.e_mollusca.hal47_filum_mollusca;
import com.example.kingdomanimalia.e_mollusca.hal48_struktur_mollusca;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal54_struktur_arthropoda extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal54_struktur_arthropoda);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal54_struktur_arthropoda.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal54_struktur_arthropoda.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
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
                    Intent i = new Intent(hal54_struktur_arthropoda.this, hal55_kelas_arthropoda.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}
