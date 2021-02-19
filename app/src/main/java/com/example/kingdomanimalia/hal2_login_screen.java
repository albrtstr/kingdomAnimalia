package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.kingdomanimalia.DbHelper.DbHelper;
import com.example.kingdomanimalia.h_platyhelminthes.hal33_daurfasciola_2;

public class hal2_login_screen extends AppCompatActivity {
    DbHelper dbHelper;
    EditText nama;
    String inputNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2_login_screen);

        dbHelper = new DbHelper(this,"",null,1);

        ImageButton next = findViewById(R.id.button_login);
        //pick nama dati edit text
        nama = findViewById(R.id.editTextTextPersonName);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(hal2_login_screen.this,R.raw.klik);
                mp.start();
                inputNama = nama.getText().toString();
                //input ke db sqlite
                dbHelper.inserData(inputNama);

                //intent
                startActivity(new Intent(hal2_login_screen.this,hal4_menu_screen.class));
                finish();
            }
        });

    }
}