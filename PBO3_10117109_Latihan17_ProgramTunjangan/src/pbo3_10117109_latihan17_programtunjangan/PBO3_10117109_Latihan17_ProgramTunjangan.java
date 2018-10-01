/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan17_programtunjangan;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat program Gaji Pokok dan Tunjangan
 */
public class PBO3_10117109_Latihan17_ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double Tunjangan,TotalGaji,GajiPokok;
        
        
        Scanner baca = new Scanner (System.in);
        
        System.out.println(" ============Program Tunjangan===============");
        
        System.out.print("Berapa Gaji Pokok Anda Perbulan?: Rp.");
        GajiPokok = baca.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String Status = baca.next();
        
        
        if("Menikah".equals(Status)){
            Tunjangan = 0.35 * GajiPokok;
            TotalGaji = GajiPokok + Tunjangan;
        }
        else
        {    
            Tunjangan = 0 * GajiPokok ;
            TotalGaji = GajiPokok + Tunjangan;    
    }
        System.out.println("");
        System.out.println(" ========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t: \t Rp." + GajiPokok);
        System.out.println("Tunjangan\t: \t Rp." + Tunjangan);
        System.out.println("Total  Gaji\t: \t Rp." + TotalGaji);
        
        System.out.println("Developed by : Stefanus Saputra");
    }
    
}
