package com.example.intense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activitysecond);
        Button Guzik = findViewById(R.id.guzik);
        TextView tekst = findViewById(R.id.tekst);
        tekst.setText(getIntent().getStringExtra("message"));
        Guzik.setOnClickListener(v->{

            finish();
        });
    };
}
