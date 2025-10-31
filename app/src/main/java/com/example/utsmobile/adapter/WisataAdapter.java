package com.example.utsmobile.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.utsmobile.DetailActivity;
import com.example.utsmobile.R;
import com.example.utsmobile.model.Wisata;
import java.util.ArrayList;
import java.util.List;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {
    private Context context;
    private List<Wisata> wisataList;
    private List<Wisata> wisataListFull; // DATA ASLI

    public WisataAdapter(Context context, List<Wisata> wisataList) {
        this.context = context;
        this.wisataList = wisataList;
        this.wisataListFull = new ArrayList<>(wisataList); // COPY DATA ASLI
    }

    @NonNull
    @Override
    public WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_wisata, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataViewHolder holder, int position) {
        Wisata wisata = wisataList.get(position);
        holder.tvNama.setText(wisata.getNama());
        holder.tvLokasi.setText(wisata.getLokasi());
        holder.imgThumbnail.setImageResource(wisata.getThumbnailResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("nama", wisata.getNama());
            intent.putExtra("lokasi", wisata.getLokasi());
            intent.putExtra("deskripsi", wisata.getDeskripsi());
            intent.putExtra("fullImage", wisata.getFullImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return wisataList.size();
    }

    // FIX: FILTER YANG BENAR!
    public void filter(String query) {
        wisataList.clear(); // KOSONGKAN DULU
        if (query == null || query.trim().isEmpty()) {
            wisataList.addAll(wisataListFull); // KEMBALIKAN SEMUA
        } else {
            String lowerQuery = query.toLowerCase().trim();
            for (Wisata wisata : wisataListFull) {
                if (wisata.getNama().toLowerCase().contains(lowerQuery)) {
                    wisataList.add(wisata);
                }
            }
        }
        notifyDataSetChanged(); // PAKSA RECYCLERVIEW REFRESH!
    }

    static class WisataViewHolder extends RecyclerView.ViewHolder {
        ImageView imgThumbnail;
        TextView tvNama, tvLokasi;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvLokasi = itemView.findViewById(R.id.tvLokasi);
        }
    }
}