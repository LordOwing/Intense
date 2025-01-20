package com.example.intense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
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
        EditText nameEditText = findViewById(R.id.name);
        EditText mailEdit = findViewById(R.id.mail);
        EditText numbEdit = findViewById(R.id.number);
        tekst.setText(getIntent().getStringExtra("message"));
        Guzik.setOnClickListener(v->{
            String name = nameEditText.getText().toString();
            String mail = mailEdit.getText().toString();
            String numb = numbEdit.getText().toString();
            Bundle extras = new Bundle();
            extras.putString("name", name);
            extras.putString("mail", mail);
            extras.putString("numb", numb);
            Intent backIntent = new Intent(SecondActivity.this, MainActivity.class);
            backIntent.putExtras(extras);
            startActivity(backIntent);
        });
    };
}
