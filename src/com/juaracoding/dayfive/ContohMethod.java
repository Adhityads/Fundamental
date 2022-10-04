package com.juaracoding.dayfive;

import com.juaracoding.dayfive.bidang.Calculator;
import com.juaracoding.dayfive.bidang.Segitiga;
import java.util.Scanner;
public class ContohMethod {
    public static void main(String[] args) {
        persegi(2);
        persegi(5);
        persegi(4);
        //instance object
        Segitiga segitiga = new Segitiga();
        segitiga.draw(7);
        ucapSalam();

        Calculator calculator = new Calculator();
        int hasil = calculator.add(10, 5);
        System.out.println(hasil);//memakai variabel penampung
        System.out.println(calculator.add(100, 200));//tidak memakai variabel penampung dengan memakai 2 method

    }
    static void ucapSalam() {
        System.out.println("Salam Sang Juara");
    }

    static void persegi(int sisi){//Method karena masih dalam satu class
        for (int i = 1;i<=sisi;i++){
            for(int j = 1;j<=sisi;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
