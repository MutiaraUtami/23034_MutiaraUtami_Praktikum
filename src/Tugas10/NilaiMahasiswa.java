/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

public class NilaiMahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir; 
    
    public NilaiMahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, 
            double nilai1, double nilai2, double  nilai3, double nilai4, double nilai5) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public String getMataKuliah() {
        return MataKuliah;
    }
    
    public double getNilai1() {
        return nilai1 * 10/100;
    } 
    
    public double getNilai2() {
        return nilai2 * 15/100;
    } 
    
    public double getNilai3() {
        return nilai3 * 25/100;
    } 
    
    public double getNilai4() {
        return nilai4 * 15/100;
    } 
    
    public double getNilai5() {
        return nilai5 * 35/100;
    } 
    
    public double getNilaiAkhir() {
        return (0.1 * nilai1) + (0.15 * nilai2) + (0.25 * nilai3) 
                + (0.15 * nilai4) + (0.35 * nilai5);
    } 
}
