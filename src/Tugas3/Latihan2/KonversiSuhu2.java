/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3.Latihan2;

public class KonversiSuhu2 extends KonversiSuhu {

    public void fahrenheitToReamur(double fahrenheit) {
        double reamur = (fahrenheit - 32) * 5.0 / 9.0 * 4.0;
        System.out.println(fahrenheit + " derajat F = " + reamur + " derajat R");
    }
}

