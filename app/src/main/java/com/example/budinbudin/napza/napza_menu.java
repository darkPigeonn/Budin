package com.example.budinbudin.napza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.napza.jenis_napza.jenis_napza_menu;

public class napza_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_napza_menu);

        Button pengertian = findViewById(R.id.button_napza_pengertian);
        Button dampak = findViewById(R.id.button_napza_dampak_napza);
        Button jenis = findViewById(R.id.button_napza_jenis_napza);
        Button home = findViewById(R.id.home_button);

        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        pengertian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(napza_menu.this,napza_pengertian.class));
            }
        });
        dampak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(napza_menu.this,napza_menu.class));
            }
        });

        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(napza_menu.this, jenis_napza_menu.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(napza_menu.this, home_screen.class));
            }
        });
    }
}
