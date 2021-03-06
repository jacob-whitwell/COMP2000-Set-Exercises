package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CachesFoundListActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "com.example.comp2000_geocache.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caches_found_list);

        Button cacheFound1 = findViewById(R.id.cacheFoundList1);
        Button cacheFound2 = findViewById(R.id.cacheFoundList2);

        cacheFound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacheDetail("Cache 1");
            }
        });

        cacheFound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacheDetail("Cache 2");
            }
        });


    }

    public void cacheDetail(String name)
    {
        Intent intent = new Intent(this, CachesFoundActivity.class);
        intent.putExtra(EXTRA_MESSAGE, name);
        startActivity(intent);
    }



}