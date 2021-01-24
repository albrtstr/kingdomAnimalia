package com.example.kingdomanimalia.b_coelenterata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kingdomanimalia.R;
import com.example.kingdomanimalia.hal7_menu_jelajah_filum;

public class hal21_kelas_coelenterata extends AppCompatActivity {
    float x1,x2,y1,y2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal21_kelas_coelenterata);
        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal21_kelas_coelenterata.this, hal7_menu_jelajah_filum.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal21_kelas_coelenterata.this, hal17_filum_coelenterata.class));
                finish();
            }
        });


        ImageButton coelenterata_1 = findViewById(R.id.button1_porifera);
        ImageButton coelenterata_2 = findViewById(R.id.button2_porifera);
        ImageButton coelenterata_3 = findViewById(R.id.button3_porifera);

        coelenterata_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal21_kelas_coelenterata.this,hal22_kelas_coelenterata_1_hydrozoa.class));
            }
        });

        coelenterata_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal21_kelas_coelenterata.this,hal23_kelas_coelenterata_2_scypozoa.class));
            }
        });

        coelenterata_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(hal21_kelas_coelenterata.this,hal23_kelas_coelenterata_2_scypozoa.class));
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
                    Intent i = new Intent(hal21_kelas_coelenterata.this,hal20_coelenterata.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
        return false;
    }
}