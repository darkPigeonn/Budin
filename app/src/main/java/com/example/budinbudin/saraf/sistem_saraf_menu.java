package com.example.budinbudin.saraf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.VideoYoutube;
import com.example.budinbudin.saraf.impuls_saraf.impuls_saraf_gerak_refleks;
import com.example.budinbudin.saraf.neuron.jenis_jenis_neuron;
import com.example.budinbudin.saraf.neuron.sistem_saraf_neuron;
import com.example.budinbudin.saraf.sistem_saraf_pusat.sistem_saraf_pusat;
import com.example.budinbudin.saraf.sistem_saraf_tepi.sistem_saraf_tepi;

public class sistem_saraf_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_saraf_menu);

        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        Button neuron = findViewById(R.id.button_saraf_neuron);
        Button neuroglial = findViewById(R.id.button_saraf_neuroglial);
        Button sinapsis = findViewById(R.id.button_saraf_sinapsis);
        Button impuls = findViewById(R.id.button_saraf_impuls);
        Button mekanismeimpuls = findViewById(R.id.button_saraf_mekanisme_impuls);
        Button sarafpusat = findViewById(R.id.button_saraf_pusat);
        Button saraftepi = findViewById(R.id.button_saraf_tepi);
        Button sarafgangguan = findViewById(R.id.button_saraf_gangguan);

        mekanismeimpuls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, VideoYoutube.class));
            }
        });

        neuron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, sistem_saraf_neuron.class));
            }
        });

        neuroglial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, sel_neuroglial.class));
            }
        });

        sinapsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, sinapsis.class));
            }
        });

        impuls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(sistem_saraf_menu.this, impuls_saraf_gerak_refleks.class));
            }
        });

        sarafpusat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, sistem_saraf_pusat.class));
            }
        });

        saraftepi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, sistem_saraf_tepi.class));
            }
        });

        sarafgangguan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_menu.this, gangguan_saraf.class));
            }
        });
    }
}
