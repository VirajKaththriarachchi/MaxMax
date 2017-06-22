package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Coughmorethan2weeks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coughmorethan2weeks);


        Button button = (Button)findViewById(R.id.productive);
        Button button2 = (Button)findViewById(R.id.no);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Coughmorethan2weeks.this,Selecttheother.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Coughmorethan2weeks.this, Selecttheother.class);
                startActivity(intent1);
            }
        });
    }


}
