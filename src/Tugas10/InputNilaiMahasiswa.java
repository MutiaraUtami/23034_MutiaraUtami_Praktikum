/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import java.util.ArrayList;

public class InputNilaiMahasiswa {
    ArrayList<NilaiMahasiswa> listNilaiMahasiswa;
    
    public InputNilaiMahasiswa() {
        listNilaiMahasiswa = new ArrayList ();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, 
            double nilai1, double nilai2, double  nilai3, double nilai4, double nilai5) {
        NilaiMahasiswa nm = new NilaiMahasiswa(NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listNilaiMahasiswa.add(nm);
    }
    
    public ArrayList<NilaiMahasiswa> getALL() {
        return listNilaiMahasiswa;
    }

    public void deleteData(int index) {
        listNilaiMahasiswa.remove(index);
    }
}
