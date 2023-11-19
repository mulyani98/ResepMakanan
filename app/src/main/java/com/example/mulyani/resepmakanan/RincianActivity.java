package com.example.mulyani.resepmakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RincianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian);

        int imgGambar = getIntent().getIntExtra("imgGambar",0);
        String namaJudul = getIntent().getStringExtra("namaJudul");
        String bahanResep = getIntent().getStringExtra("bahanResep");
        String caramembuat = getIntent().getStringExtra("caramembuat");

        getSupportActionBar().setTitle(namaJudul);

        TextView judul = (TextView)findViewById(R.id.rincianjudul);
        judul.setText(namaJudul.toString());
        ImageView gambar = (ImageView)findViewById(R.id.rinciangmbr);
        gambar.setImageResource(imgGambar);
        TextView  bahan = (TextView)findViewById(R.id.bahan);
        bahan.setText(bahanResep.toString());
        TextView cara = (TextView)findViewById(R.id.caramembuat);
        cara.setText(caramembuat.toString());;

    }
}
