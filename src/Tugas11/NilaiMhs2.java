/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas11;

import Tugas9.Pertemuan.*;

/**
 *
 * @author USER
 */
public class NilaiMhs2 extends NilaiMhs{
    String ket;
    
    public char gradeMhs(){
        if (rata >=80)
        grade = 'A';
        else if (rata >=65)
        grade = 'B';
        else if (rata >= 56)
        grade = 'C';
        else if(rata >=40)
        grade = 'D';
        else
        grade = 'E';
        return grade;
    }
    
    public String hasil(){
        if (rata >=56)
        ket = "Lulus";
         else
         ket = "Tidak Lulus";
        return ket;
    }
}
