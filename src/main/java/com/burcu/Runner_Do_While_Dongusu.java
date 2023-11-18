package com.burcu;

import java.util.Random;
import java.util.Scanner;

public class Runner_Do_While_Dongusu {
    public static void main(String[] args) {

        /**
         * Do-While döngüsünde öncelikle kod bloğunu çalıştırılır daha sonra koşul kontrol edilir.
         * Do-While döngüsü de while döngüsü gibi belirli bir koşula bağlı olarak çalışır.
         * Ancak while döngüsünden farklı olarak öncelikle kod bloğunu çalıştırır daha sonra koşulu kontrol eder.
         * Eğer koşul doğru(true) ise döngü tekrarlanır. Koşul yanlış(false) ise döngü sona erer.
         *
         * Yapısı şu şekildedir;
         *     do{
         *        //kod bloğu
         *       }while(koşul);
         */

        /**
         * Do-While döngüsünün performasını inceleyeceğimiz bir örnek aşağıda verilmiştir;
         * Dışarıdan girilen bir sayıdan 0'a kadar olan sayıların toplamını ve ortalamasını veren kodu yazalım.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi2= scanner.nextInt();
        int toplam=0, ortalama=0, sayac=0;

        do {
            toplam+=sayi2;
            sayi2--;
            sayac++;

        }while (sayi2>0);

        ortalama=toplam/sayac;
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);


        /**
         * Do-While döngüsünde kod bloğu koşuldan önce geldiği için döngü en az bir kez çalışmak zorundadır.
         * Bu sebeple kod bloğu en az bir kez çalıştırılmak istendiğinde do-while tercih sebebidir.
         *
         * Bir örnekle do-while döngüsünün yapısını inceleyelim;
         * Aşağıdaki örnekte while komutunun içindeki koşul false ifade olmasına rağmen kod bloğu,
         * koşuldan önce geldiği için döngü 1 defa çalışmak zorunda kaldı.
         */

        int sayi1=1;
        do {
            System.out.println("Sayi: " + sayi1);

        }while (sayi1>5);



        /**
         * Bir sayı tahmin oyunuyla do-while döngüsünün performansını incelemeye devam edelim;
         */

        Random random=new Random();
        int randomsayi= random.nextInt(10);
        int sayi;

        System.out.println("**** SAYI TAHMİN OYUNU ****");
        System.out.println();
        System.out.println("Lütfen bir sayı tahmin ediniz:");
        do {
            sayi=scanner.nextInt();
            if (sayi>randomsayi) System.out.println("Tahmininizi azaltınız!");
            else if (sayi<randomsayi) System.out.println("Tahmininizi arttırınız!");
            else {
                System.out.println("Tebrikler doğru tahmin ettiniz!");
                break;
            }
        }while (true);



    }
}
