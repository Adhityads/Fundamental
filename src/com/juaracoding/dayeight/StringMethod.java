package com.juaracoding.dayeight;

public class StringMethod {
    public static void main(String[] args) {

        String actual = "Data berhasil disimpan";
        String expect = "berhasil";

        System.out.println(actual.contains(expect));

        String browser = "firefox";
        String pilihChrome = "Chrome";
        String pilihFirefox = "Firefox";
        if(pilihChrome.equals(browser)){
            System.out.println("Browser Chrome");
        } else if(!pilihFirefox.equalsIgnoreCase(browser)){//Not
            System.out.println("Browser Firefox");
        }
        else {
            System.out.println("Error");
        }

        System.out.println(browser.toUpperCase());
        System.out.println(browser.substring(4, 7));

    }
}
