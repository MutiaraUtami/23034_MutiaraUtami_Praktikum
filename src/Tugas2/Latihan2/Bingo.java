/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2.Latihan2;

public class Bingo {
    public final char[] huruf = {'B', 'I', 'N', 'G', 'O'};

    public void tampilkanLirik() {
        for (int tepukan = 0; tepukan <= huruf.length; tepukan++) {
            cetakBarisTepukan(tepukan);
        }
    }

    public void cetakBarisTepukan(int jumlahTepukan) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for (int i = 0; i < 3; i++) {
            cetakHurufDenganTepukan(jumlahTepukan);
        }
        System.out.println("And Bingo was his name-o.");
    }

    public void cetakHurufDenganTepukan(int jumlahTepukan) {
        for (int i = 0; i < 5; i++) {
            if (i < jumlahTepukan) {
                System.out.print("(clap) ");
            } else {
                System.out.print(huruf[i] + " ");
            }
        }
        System.out.println();
    }
}
