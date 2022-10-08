package com.juaracoding.ujiandua;

public class SoalPertama {
    public static void main(String[] args) {
    loop();
    }
    static void loop(){
    int i, j,k = 1;
        for (i = 10;i>=1;i--){
            for(j=k;j<i;j++) {
                    if (j % 2 == 1) {
                        System.out.print(j);
                    } else {
                        System.out.print("_");
                }
            }
            k++;
            System.out.println();
        }

    }

}
