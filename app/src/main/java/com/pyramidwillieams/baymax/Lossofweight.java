package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lossofweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lossofweight);

        Button button = (Button)findViewById(R.id.button21);
        Button button2 = (Button)findViewById(R.id.button22);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Lossofweight.this,Lossweight1.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Lossofweight.this, Lossweight1.class);
                startActivity(intent1);
            }
        });
    }
}
