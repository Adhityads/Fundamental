package com.juaracoding.dayfour;

public class ContohNestedFor {
    public static void main(String[] args) {
        int i, j, h, g;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        for (i = 10; i >= 1; i--) {
            if (i % 2 == 1) {
                for (j = i; j >= 1; j--) {
                    if (j % 2 == 1) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}