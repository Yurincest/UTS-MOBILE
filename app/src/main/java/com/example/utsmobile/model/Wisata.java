// app/src/main/java/com/example/utsmobile/model/Wisata.java
package com.example.utsmobile.model;

public class Wisata {
    private String nama;
    private String lokasi;
    private String deskripsi;
    private int thumbnailResId;
    private int fullImageResId;

    public Wisata(String nama, String lokasi, String deskripsi, int thumbnailResId, int fullImageResId) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.thumbnailResId = thumbnailResId;
        this.fullImageResId = fullImageResId;
    }

    // Getters
    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }
    public String getDeskripsi() { return deskripsi; }
    public int getThumbnailResId() { return thumbnailResId; }
    public int getFullImageResId() { return fullImageResId; }
}