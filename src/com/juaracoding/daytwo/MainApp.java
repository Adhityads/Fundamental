package com.juaracoding.daytwo;

public class MainApp {
    int x = 5;
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Hello world!");
        System.out.println(x);
        MainApp mainApp = new MainApp();
        mainApp.namamethod();
    }
    void namamethod(){
        int y = this.x;
        System.out.println(y);
    }
}