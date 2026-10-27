
# UTS Perangkat Bergerak — Aplikasi Android

![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?logo=jetpackcompose&logoColor=white)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)

## Tentang Proyek

UTS Perangkat Bergerak merupakan proyek pengembangan aplikasi Android yang dibuat untuk memenuhi tugas Ujian Tengah Semester (UTS) pada mata kuliah Perangkat Bergerak.

Proyek ini menggunakan Kotlin dan Jetpack Compose untuk membangun antarmuka pengguna Android secara deklaratif. Implementasi yang terdapat dalam kode mencakup tampilan kartu profil dan kontak serta kartu ucapan ulang tahun.

## Fitur dan Implementasi

### 1. Kartu Profil dan Kontak

Tampilan kartu profil yang menyajikan informasi pengguna dalam tata letak sederhana dan terpusat.

Implementasi mencakup:
- Menampilkan nama dan bidang pekerjaan.
- Menampilkan informasi kontak berupa nomor telepon dan email.
- Menggunakan ikon untuk merepresentasikan informasi kontak.
- Mengatur tata letak menggunakan komponen Jetpack Compose.

### 2. Kartu Ucapan Ulang Tahun

Tampilan kartu ucapan ulang tahun dengan desain visual yang menggunakan gradasi warna dan kartu dengan sudut membulat.

Implementasi mencakup:
- Menampilkan judul ucapan ulang tahun.
- Menampilkan nama penerima dan pesan ucapan.
- Menampilkan nama pengirim.
- Menggunakan gradasi warna, bayangan, dan pengaturan tipografi untuk mempercantik tampilan.

## Teknologi yang Digunakan

- **Kotlin:** Bahasa pemrograman untuk pengembangan aplikasi Android.
- **Jetpack Compose:** Toolkit untuk membangun antarmuka pengguna secara deklaratif.
- **Material 3:** Komponen antarmuka dan sistem desain.
- **Android Studio:** Lingkungan pengembangan yang digunakan dalam proyek.
- **Gradle:** Sistem build dan pengelolaan dependensi proyek.

## Struktur Proyek

```text
UTS_Perangkat_Bergerak/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/utsperangkatbergerak/
│   │       │   ├── MainActivity.kt
│   │       │   ├── UlangTahun.kt
│   │       │   └── ui/theme/
│   │       ├── res/
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
│   └── libs.versions.toml
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Tujuan Pembelajaran

Proyek ini menjadi sarana untuk mempelajari dan menerapkan:
- Pengembangan aplikasi Android menggunakan Kotlin.
- Pembuatan antarmuka dengan Jetpack Compose.
- Penggunaan komponen tata letak dan ikon.
- Pengaturan warna, tipografi, dan elemen visual.
- Penyusunan struktur dasar proyek Android.

## Pengembang

Proyek akademik untuk mata kuliah Perangkat Bergerak.

