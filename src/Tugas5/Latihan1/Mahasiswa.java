/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5.Latihan1;

public class Mahasiswa {
    public String npm, nama;
    public double nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    public String grade, keterangan;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.hitungNilaiAkhir();
        this.tentukanGradeDanKeterangan();
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
    
    public void tentukanGradeDanKeterangan() {
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        }
    }

    public void tampilkanData() {
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
