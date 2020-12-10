package com.example.budinbudin.napza.jenis_napza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;

public class jenis_napza_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_napza_menu);

        Button stimulan = findViewById(R.id.button_jenis_napza_stimulan);
        Button depresan = findViewById(R.id.button_jenis_napza_depresan);
        Button halusinogen = findViewById(R.id.button_jenis_napza_halusi);
        Button back = findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        stimulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jenis_napza_menu.this,napza_gol_stimulan.class));
            }
        });

        depresan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jenis_napza_menu.this, napza_gol_depresan.class));
            }
        });

        halusinogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jenis_napza_menu.this, napza_gol_halusinogen.class));
            }
        });
    }
}
