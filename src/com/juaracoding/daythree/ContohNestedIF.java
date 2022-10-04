package com.juaracoding.daythree;
import java.io.*;
import java.util.Scanner;

public class ContohNestedIF {
    public static void main(String[] args) {
        //Program Donor Darah
        //Usia min 17 Dan Berat Badan min 55
        String nama;
        int usia, bb;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.println("Masukkan Usia = ");
        usia = input.nextInt();
        System.out.println("Masukkan Berat Badan = ");
        bb = input.nextInt();
        if(usia >=17) {
            if (bb >=55){
                System.out.println(nama+ " Boleh Donor");
            } else
                System.out.println(nama+" Berat Badan Kurang");
        } else
            System.out.println(nama+" Tidak Boleh Donor");
    }
}
