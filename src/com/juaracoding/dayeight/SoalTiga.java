package com.juaracoding.dayeight;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ar[] = {1,2,3,4,5,6,7,8,9,10 };
        int i = input.nextInt();
        try {
            System.out.println(ar[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println();
            System.out.println("Eksekusi code berikutnya");
        }
    }
}
