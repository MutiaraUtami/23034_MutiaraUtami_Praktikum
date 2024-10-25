/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas8;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Predefined data
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        // Input jumlah item yang akan dibeli
        System.out.println("==============================================================");
        System.out.println("TOKO SERBA ADA");
        System.out.println("(a001) Buku Rp. 3000");
        System.out.println("(a002) Pensil Rp. 4000");
        System.out.println("(a003) Pulpen Rp. 5000");
        System.out.println("==============================================================");
        System.out.print("Masukkan jumlah item yang ingin dibeli: ");
        int jumlahItem = input.nextInt();

        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayarPerItem = new int[jumlahItem];
        int totalBayar = 0;
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = input.next();

            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    totalBayarPerItem[i] = jumlahBeli[i] * hargaBarang[j];
                    totalBayar += totalBayarPerItem[i];
                    break;
                }
            }
        }

        // Output tabel hasil pembelian
        System.out.println("\n==============================================================");
        System.out.println("TOKO SERBA ADA");
        System.out.println("==============================================================");
        System.out.printf("%-3s %-10s %-12s %-7s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==============================================================");

        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    System.out.printf("%-3d %-10s %-12s %-7d %-12d %-12d\n", (i + 1), kodeBeli[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], totalBayarPerItem[i]);
                }
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("==============================================================");
    }
}


