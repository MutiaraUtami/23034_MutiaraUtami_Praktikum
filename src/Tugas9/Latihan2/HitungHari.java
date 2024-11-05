/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9.Latihan2;

public class HitungHari {

    public int hitung(int tahun, String bulan) {
        int jumlahHari;

        switch (bulan) {
            case "Februari" -> {
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
            }
            case "April", "Juni", "September", "November" -> jumlahHari = 30;
            default -> jumlahHari = 31;
        }
        
        return jumlahHari;
    }
}

