package com.burcu;

import java.util.Scanner;

public class Runner_For_Dongusu {
    public static void main(String[] args) {

        /**
         * For Döngüsü;
         * Bir koşula bağlı olarak, belirli bir sayıda ve bir koşul sağlandığı süre boyunca tekrarlanan döngüdür.
         *
         * For Döngüsü üç bölümden oluşan bir tanımlama yapısına sahiptir.
         * Bu tanımlama yapılarından ilk ifademiz bir veya birden fazla değişkene atama yapılan kısımdır.
         * Bu kısımdan sonra genellikle programımız ikinci ve üçüncü ifade arasında gidip gelir.
         * İkinci ifademiz ise döngümüzün koşul yapısının belirlendiği alandır.
         * Tanımladığımız üçüncü ifade ise değerimizin arttırma veya eksiltme gibi aritmetiksel işlemlerinin gerçekleştiği alandır.
         * Bu kısımların tanımlanması ile for döngüsünü kullanılabilir hale gelir.
         *
         * Aşağıdaki döngü yapısında i, index kelimesinin kısaltması olarak yer almaktadır.
         * Yapısı şu şekildedir;
         *     for(int i=0; i < 10; i++){
         *     komut1;
         *     komut2;
         *     ...
         *     ...
         *     }
         *
         *     for(sayac; kosul; sayac artısı){
         *      komut1;
         *      komut2;
         *      ..
         *      ..
         *      }
         *
         * Sayaç  döngünün kaç defa çalıştığını vermektedir, sayaç for döngüsünden önce de tanımlanabileceği gibi
         * genellikle döngü içerisinde tanımlanmaktadır.
         *
         *
         *  For döngüsünde belirtilen koşul doğru olduğu sürece döngünün içerisindeki komutlar çalışmaya başlar
         *  ve belirtilen komutu tamamladıktan sonra döngü biter.
         *
         *  Aşağıdaki örnekle for döngüsünün yapısını inceleyelim;
         */

        /**
         * Kullanıcının girdiği bir sayının 0'a kadar, bölen sayısını da klavyeden girerek bölünen sayılarını veren kodu yazalım.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        int sayi=scanner.nextInt();
        System.out.println("Lütfen bölen sayıyı giriniz:");
        int bolen= scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%bolen==0)
                System.out.println(i + " " + bolen+ "'e bölünür");

        }

        /**
         * İç içe döngüler, bir döngü yapısının içinde başka bir döngü yapısının bulunması durumudur.
         * Bu durumda, içteki döngü, dıştaki döngünün her bir tekrarında tamamlanır.
         * İç içe döngüler, karmaşık yapıları işlemek ve tekrarlanan işlemleri daha verimli bir şekilde gerçekleştirmek için kullanılır.
         *
         * Aşağıdaki örnekle iç içe döngülerin performansını inceleyelim;
         *
         * For döngüsü kullanarak ters üçgen oluşturan kodu yazalım.
         */

        for (int i = 7; i>0 ; i--) {
            for (int j = i; j <7; j++) {
                System.out.print(" ");
            }
            for (int a=1; a<=i; a++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");

        }

        /**
         * For-each döngüsü dizi arasında geçiş yapmak için kullanılmaktadır.
         * Kullanımı for döngüsünden daha kolaydır, çünkü değeri arttırma ve alt değer gösterimi kullanmayı gerektirmez.
         *
         * Aşağıdaki örnekle for-each döngüsünün yapısını ve performansını inceleyelim;
         *
         * Bir dizideki tek sayıları veren kodu yazalım.
         */

        int [] sayilar={ 26,42,83,97,6,51,72,56,851,743};
        for (int deger: sayilar){
            if (deger%2!=0){
                System.out.println(deger + " tek sayıdır.");
            }
        }


        /**
         * 1'den 10'a kadar olan sayıların çarpım tablosunu veren kodu yazalım.
         */

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+ " x " +j+ " = " + (i*j));
            }

        }










    }
}
