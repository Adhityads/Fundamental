package com.juaracoding.daynine;

public class LambdaOne {
    public static void main(String[] args) {
        // Lambda(->)
    Addable addOne = (a, b) -> (a + b);//(a,b) function anonymous
        System.out.println(addOne.add(10, 4));

        Addable addTwo = (int a, int b) -> {
            return (a+b);
        };
        System.out.println(addTwo.add(20, 5));
    }
}
