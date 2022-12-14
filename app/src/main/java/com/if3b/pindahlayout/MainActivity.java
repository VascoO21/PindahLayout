package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPindah = findViewById(R.id.btn_pindah);
        etNama = findViewById(R.id.et_nama);
        getActionBar().setTitle("Raijin");
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(pindah);
            }
        });
    }
}