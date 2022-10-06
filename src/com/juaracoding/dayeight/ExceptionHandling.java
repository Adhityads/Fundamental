package com.juaracoding.dayeight;
import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = 2;
        try {
            int hasil = a / b;
        } catch (ArithmeticException e) {
            if (a == 10) {
//            e.printStackTrace();//Menampilkan hasil error default
                System.out.println(e);//err Menampilkan output berwarna merah
                System.out.println("Alternatif: "+c);
                System.out.println("Eksekusi code berikutnya");//menggunakan err
                System.out.println("Ket:");
                System.out.println("A = " + a + ", B = " + b);
            } else {
                System.out.println(e);//err Menampilkan output berwarna merah
                System.out.println("Alternatif: "+(c*10));
                System.out.println("Eksekusi code berikutnya");//menggunakan err
                System.out.println("Ket:");
                System.out.println("A = " + a + ", B = " + b);
            }
        }
//        System.out.println("Statement Kedua");

//        String browser = null;
//        try {
//            System.out.println(browser.length());
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Statement Keempat");

    }
}
