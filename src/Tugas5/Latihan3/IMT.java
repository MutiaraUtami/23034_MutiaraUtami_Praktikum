/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5.Latihan3;

public class IMT {
    public double beratBadan, tinggiBadan, imt;
    
    public IMT(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
    
    public double hitungIMT() {
        imt = beratBadan / (tinggiBadan * tinggiBadan);
        return imt;
    }
    
     public String tentukanKriteria() {
        if (imt < 18.5) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}
