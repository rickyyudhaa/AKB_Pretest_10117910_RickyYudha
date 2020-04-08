package com.example.pretestakbricky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kodekeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodekeluarga);

        Button btnmasuk = (Button) findViewById(R.id.btnMasuk);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kodekeluarga.this, formBiodata.class);
                startActivity(intent);
            }
        });

    }}
