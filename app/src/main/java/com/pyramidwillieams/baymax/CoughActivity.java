package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class CoughActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cough);
       Button button = (Button)findViewById(R.id.button);
       Button button2 = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CoughActivity.this,Lessthan2.class);
                startActivity(intent);

            }
        } );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CoughActivity.this, Coughmorethan2weeks.class);
                startActivity(intent1);
            }
        });
    }

  /*  public void onClickOne (View view){
        if(view.getId() == R.id.button){
            Intent i = new Intent(this,Lessthan2.class);
            startActivity(i);
        }else if(view.getId() == R.id.button2){
            Intent i = new Intent(this,Coughmorethan2weeks.class);
            startActivity(i);
        }
    }*/
}
