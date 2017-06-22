package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChestPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_pain);

        Button button = (Button)findViewById(R.id.button9);
        Button button2 = (Button)findViewById(R.id.button10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChestPain.this,CentralChestPain.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ChestPain.this, SideChestPain.class);
                startActivity(intent1);
            }
        });
    }
    }

