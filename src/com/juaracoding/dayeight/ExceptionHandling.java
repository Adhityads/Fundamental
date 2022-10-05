package com.juaracoding.dayeight;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int hasil = 100 / 0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();//Menampilkan hasil error default
//            System.err.println(e);//err Menampilkan output berwarna merah
            System.err.println("Modifikasi Nama error");//menggunakan err
        }

        System.out.println("Statement Kedua");

        String browser = null;
        try {
            System.out.println(browser.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Statement Keempat");

    }
}
