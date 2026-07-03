# Tugas 13: Android UI Design — Material Design Implementation

## Identitas

| **Nama** | Jawed |
|-----------|-------|
| **NIM**  | 452024611047 |
| **Mata Kuliah** | Pemrograman Mobile |

---

## Bukti Visual

### 1. Light Mode vs Dark Mode

| Light Mode | Dark Mode |
|------------|-----------|
| *(screenshot light mode)* | *(screenshot dark mode)* |

### 2. Localization (Bahasa Indonesia)

| Bahasa Indonesia | English (Default) |
|------------------|-------------------|
| *(screenshot BI)* | *(screenshot EN)* |

### 3. Komponen Material Design

*GIF atau screenshot yang menunjukkan:*
- **TextInputLayout** (OutlinedBox) dengan TextInputEditText
- **MaterialCardView** (profil dan form)
- **FloatingActionButton** (FAB) dengan Snackbar
- **BottomNavigationView** dengan 3 menu
- **Snackbar** (dipanggil via FAB, submit form, dan navigasi)

---

## Komponen Material Design yang Diintegrasikan

| # | Komponen | Deskripsi |
|---|----------|-----------|
| 1 | **TextInputLayout** + **TextInputEditText** | Tiga field input (Nama, Email, Pesan) dengan style `OutlinedBox` dan `endIconMode="clear_text"` |
| 2 | **MaterialCardView** | Dua kartu: profil pengguna dan form kontak, dengan elevasi dan corner radius kustom |
| 3 | **FloatingActionButton (FAB)** | Tombol bantuan di kanan bawah yang menampilkan Snackbar saat ditekan |
| 4 | **BottomNavigationView** | Tiga menu navigasi: Beranda, Profil, Pengaturan — menampilkan Snackbar pada tiap klik |
| 5 | **Snackbar** | Feedback interaktif untuk submit form, navigasi bottom bar, dan FAB |

---

## Fitur Tambahan

- **Dark Theme**: `res/values-night/themes.xml`
- **Typography System**: Custom `TextAppearance.Tugas13.*` berbasis `TextAppearance.MaterialComponents`, semua ukuran dalam satuan `sp`
- **Localization**: String lengkap dalam Bahasa Indonesia (`values-b+id`) dan English (`values`)
- **RTL Support**: Layout menggunakan atribut `start`/`end` menggantikan `left`/`right`
- **ViewBinding**: Digunakan untuk binding view yang aman

---

## Urutan Prioritas (Precedence) Desain

Dalam Android Styling System, jika sebuah komponen View memiliki pengaturan warna atau ukuran yang berbeda secara bersamaan di **Theme**, **Style**, dan **View Attributes**, urutan prioritas eksekusinya adalah sebagai berikut:

> **View Attributes > Style > Theme (default)**

Artinya:
1. **View Attributes** (atribut yang ditulis langsung di elemen XML, seperti `android:textColor="#FF0000"`) memiliki prioritas **tertinggi** karena spesifik terhadap satu elemen View.
2. **Style** (didefinisikan di `<style>` dan direferensikan via `style="@style/...`) memiliki prioritas **kedua**. Style akan mengisi atribut yang tidak di-set langsung di View Attributes.
3. **Theme** (didefinisikan di `themes.xml` dan diterapkan ke Activity/Aplikasi) memiliki prioritas **terendah**. Theme menyediakan nilai default untuk seluruh aplikasi, dan akan di-override oleh Style maupun View Attributes yang lebih spesifik.

Dengan kata lain, atribut yang lebih **spesifik** (dekat ke elemen View) akan meng-override atribut yang lebih **umum** (Theme). Inilah yang disebut prinsip **most-specific-wins** dalam Android styling hierarchy.

---

## Build & Run

1. Clone repository ini
2. Buka di **Android Studio** (Latest Stable)
3. Sync Gradle
4. Run pada emulator atau perangkat fisik

**Minimum SDK**: 24 (Android 7.0)  
**Target SDK**: 35 (Android 15)  
**Gradle**: 8.11.1  
**AGP**: 8.7.3  
**Kotlin**: 2.1.0
