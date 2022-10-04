package com.juaracoding.dayfive;

import java.util.Date;

public class ContohConstructor {
    public static void main(String[] args) {
//        Date date = new Date(); //waktu dan tanggal saat ini
//        System.out.println(date.toString());

        Date date = new Date(60000); //waktu awal type date dibuat dalam satuan milisecond
        System.out.println(date.toString());
    }
}
