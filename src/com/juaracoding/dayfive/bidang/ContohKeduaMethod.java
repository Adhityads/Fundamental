package com.juaracoding.dayfive.bidang;


public class ContohKeduaMethod {
    public static void main(String[] args) {
        // 2 4 6 8 10
        // 12 14 16 18 20
        BilanganGenap bilanganGenap = new BilanganGenap();
        bilanganGenap.Deret(1,10);
        String nama = "Objek Kedua";
        System.out.printf("\n");
        System.out.printf("%s\n", nama);
        bilanganGenap.Deret(11,20);


    }
}
