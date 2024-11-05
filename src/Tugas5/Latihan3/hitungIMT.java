/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5.Latihan3;

import java.util.Scanner;

public class hitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        IMT imt = new IMT(beratBadan, tinggiBadan);

        System.out.println("Nilai IMT Anda: " + imt.hitungIMT());

        System.out.println("Kriteria: " + imt.tentukanKriteria());
    }
}