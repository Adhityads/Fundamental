package com.juaracoding.ujiandua;

public class SoalPertama {
    public static void main(String[] args) {
    loop();
    }
    static void loop(){
    int i, j,k = 1,l=10;
        for (i = 1;i<=5;i++){
            for(j=k;j<l;j++) {
                    if (j % 2 == 1) {
                        System.out.print(j);
                    } else {
                        System.out.print("_");
                }
            }
            System.out.println();
            k++;
            l--;
        }

    }

}
