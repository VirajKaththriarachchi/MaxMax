package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);

        Button button = (Button)findViewById(R.id.button11);
        Button button2 = (Button)findViewById(R.id.button12);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fever.this,Feverandshortness.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Fever.this, Feverandshortness.class);
                startActivity(intent1);
            }
        });
    }
}
