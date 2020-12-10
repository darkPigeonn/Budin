package com.example.budinbudin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.dasar.*;

public class home_screen extends AppCompatActivity {

    private Button button_kataPengantar;
    private Button button_indikator;
    private Button button_kompetensiDasar;
    private Button button_intiBudin;
    private Button button_kompetensiInti;
    private Button button_lks;
    private Button button_petaKonsep;
    private Button button_quizziz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        button_kataPengantar = findViewById(R.id.button_kata_pengantar);
        button_indikator = findViewById(R.id.button_indikator);
        button_kompetensiDasar = findViewById(R.id.button_kompetensi_dasar);
        button_intiBudin = findViewById(R.id.button_inti_budin);
        button_kompetensiInti = findViewById(R.id.button_kompetensi_inti);
        button_lks = findViewById(R.id.button_lks);
        button_petaKonsep = findViewById(R.id.button_peta_konsep);
        button_quizziz = findViewById(R.id.button_quizziz);

        button_kataPengantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, MainActivity.class));
            }
        });

        button_indikator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, indikator_keberhasilan.class));
            }
        });

        button_kompetensiDasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, kompetensi_dasar.class));
            }
        });

        button_intiBudin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, inti_budin.class));
            }
        });

        button_kompetensiInti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, kompetensi_inti.class));
            }
        });

//        button_lks.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(home_screen.this, inti_budin.class));
//            }
//        });

        button_petaKonsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, peta_konsep.class));
            }
        });

        button_quizziz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.proprofsgames.com/ugc/crossword/materi-sistem-regulasi/"));
                startActivity(implicit);

            }
        });

    }
}
