package com.pedro.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1 , text2;
    Button tambah , kurang , kali , bagi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
        hasil = (TextView) findViewById(R.id.hasil);
        tambah = (Button)  findViewById(R.id.tambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(text1.getText().toString());
                int NilaiB = Integer.parseInt(text2.getText().toString());

                int jumlah = NilaiA + NilaiB;

                hasil.setText(String.valueOf(jumlah));


            }
        });




    }
}