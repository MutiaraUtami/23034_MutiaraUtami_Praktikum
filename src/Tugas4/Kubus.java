/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

class Kubus extends Balok {
    public Kubus(double sisi) {
        super(sisi, sisi, sisi);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * (panjang * panjang);
    }
}
