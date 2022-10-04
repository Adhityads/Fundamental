package com.juaracoding.daytwo;

public class Variable {
    public static void main(String[] args){
        int usia = 20, operasi = 10*15;
        float nilai = 8.7f;
        double nilaiSatu = 8.9;
        // variable 2 kata yg kedua huruf besar
        System.out.print(usia+" ");
        System.out.print(nilai+" ");
        System.out.print(nilaiSatu+" ");
        System.out.println(operasi);
        Double angka = 9.9;
        // Double punya 2 tipe data, primitif dan non primitif
        System.out.println(angka);

        //char, text
        char huruf = 'A';
        // char tidak bisa kutip (")
        System.out.println(huruf);

        String alamat = "Bumi Anggrek";
        //String tipe data Objek/non primitif karena huruf depan nya besar
        System.out.println(alamat);

        //boolean
        boolean isAddress = true;
        //boolean didepan harus menggunakan is
        System.out.println(isAddress);

    }

}
