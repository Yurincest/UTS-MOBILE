package com.example.utsmobile;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.utsmobile.adapter.WisataAdapter;
import com.example.utsmobile.model.Wisata;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private WisataAdapter adapter;
    private List<Wisata> wisataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        SearchView searchView = findViewById(R.id.searchView); // DARI LAYOUT

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initData();
        adapter = new WisataAdapter(this, wisataList);
        recyclerView.setAdapter(adapter);

        // SEARCHVIEW DARI LAYOUT (REAL-TIME FILTER)
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.filter(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.filter(newText);
                return true;
            }
        });
    }

    private void initData() {
        wisataList = new ArrayList<>();
        wisataList.add(new Wisata(
                "Candi Borobudur",
                "Magelang, Jawa Tengah",
                "Candi Buddha terbesar di dunia, dibangun pada abad ke-9. Merupakan situs warisan dunia UNESCO dengan lebih dari 2.600 relief dan 500 patung Buddha.",
                R.drawable.borobudur_thumb,
                R.drawable.borobudur_full
        ));
        wisataList.add(new Wisata(
                "Gunung Bromo",
                "Jawa Timur",
                "Gunung berapi aktif dengan kawah luas dan pemandangan matahari terbit yang ikonik. Terletak di Taman Nasional Bromo Tengger Semeru.",
                R.drawable.bromo_thumb,
                R.drawable.bromo_full
        ));
        wisataList.add(new Wisata(
                "Raja Ampat",
                "Papua Barat",
                "Kepulauan dengan keanekaragaman hayati laut tertinggi di dunia. Surga bagi penyelam dengan terumbu karang dan spesies ikan yang luar biasa.",
                R.drawable.rajaampat_thumb,
                R.drawable.rajaampat_full
        ));
        wisataList.add(new Wisata(
                "Air Terjun Tumpak Sewu",
                "Lumajang, Jawa Timur",
                "Dijuluki 'Niagara-nya Indonesia', air terjun bertingkat dengan aliran air yang menyerupai tirai putih. Terletak di lereng Gunung Semeru.",
                R.drawable.tumpaksewu_thumb,
                R.drawable.tumpaksewu_full
        ));
    }
}