\# UTS Mobile Programming - Info Pariwisata



\*\*Mata Kuliah:\*\* Pemrograman Bergerak  

\*\*Tahun Akademik:\*\* 2024/2025 - Semester 5  

\*\*Nama:\*\* \[SO OSVALDO]  

\*\*NIM:\*\* \[322310016]  

\*\*GitHub:\*\* https://github.com/Yurincest/UTSMOBILE



---



\## Deskripsi

Aplikasi menampilkan 4 tempat wisata Indonesia dengan:

\- Daftar utama (RecyclerView)

\- Detail lengkap (ScrollView + gambar besar)

\- Pencarian real-time

\- Navigasi antar halaman



---



\## Fitur (100% Sesuai PDF UTS)



| Spesifikasi | Implementasi |

|-------------|--------------|

| Header "Info Pariwisata" | `activity\_main.xml` → `TextView` |

| RecyclerView + thumbnail, nama, lokasi | `item\_wisata.xml` |

| Detail: ScrollView, ImageView besar | `activity\_detail.xml` |

| Nama besar + lokasi kecil | `tvNamaDetail` (28sp), `tvLokasiDetail` (16sp) |

| LinearLayout | `activity\_main.xml` |

| Intent + data | `WisataAdapter` |

| Button kembali | `btnBack` + `finish()` |



\*\*Bonus:\*\* SearchView, CardView, Toast, Animasi



---



\## Cara Menjalankan

1\. Buka di Android Studio

2\. Run di emulator/device

3\. APK: `Info Pariwisata.apk`



---



\## Screenshot

!\[Main](screenshots/main.png)  

!\[Detail](screenshots/detail.png)



---



