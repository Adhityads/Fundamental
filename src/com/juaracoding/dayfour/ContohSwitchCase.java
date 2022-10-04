package com.juaracoding.dayfour;
import java.io.*;
import java.util.Scanner;

public class ContohSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("Masukkan Pilihan Menu : ");
        pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Tampilkan Data");
                break;
            case 2 :
                System.out.println("Tambah Data");
                break;
            case 3 :
                System.out.println("Edit/Update Data");
                break;
            case 4 :
                System.out.println("Hapus Data");
                break;
            default :
                System.out.println("Menu Tidak Ada");
        }
    }
}
