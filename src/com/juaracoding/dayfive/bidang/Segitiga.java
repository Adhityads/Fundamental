package com.juaracoding.dayfive.bidang;

public class Segitiga {

   public void draw (int sisi) {//prosedur karena berbeda class dan tidak mengembalikkan nilai
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }
    }

}
