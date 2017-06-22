package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Selecttheother extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecttheother);

        Button button = (Button)findViewById(R.id.button17);
        Button button2 = (Button)findViewById(R.id.button18);
        Button button3 = (Button)findViewById(R.id.button19);
        Button button4 = (Button)findViewById(R.id.button20);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Selecttheother .this,Lossofweight.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Selecttheother .this,Lossofappetite.class);
                startActivity(intent1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Selecttheother .this,Shortnessbreath.class);
                startActivity(intent2);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Selecttheother.this,Wheezing.class);
                startActivity(intent3);
            }
        });
    }
}
