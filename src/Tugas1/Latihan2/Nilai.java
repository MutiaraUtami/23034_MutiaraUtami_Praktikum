/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1.Latihan2;

public class Nilai{
    String nama, nim;
    float absen, tugas, uts, uas, total;
    
    float Nilai(){
        total = (10/100 * absen) + (20/100 * tugas) + (3/100 * uts) + (4/100 * uas);
        return total;
    }
    
    void cetakNilai(){
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen [10%] : " + absen);
        System.out.println("Nilai Tugas [20%] : " + tugas);
        System.out.println("Nilai UTS [30%]   : " + uts);
        System.out.println("Nilai UAS [40%]   : " + uas);
        System.out.println("Nilai Akhir       : " + Nilai());
    }
}

