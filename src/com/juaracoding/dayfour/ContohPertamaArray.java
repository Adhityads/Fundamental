package com.juaracoding.dayfour;

public class ContohPertamaArray {
    public static void main(String[] args) {
        int nomor[] = {1, 2, 3, 4, 5};
        //System.out.println(nomor[0]);
       // System.out.println(nomor[1]);
       // System.out.println(nomor[2]);
        //System.out.println(nomor[3]);
        //System.out.println(nomor[4]);
        for(int i = 0;i< nomor.length;i++){
            System.out.println(nomor[i]);
        }
        String kota[] = {"Jakarta", "Bandung", "Lampung", "Makasar", "Kuningan"};
        //System.out.println(kota[0]);
        //System.out.println(kota[1]);
        //System.out.println(kota[2]);
        //System.out.println(kota[3]);
        //System.out.println(kota[4]);
        for(int i =0;i< kota.length;i++){
            System.out.println(kota[i]);
        }
        System.out.println("============For Each==============");
        for(String i : kota){
            System.out.println(i);
        }
        System.out.println("==================================");

        //cara dekalarasi ke-2
        String nama[] = new String[5];
        nama[0] = "Test Satu";
        System.out.println(nama[0]);
        System.out.println("==================================");
    }
}
