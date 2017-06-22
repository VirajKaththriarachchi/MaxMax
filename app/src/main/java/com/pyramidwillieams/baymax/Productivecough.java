package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.pyramidwillieams.baymax.R.id.button3;

public class Productivecough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivecough);

        Button button = (Button)findViewById(button3);
        Button button2 = (Button)findViewById(R.id.button4);
        Button button3 = (Button)findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productivecough.this,ChestPain.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Productivecough.this, Fever.class);
                startActivity(intent1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Productivecough.this,Shortnessofbreath.class);
                startActivity(intent2);
            }
        });
    }




    }

