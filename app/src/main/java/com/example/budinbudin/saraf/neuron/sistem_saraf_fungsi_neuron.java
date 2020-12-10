package com.example.budinbudin.saraf.neuron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.saraf.impuls_saraf.impuls_saraf_gerak_refleks;
import com.example.budinbudin.saraf.impuls_saraf.impuls_saraf_gerak_sadar;
import com.example.budinbudin.saraf.sistem_saraf_menu;

public class sistem_saraf_fungsi_neuron extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_saraf_fungsi_neuron);


        Button back = findViewById(R.id.back_button);
        Button home = findViewById(R.id.home_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_fungsi_neuron.this, sistem_saraf_menu.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_fungsi_neuron.this, home_screen.class));
                finish();
            }
        });


    }
    @Override
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    Intent i = new Intent(sistem_saraf_fungsi_neuron.this, jenis_jenis_neuron.class);
                    startActivity(i);

                }
            else if(x1 > x2){
                Intent i = new Intent(sistem_saraf_fungsi_neuron.this, sistem_saraf_neuron.class);
                startActivity(i);
            }
                break;
        }
        return false;
    }
}
