package com.example.kingdomanimalia.f_arthropoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal4_menu_screen;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal55_kelas_arthropoda extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal55_kelas_arthropoda);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this, hal4_menu_screen.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });

        ImageButton a = findViewById(R.id.b1);
        ImageButton b = findViewById(R.id.b2);
        ImageButton c = findViewById(R.id.b3);
        ImageButton d = findViewById(R.id.b4);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this,hal57_arthropoda_1_arachnida.class));
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this,hal59_arthropoda_2_myriapoda.class));
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this,hal61_arthropoda_3_crustacea.class));
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal55_kelas_arthropoda.this,hal65_arthropoda_4_insecta.class));
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
                    Intent i = new Intent(hal55_kelas_arthropoda.this, hal56_pembagian_arthropoda.class);
                    startActivity(i);
                    finish();

                }
                else if(x1 < x2){
                    Intent i = new Intent(hal55_kelas_arthropoda.this, hal54_struktur_arthropoda.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
