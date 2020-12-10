package com.example.budinbudin.sistem_indra.kulit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.saraf.sistem_saraf_tepi.sistem_saraf_tepi;
import com.example.budinbudin.sistem_indra.hidung.fungsi_hidung;
import com.example.budinbudin.sistem_indra.sistem_indra_menu;

public class fungsi_kulit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fungsi_kulit);

        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fungsi_kulit.this, sistem_indra_menu.class));
                finish();
            }
        });

        Button home = findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fungsi_kulit.this, home_screen.class));
                finish();
            }
        });
    }
}
