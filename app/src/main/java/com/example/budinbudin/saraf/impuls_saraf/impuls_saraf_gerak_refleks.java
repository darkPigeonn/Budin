package com.example.budinbudin.saraf.impuls_saraf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.saraf.sistem_saraf_menu;

public class impuls_saraf_gerak_refleks extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impuls_saraf_gerak_refleks);

        Button back = findViewById(R.id.back_button);
        Button home = findViewById(R.id.home_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(impuls_saraf_gerak_refleks.this, sistem_saraf_menu.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(impuls_saraf_gerak_refleks.this, home_screen.class));
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
                Intent i = new Intent(impuls_saraf_gerak_refleks.this, impuls_saraf_gerak_sadar.class);
                startActivity(i);
                finish();
               }
//            else if(x1 > x2){
//                Intent i = new Intent(MainActivity.this, SwipeRight.class);
//                startActivity(i);
//            }
            break;
        }
        return false;
    }
}
