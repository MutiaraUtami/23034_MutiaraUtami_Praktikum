/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9.Pertemuan;

/**
 *
 * @author USER
 */
public class NilaiMhs {
    public double tm, uas, uts,rata; char grade;
    
    public double nilaiRata(){
        rata = (tm+uts+uas)/3;
        return rata;
    } 
}
