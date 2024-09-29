/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5.Latihan1;

import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("NPM           :");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa :");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran :");
        double nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas :");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS :");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS :");
        double nilaiUAS = input.nextDouble();
        
        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("\n====== DATA MAHASISWA ======");
        mahasiswa.tampilkanData();
    }
    
}