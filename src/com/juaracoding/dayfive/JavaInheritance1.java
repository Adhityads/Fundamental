package com.juaracoding.dayfive;

class kopi{
    void bikin(){
        System.out.print("Masukkan Kopi");
        System.out.print("masukkan gula");
        System.out.print("masukkan air");
        System.out.print("aduk");
    }
}
class KopiVietnam extends kopi{
    void bikin() {
        super.bikin();
        System.out.print("masukkan sianida");
    }
}
public class JavaInheritance1 {
    public static void main(String[] args) {
        KopiVietnam kopimirna = new KopiVietnam();
        kopimirna.bikin();
    }
}
