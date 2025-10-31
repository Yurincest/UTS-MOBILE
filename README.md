# UTS Mobile Programming - Info Pariwisata

**Mata Kuliah:** Pemrograman Bergerak  
**Tahun Akademik:** 2024/2025 - Semester 5  
**Nama:** SO OSVALDO  
**NIM:** 322310016  
**GitHub:** [https://github.com/Yurincest/UTSMOBILE](https://github.com/Yurincest/UTSMOBILE)

---

## Deskripsi Tugas (Sesuai PDF UTS)

> **Tugas:** Pengembangan Aplikasi Sederhana dengan Widget View dan Layout  
>  
> Pada UTS kali ini, Anda diminta untuk mengembangkan sebuah aplikasi mobile sederhana yang memanfaatkan **widget view dan layout** yang telah Anda pelajari di kelas. Aplikasi yang Anda kembangkan harus menampilkan informasi yang mudah diakses dan menggunakan berbagai komponen UI untuk menciptakan antarmuka yang interaktif dan ramah pengguna.  
>  
> **Tema Aplikasi:** Anda diminta untuk membuat **Aplikasi Info Pariwisata** yang menampilkan daftar tempat wisata di Indonesia, lengkap dengan informasi seperti deskripsi singkat, lokasi, dan gambar.

---

## Spesifikasi Tugas (100% Terpenuhi)

| No | Spesifikasi Tugas (PDF) | Implementasi |
|----|--------------------------|--------------|
| 1 | **Tampilan Utama (Main Activity):** Buatlah `LinearLayout` atau `ConstraintLayout` yang menampilkan header aplikasi dengan nama aplikasi **"Info Pariwisata"** | `activity_main.xml` → `LinearLayout` + `TextView` (28sp, bold, center) |
| | Gunakan `RecyclerView` untuk menampilkan daftar tempat wisata. Setiap item harus menampilkan **gambar kecil (thumbnail), nama tempat wisata, dan lokasi** | `item_wisata.xml` + `WisataAdapter` |
| 2 | **Tampilan Detail (Detail Activity):** Ketika salah satu item pada `RecyclerView` dipilih, buka halaman detail yang menampilkan informasi lebih lengkap tentang tempat wisata tersebut | `activity_detail.xml` + `DetailActivity` |
| | Gunakan `ScrollView` untuk menampilkan deskripsi tempat wisata yang panjang | `ScrollView` sebagai root |
| | Gunakan `ImageView` yang menampilkan **gambar besar** dari tempat wisata tersebut | `imgFull` (250dp, `centerCrop`) |
| | Tampilkan **nama tempat wisata dalam `TextView` dengan ukuran font besar dan lokasi dengan ukuran lebih kecil** | `tvNamaDetail` (28sp), `tvLokasiDetail` (16sp) |
| 3 | **Pengaturan Layout:** Pastikan antarmuka aplikasi ramah pengguna dengan menggunakan kombinasi `LinearLayout`, `RelativeLayout`, atau `ConstraintLayout` untuk mengatur posisi dan ukuran komponen UI | `LinearLayout` (main), `ConstraintLayout` (item & detail) |
| | Gunakan **Padding dan Margin** dengan baik untuk menciptakan tata letak yang bersih dan nyaman di berbagai ukuran layar | `16dp` padding, `12dp` margin |
| | Desain UI harus **responsif**, dapat beradaptasi dengan berbagai resolusi layar | `match_parent`, `wrap_content`, `0dp` + constraints |
| 4 | **Navigasi Antar Aktivitas:** Implementasikan navigasi antar aktivitas menggunakan `Intent`. Ketika pengguna memilih tempat wisata dari daftar, buka halaman detail dengan mengirimkan data terkait melalui `Intent` | `WisataAdapter` → `putExtra()` → `DetailActivity` |
| 5 | **Widget Tambahan:** Tambahkan `Button` untuk memberikan navigasi kembali ke halaman utama | `btnBack` + `finish()` + animasi transisi |

---

## Bonus

| Fitur | Deskripsi |
|------|---------|
| **SearchView Real-Time** | Filter daftar wisata saat mengetik (di layout utama) |
| **CardView + Elevation** | Item daftar lebih modern dengan bayangan & sudut membulat |
| **Toast Notifikasi** | Muncul saat masuk halaman detail |
| **Animasi Transisi** | `fade_in` / `fade_out` saat pindah activity |

---

## Cara Menjalankan Aplikasi

1. **Clone repository:**
   ```bash
   git clone https://github.com/Yurincest/UTSMOBILE.git

2. Buka project di Android Studio
3. Build & Run di emulator atau perangkat Android
4. APK siap pakai: Info Pariwisata.apk (terlampir di repo)
