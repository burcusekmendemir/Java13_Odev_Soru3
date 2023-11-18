package com.burcu;

import java.util.Scanner;

public class Runner_While_Dongusu {
    public static void main(String[] args) {
        /**
         * WHİLE DÖNGÜSÜ;
         * Belirli bir koşulu sağladığı sürece tekrar eden döngü yapısıdır.
         * Yapısı şu şekildedir;
         *
         * while (true) {
         *             kod bloğu
         *             komut 1
         *             komut 2
         *             ...
         *             komutn
         *         }
         *
         *  Bir örnekle while döngüsünün yapısını inceleyelim;
         */

        /**
         * "Verilen sayı 15'ten küçük ve eşitse döngü dönsün ve ekrana sayı yazsın, her seferinde sayı birer birer artsın"
         * şeklinde kodumuzu yazalım.
         */

        int sayi1=10;
        while (sayi1<=15){
            System.out.println("Sayi: " + sayi1);
            sayi1++;
        }



        /**
         * While döngüsü ilk olarak başlangıçta belirtilen koşulu kontrol eder, daha sonra bu koşul
         * doğru(true) olduğu sürece döngüyü tekrar eder.
         * Döngü içerisinde belirtilen işlemleri, karar yapılarını vs. döngü tekrar ettiği sürece gerçekleştirir.
         * Artık koşulun sağlanmadığı durumda(false) döngü sonra erer.
         * Aşağıdaki örnekle while döngüsünün performansını açıklayabiliriz;
         */

        /**
         * Kullanıcı 5'in katı olan bir sayı girmediği sürece sayı almaya devam eden,
         * 5'in katı bir sayı girildiği anda sayıların toplamını ve ortalamasını ekrana veren kodu yazalım.
         */

        int ortalama=0, toplam=0, sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi=scanner.nextInt();

        while (sayi%5!=0){
            toplam+=sayi;
            sayac++;
            System.out.println("Lütfen bir sayı giriniz:");
            sayi=scanner.nextInt();
        }
        ortalama=toplam/sayac;
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);


        /**
         * While döngüsü kullanırken koşul kısmında mantıksal hatalar yapmamaya dikkat edilmelidir.
         * Aşağıdaki örnekte sınırları belli olan bir kod yazılmıştır, while döngüsü genellikle
         * sınırları kesin olarak belli olan alanlarda kullanılmamaktadır.
         * Sınırları belli olan döngüler için genellikle for döngüsü tercih edilmektedir.
         */

        int carpim=1;
        int deger=1;

        while (deger<10){
            carpim=carpim*deger;
            System.out.println("Çarpım: " + carpim);
            deger++;
        }

    }
}
