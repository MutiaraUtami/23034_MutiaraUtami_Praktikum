/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5.Latihan2;

import java.util.Scanner;
public class CariDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pembelian = Rp. ");
        double total = input.nextDouble();
        
        Diskon disc = new Diskon(total);

        System.out.println("Besarnya potongan = Rp. " + disc.hitungDiskon());
        System.out.println("Jumlah yang harus dibayarkan = Rp. " + (total - disc.hitungDiskon()));
    }
}
