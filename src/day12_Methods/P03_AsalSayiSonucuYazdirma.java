package day12_Methods;

import java.util.Scanner;

public class P03_AsalSayiSonucuYazdirma {

    public static void main(String[] args) {

        /*
        Kullanicidan alinan sayinin asal sayi olup olmadgini kontrol eder
        sonuc olarak "Girilen sayi Asal Sayidir" veya "Girilen sayi Asal Sayi degildir"
        seklinde yazdiran bir method olusturun

        NOT: Kendinden ve 1'den baska sayiya bolunemeyen sayilar asal sayidir.
        2,3,5,7,11,13,17,19,23,29....

        Kosul 1: sayi%sayi==0
        Kosul 2: !(sayi%i==0)

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol edeceginiz sayiyi giriniz: ");
        int sayi=scan.nextInt();
        asalSayiMiyazdir(sayi);

    }

    public static void asalSayiMiyazdir(int sayi) {
        for (int i = 2; i <=sayi ; i++) {
            if (i==sayi){
                System.out.println("Girilen sayi Asal Sayidir");
            } else if (sayi%i==0) {
                System.out.println("Girilen sayi Asal Sayi degildir");
                break;
            }


        }
    }

}
