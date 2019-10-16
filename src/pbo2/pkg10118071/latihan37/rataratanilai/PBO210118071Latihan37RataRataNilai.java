/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan37.rataratanilai;

import java.util.Scanner;

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
public class PBO210118071Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Nilai nilaimhs = new Nilai();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilaimhs.set_mhs(input.nextInt());

        for (int i = 1; i <= nilaimhs.get_mhs(); i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            nilaimhs.set_nilai(input.nextInt());
        }
        System.out.println("\nMaka, Rata-rata nilainya adalah " + nilaimhs.nilai_mean());
        System.out.println("Developed by : David Aditya Winarto");
    }
    
}
