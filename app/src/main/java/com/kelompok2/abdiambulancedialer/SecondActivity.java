package com.kelompok2.abdiambulancedialer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText nama = (EditText)findViewById(R.id.nama);
        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
        final TextView txtHasil = (TextView)findViewById(R.id.txtHasil);
        Button btnPindah = (Button)findViewById(R.id.btnPindah);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambil;
                ambil = nama.getText().toString();

                txtHasil.setText(ambil);
            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent pindahkemain = new Intent(pakageCon)
            }
        });
    }
}
