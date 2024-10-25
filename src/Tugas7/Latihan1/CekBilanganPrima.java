/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7.Latihan1;

public class CekBilanganPrima {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            boolean isPrima = true;

            if (i <= 1) {
                isPrima = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }
            }

            if (isPrima) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " adalah bukan bilangan prima");
            }
        }
    }
}
