/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class MainMethod {
    // Deklarasi Tipe Data dan Variabel
    String namaTumbuhan, namaLatin;
    int biji, jumlah;
    
    // Method Kelompok Tumbuhan Percabangan
    void kelompokTumbuhan(){
        // Inputan User
        Scanner input = new Scanner (System.in);
        
        // Judul Program
        System.out.println("================================================");
        System.out.println("             PROGRAM KELOMPOK TUMBUHAN          ");
        System.out.println("================================================");
        
        // Spasi atau Penjeda
        System.out.println(" ");
        
        // User Memasukkan Nama tumbuhan
        System.out.print("Masukkan Nama Tumbuhan    : ");
        namaTumbuhan = input.nextLine();
        
        // User Memasukkan Nama Latin
        System.out.print("Masukkan Nama Latin       : ");
        namaLatin = input.nextLine();
        
        // User Memasukkan Kategori Biji Tumbuhan
        System.out.print("Tumbuhan Tersebut Berbiji : ");
        biji = input.nextInt();
        
        // Kondisi Pecabangan
        // Jika biji == 1, maka akan menampilkan "MONOKOTIL"
        if (biji == 1) 
              System.out.println("MONOKOTIL");
        // Jika biji == 2, maka akan menampilkan "DIKOTIL"
        else if ((biji > 1 ) && (biji == 2))
              System.out.println("DIKOTIL");
      
    }
    
    void fotosintetis(){
        
        // Spasi atau Penjeda
        System.out.println(" ");
        
        // Inputan User
        Scanner input = new Scanner (System.in);
        
        // User Memasukkan Nama Tumbuhan
        System.out.print("Masukkan Nama Tumbuhan : ");
        namaTumbuhan = input.nextLine();
        
        // User Memasukkan Jumlah Kata yang Ingin Diulang
        System.out.print("Berapa Banyak Perulangan Kata yang Anda Inginkan : ");
        jumlah = input.nextInt();
        
        // Perulangan
        // i = , i Kurang Dari jumlah, Maka i++ (Perulangan dimulai dari 0 dan akan terus berulang sampai kurang dari jumlah, sehingga akan diulangi sebanyak jumlah)
        for (int i=0 ; i<jumlah; i++)
           // menampilkan hasil
           System.out.println("Berfotosintetis");
    }
}
