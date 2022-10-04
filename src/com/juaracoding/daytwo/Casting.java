package com.juaracoding.daytwo;

public class Casting {
    public static void main(String[] args) {
        //implicity = langsung tanpa define data
        int data1 = 100;
        long data2 = data1;
        //digunakan ketika int tidak cukup
        System.out.println(data2);

        //explicit = isinya membutuhkan define
        short data3 = 107;
        char char_data = (char) data3;
        //output berdasarkan ASCII Table
        System.out.println(char_data);

    }
}
