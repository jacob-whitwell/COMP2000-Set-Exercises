package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class ViewItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        Button navigateToButton = findViewById(R.id.viewNavigateTo);

        navigateToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo();
            }
        });
    }

    public void navigateTo()
    {
        Intent intent = new Intent(this, MapActivity.class);

        startActivity(intent);
    }
}