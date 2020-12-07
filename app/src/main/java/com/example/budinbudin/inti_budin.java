package com.example.budinbudin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.napza.napza_menu;
import com.example.budinbudin.saraf.sistem_saraf_menu;
import com.example.budinbudin.sistem_indra.sistem_indra_menu;

public class inti_budin extends AppCompatActivity {

    private Button button_back;
    private Button button_home;
    private Button button_sistemSaraf;
    private Button button_sistemEndokrin;
    private Button button_sistemIndra;
    private Button button_pengaruhNapza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inti_budin);

        button_back = findViewById(R.id.back_button);
        button_home = findViewById(R.id.home_button);
        button_sistemSaraf = findViewById(R.id.button_sistem_saraf);
        button_sistemEndokrin = findViewById(R.id.button_sistem_endokrin);
        button_sistemIndra = findViewById(R.id.button_sistem_indra);
        button_pengaruhNapza = findViewById(R.id.button_pengaruh_napza);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, home_screen.class));
            }
        });

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, home_screen.class));
            }
        });

        button_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, sistem_saraf_menu.class));
            }
        });

        button_sistemEndokrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, sistem_endokrin.class));
            }
        });

        button_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, sistem_indra_menu.class));
            }
        });

        button_pengaruhNapza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inti_budin.this, napza_menu.class));
            }
        });
    }
}
