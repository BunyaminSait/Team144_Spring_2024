package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P02_ArtikYilSorusu {

    public static void main(String[] args) {

        /*
        Soru ) Interview Question
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
                 sadece 400’un kati olan yillar artik yildir
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol etmek istediginiz yili yaziniz: ");
        int year=scan.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    System.out.println("Girdiginiz yil artik yildir.");
                } else {
                    System.out.println("Girdiginiz yil artik yil degildir.");
                }

            } else {
                System.out.println("Girdiginiz yil artik yildir.");
            }
        } else {
            System.out.println("Girdiginiz yil artik yil degildir.");
        }


        System.out.println(("****** Ternary ile Cozumu ******"));

        String result = year%100==0?year%400==0?"Artik yil":"Artik yil degil":
                        year%4==0?"Artik yil":"Artik yil degil";
        System.out.println("result = " + result);


    }

}
