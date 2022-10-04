package com.juaracoding.daythree;

public class Pendapatan {
    public static void main(String[] args) {
        double pendapatan = 10000000, pajak;
        String gender, status;
        gender = "p";
        status = "menikah";
        if (pendapatan > 7000000) {
            if (gender == "l") {
                if (status == "menikah") {
                    pajak = pendapatan * 0.05;
                    System.out.println("Pajak Anda Sebesar Rp"+pajak);
                } else {
                    pajak = pendapatan * 0.1;
                    System.out.println("Anda Belum Menikah, Pajak Anda Sebesar Rp" + pajak);
                }
            }
            if(status == "menikah"){
                pajak = pendapatan * 0.02;
                System.out.println("Pajak Anda Sebesar Rp"+pajak);
            } else {
                pajak = pendapatan * 0.05;
                System.out.println("Anda Belum Menikah, Pajak Anda Sebesar Rp" + pajak);
            }
            } else
            System.out.println("Anda Tidak Wajib Membayar Pajak");
    }
}