package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.kingdomanimalia.a_porifera.hal10_porifera;
import com.example.kingdomanimalia.a_porifera.hal8_filum_porifera;
import com.example.kingdomanimalia.a_porifera.hal9_struktur_porifera;

public class hal6_menu_kdi_2 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal6_menu_kdi_2);

        ImageView home = findViewById(R.id.btnhome);
        ImageView back = findViewById(R.id.btnback);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal6_menu_kdi_2.this, hal4_menu_screen.class));
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal6_menu_kdi_2.this, hal5_menu_kdi.class));
               
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
                    Intent i = new Intent(hal6_menu_kdi_2.this, hal5_menu_kdi.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}