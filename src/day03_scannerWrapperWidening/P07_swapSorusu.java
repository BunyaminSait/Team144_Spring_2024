package day03_scannerWrapperWidening;

import java.util.Scanner;

public class P07_swapSorusu {
    public static void main(String[] args) {

        // soru: (interview) kullanicidan iki sayi alip ikisinin degerlerini degistirin (swap)

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz: ");
        int a=scan.nextInt(); // a: 10
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        int b= scan.nextInt(); // b: 25

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b; // a: 35 b: 25
        b=a-b; // a: 35 b: 10
        a=a-b; // a: 25 b: 10

        System.out.println("Waaaaaadaaaaaaa");
        System.out.println("----------------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
