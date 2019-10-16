/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan37.rataratanilai;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     rata-rata nilai
 * 
 */
public class Nilai {
    private int mhs;
    private int nilai;
    private double jumlah;
    
    public void set_nilai(int nilai) {
        jumlah = jumlah + nilai;
        this.nilai = nilai;
    }
    public int get_nilai() {
        return nilai;
    }
    public void set_mhs(int mhs) {
        this.mhs = mhs;
    }
    public int get_mhs() {
        return mhs;
    }
    
    public double nilai_mean() {
        double mean = jumlah / get_mhs();
        return mean;
    }
    
}
