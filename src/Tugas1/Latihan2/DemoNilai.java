/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1.Latihan2;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.nim = "2310631170034";
        nilai.nama = "Mutiara Utami";
        nilai.absen = 85;
        nilai.tugas = 88;
        nilai.uts = 90;
        nilai.uas = 100;
        
        nilai.cetakNilai();
    }
}