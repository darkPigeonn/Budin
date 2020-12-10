package com.example.budinbudin.sistem_indra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.inti_budin;
import com.example.budinbudin.saraf.neuron.jenis_jenis_neuron;
import com.example.budinbudin.saraf.sistem_saraf_menu;
import com.example.budinbudin.saraf.sistem_saraf_tepi.sistem_saraf_tepi;
import com.example.budinbudin.sistem_indra.hidung.fungsi_hidung;
import com.example.budinbudin.sistem_indra.lidah.area_lidah;
import com.example.budinbudin.sistem_indra.mata.cara_kerja_mata;
import com.example.budinbudin.sistem_indra.telinga.mekanisme_telinga;

public class sistem_indra_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_indra_menu);

        Button mata = findViewById(R.id.button_indra_mata);
        Button hidung = findViewById(R.id.button_indra_hidung);
        Button lidah = findViewById(R.id.button_lidah);
        Button kulit = findViewById(R.id.button_kulit);
        Button telinga = findViewById(R.id.button_telinga);

        Button home = findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, home_screen.class));
                finish();
            }
        });

        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, inti_budin.class));
                finish();
            }
        });

        mata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, cara_kerja_mata.class));
            }
        });

        hidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, fungsi_hidung.class));
            }
        });

        lidah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, area_lidah.class));
            }
        });

        kulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, fungsi_hidung.class));
            }
        });

        telinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_indra_menu.this, mekanisme_telinga.class));
            }
        });
    }
}
