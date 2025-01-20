package com.example.intense;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button Guzik = findViewById(R.id.guzik);
        Guzik.setOnClickListener(v->{
            Intent newIntent = new Intent(MainActivity.this, SecondActivity.class);

            newIntent.putExtra("message", "Witaj na drugim ekranie");
            startActivity(newIntent);
        });
        };
    }
