/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7.Latihan1;

public class LaguAnakAyam {
    public static void main(String[] args) {
        for (int ayam = 7; ayam > 0; ayam -= 2) {
            System.out.println("Tek kotek, kotek kotek\n" +
                               "Anak ayam turunlah berkotek\n" +
                               "Tek kotek, kotek kotek\n" +
                               "Anak ayam turunlah berkotek");

            System.out.println("\nAnak ayam turunlah " + ayam + "\n" +
                               "Mati satu tinggallah " + (ayam - 1));

            if (ayam - 1 > 1) {
                System.out.println("\nAnak ayam turunlah " + (ayam - 1) + "\n" +
                                   "Mati satu tinggallah " + (ayam - 2) + "\n");
            } else if (ayam - 1 == 1) {
                System.out.println("\nAnak ayam turunlah satu\n" +
                                   "Mati satu tinggallah induknya\n");
            }
        }
    }
}


