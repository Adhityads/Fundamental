package com.juaracoding.dayfive;

class Calculation{
    int hasil;
    void pengurangan(int a, int b){
        hasil = a - b;
        System.out.println(hasil);
    }
}

public class ContohInheritance extends Calculation {
    void perkalian(int a, int b){
        hasil = a * b;
        System.out.println(hasil);
    }
    public static void main(String[] args) {
        ContohInheritance contohInheritance = new ContohInheritance();
        contohInheritance.perkalian(10, 5);
        contohInheritance.pengurangan(50, 20);

//        Calculation calculation = new Calculation();

    }
}

