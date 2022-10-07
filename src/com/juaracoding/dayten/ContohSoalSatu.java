package com.juaracoding.dayten;
import java.util.Scanner;


public class ContohSoalSatu {
    public static void main(String[] args) {
        //buatlah algoritma yang mencetak angka 1 - 100
        // ket 1 : JIka angka merupakan kelipatan 3, maka akan mencetak kata YIN
        // ket 2 : JIka angka merupakan kelipatan 5, maka akan mencetak kata YANG
        // ket 3 : JIka angka merupakan kelipatan 3 dan 5, maka akan mencetak kata YINYANG
        // Gunakan method
        yinyang(1,100);
    }
    static void yinyang(int awal, int akhir){
        for(int i= awal; i <=akhir;i++ ){
            if(i % 3 ==0 && i %5==0){
                System.out.println(i+" YINYANG");
            } else if(i %3==0){
                System.out.println(i+" YIN");
            } else if(i %5==0){
                System.out.println(i+" YANG");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
