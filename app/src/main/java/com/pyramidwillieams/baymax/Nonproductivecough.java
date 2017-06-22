package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Nonproductivecough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonproductivecough);

        Button button = (Button)findViewById(R.id.button6);
        Button button2 = (Button)findViewById(R.id.button7);
        Button button3 = (Button)findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Nonproductivecough.this,ChestPain.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Nonproductivecough.this, Fever.class);
                startActivity(intent1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Nonproductivecough.this,Shortnessofbreath.class);
                startActivity(intent2);
            }
        });
    }
}
