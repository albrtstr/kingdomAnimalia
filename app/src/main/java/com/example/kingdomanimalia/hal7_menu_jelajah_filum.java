package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kingdomanimalia.d_annelida.hal41_filum_annelida;
import com.example.kingdomanimalia.f_arthropoda.hal53_filum_arthropoda;
import com.example.kingdomanimalia.b_coelenterata.hal17_filum_coelenterata;
import com.example.kingdomanimalia.e_mollusca.hal47_filum_mollusca;
import com.example.kingdomanimalia.c_nemathelminthes.hal34_filum_nemathelminthes;
import com.example.kingdomanimalia.a_porifera.hal8_filum_porifera;
import com.example.kingdomanimalia.g_echinodermata.hal74_filum_enchinodermata;
import com.example.kingdomanimalia.h_platyhelminthes.hal25_filum_platyhelminthes;

public class hal7_menu_jelajah_filum extends AppCompatActivity {

    ImageButton porifera,coelenterata,nemathelminthes,annelida,mollusca,arthropoda,echinodermata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal7_menu_jelajah_filum);

        porifera = findViewById(R.id.button_porifera);
        coelenterata = findViewById(R.id.button_coelenterata);
        nemathelminthes = findViewById(R.id.button_nemathelmintes);
        annelida = findViewById(R.id.button_annelida);
        mollusca = findViewById(R.id.button_mollusca);
        arthropoda = findViewById(R.id.button_arthropoda);
        echinodermata = findViewById(R.id.button_echinodermata);
        ImageButton play = findViewById(R.id.button_platyhelmintes);

        ImageView home = findViewById(R.id.btnhome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal4_menu_screen.class));
                finish();
            }
        });
        porifera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal8_filum_porifera.class));
            }
        });


        coelenterata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal17_filum_coelenterata.class));

            }
        });

        nemathelminthes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal34_filum_nemathelminthes.class));

            }
        });

        annelida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal41_filum_annelida.class));

            }
        });

        mollusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal47_filum_mollusca.class));

            }
        });

        arthropoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal53_filum_arthropoda.class));

            }
        });

        echinodermata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal74_filum_enchinodermata.class));

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal7_menu_jelajah_filum.this, hal25_filum_platyhelminthes.class));
            }
        });
    }
}