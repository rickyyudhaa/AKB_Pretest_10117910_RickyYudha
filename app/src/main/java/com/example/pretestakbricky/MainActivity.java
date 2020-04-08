package com.example.pretestakbricky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/*
tanggal pengerjaan : 8/4/20
Deskripsi pekerjaan : ?
NIM : 10117910
Nama : Ricky Yudha P K
Kelas : IF6K
*
* */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonMulai);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kodekeluarga.class);
                startActivity(intent);
            }
        });
    }
}
