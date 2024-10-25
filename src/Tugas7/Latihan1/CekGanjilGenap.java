/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7.Latihan1;

public class CekGanjilGenap {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i+ " adalah bilangan ganjil");
            }
        }
    }
}
