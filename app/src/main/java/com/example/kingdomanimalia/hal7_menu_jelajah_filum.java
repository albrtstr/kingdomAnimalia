package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hal7_menu_jelajah_filum extends AppCompatActivity {
    ImageButton porifera,coelenterata,nemathelminthes,annelida,mollusca,arthropoda,echinodermata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal7_menu_jelajah_filum);

        porifera = findViewById(R.id.button_porifera);
        coelenterata = findViewById(R.id.button_coelenterata);
        nemathelminthes = findViewById(R.id.button_nemathelminthes);
        annelida = findViewById(R.id.button_annelida);
        mollusca = findViewById(R.id.button_mollusca);
        arthropoda = findViewById(R.id.button_arthropoda);
        echinodermata = findViewById(R.id.button_echinodermata);

        porifera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal8_filum_porifera.class));
            }
        });


        coelenterata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal17_filum_coelenterata.class));

            }
        });

        nemathelminthes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal34_filum_nemathelminthes.class));

            }
        });

        annelida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal41_filum_annelida.class));

            }
        });

        mollusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal47_filum_mollusca.class));

            }
        });

        arthropoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this,hal53_filum_arthropoda.class));

            }
        });

        echinodermata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(hal4_menu_screen.this,.class));

            }
        });
    }
}