package com.juaracoding.dayfour;

public class ContohPertamaLooping {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
            } else System.out.print(" ");
        }
    }
}
