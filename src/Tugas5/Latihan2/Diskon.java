/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5.Latihan2;

public class Diskon {
    double total, diskon;

    public Diskon(double total) {
        this.total = total;
    }
    
    public double hitungDiskon() {
        if (total < 50000) {
            diskon = total * (0.05);
        } else {
            diskon = total * (0.2);
        }
        return diskon;
    }
}
