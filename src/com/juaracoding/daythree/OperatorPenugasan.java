package com.juaracoding.daythree;

public class OperatorPenugasan {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = 5 ;
        b = 3;
        b = b+1;
        c = a + b ;
        f = 10;
        System.out.println(b);
        System.out.println(b+= 1); // b = b +1
        System.out.println(b%= 2);
        System.out.println(f<<= 5); // 10 * (2^5)
        System.out.println(f>>= 2); // 320 / (2^2)

    }
}
