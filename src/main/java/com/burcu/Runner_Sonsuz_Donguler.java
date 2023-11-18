package com.burcu;

public class Runner_Sonsuz_Donguler {
    public static void main(String[] args) {

        /**
         * Döngüler koşul true olduğu sürece tekrar eden yapılardır.
         * Eğer koşul sürekli sağlanırsa sonsuz bir döngünün içine girilmiş olur.
         * Bu yapılara sonsuz döngü denir.
         *
         * Aşağıdaki örneklerle sonsuz döngüleri inceleyelim;
         */


        int sayi=10;
        while (sayi%2==0){
            System.out.println("Sonsuz Döngü1");
        }


        while (10==10 || 8>10 && (2>=6 && 12<15)){
            System.out.println("Sonsuz Döngü2");
        }


    }
}
