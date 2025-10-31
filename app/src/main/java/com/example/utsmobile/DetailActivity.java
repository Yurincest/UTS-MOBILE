package com.example.utsmobile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgFull = findViewById(R.id.imgFull);
        TextView tvNamaDetail = findViewById(R.id.tvNamaDetail);
        TextView tvLokasiDetail = findViewById(R.id.tvLokasiDetail);
        TextView tvDeskripsi = findViewById(R.id.tvDeskripsi);
        Button btnBack = findViewById(R.id.btnBack);

        String nama = getIntent().getStringExtra("nama");
        String lokasi = getIntent().getStringExtra("lokasi");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        int fullImage = getIntent().getIntExtra("fullImage", 0);

        tvNamaDetail.setText(nama);
        tvLokasiDetail.setText(lokasi);
        tvDeskripsi.setText(deskripsi);
        imgFull.setImageResource(fullImage);

        Toast.makeText(this, "Memuat: " + nama, Toast.LENGTH_SHORT).show();

        btnBack.setOnClickListener(v -> {
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}