package com.pyramidwillieams.baymax;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] deceases = {"Lungs", "Hart", "Brain"};

        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,deceases);
        ListView myListView  = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(

            new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position==0){
                        Intent intent = new Intent(MainActivity.this,CoughActivity.class);
                        startActivity(intent);
                    }
                    String deceases = String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(MainActivity.this, deceases, Toast.LENGTH_LONG).show();

                }
            }
        );
    }



}
