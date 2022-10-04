package com.juaracoding.dayseven.bidang;

public class Segitiga extends RuangBidang {

    int sisi;

    public Segitiga(){

    }

    public Segitiga(int sisi){
        this.sisi = sisi;
    }

    @Override
    public void draw() {
        for (int x = 0 ; x  <= sisi ;x++ ) {
            for(int y = 0 ; y < x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
