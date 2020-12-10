package com.example.budinbudin.saraf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.saraf.impuls_saraf.impuls_saraf_gerak_refleks;
import com.example.budinbudin.saraf.sistem_saraf_tepi.sistem_saraf_tepi;

public class sel_neuroglial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sel_neuroglial);


        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sel_neuroglial.this, sistem_saraf_menu.class));
                finish();
            }
        });

        Button home = findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sel_neuroglial.this, home_screen.class));
                finish();
            }
        });

    }
}
