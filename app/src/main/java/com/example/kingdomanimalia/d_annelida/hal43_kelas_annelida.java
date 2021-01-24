package com.example.kingdomanimalia.d_annelida;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.c_nemathelminthes.hal34_filum_nemathelminthes;
import com.example.kingdomanimalia.c_nemathelminthes.hal36_contoh_nemathelminthes;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal43_kelas_annelida extends AppCompatActivity {
    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal43_kelas_annelida);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal43_kelas_annelida.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal43_kelas_annelida.this, hal41_filum_annelida.class));
                finish();
            }
        });

        ImageButton a = findViewById(R.id.button_polycaheta);
        ImageButton b = findViewById(R.id.button_oligochaeta);
        ImageButton c = findViewById(R.id.button_hirudinea);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal43_kelas_annelida.this,hal44_annelida_1_polychaeta.class));
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal43_kelas_annelida.this,hal45_annelida_2_oligochaeta.class));
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal43_kelas_annelida.this,hal46_annelida_3_hirudinea.class));
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
         if(x1 < x2){
                    Intent i = new Intent(hal43_kelas_annelida.this, hal42_struktur_annelida.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}
