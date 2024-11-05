/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3.Latihan2;

public class KonversiSuhu {
    public void celciusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9.0 / 5.0) + 32;
        System.out.println(celcius + " derajat C = " + fahrenheit + " derajat F");
    }

    public void celciusToReamur(double celcius) {
        double reamur = celcius * 4.0 / 5.0;
        System.out.println(celcius + " derajat C = " + reamur + " derajat R");
    }
}