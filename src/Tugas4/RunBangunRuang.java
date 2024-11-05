/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;

public class RunBangunRuang {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 4);
        System.out.println("Balok:");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());

        Kubus kubus = new Kubus(3);
        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.hitungVolume());  // Menggunakan method dari Balok
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());  // Menggunakan method override
    }
}
