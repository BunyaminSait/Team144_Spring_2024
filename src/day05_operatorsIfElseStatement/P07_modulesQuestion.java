package day05_operatorsIfElseStatement;

import java.util.Scanner;

public class P07_modulesQuestion {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
        Ipucu 1: Sayi % 10 => Bize son basamagi verir
        1469 % 10 = 9
        Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
        int sayi=1469;
        sayi = sayi / 10 =>
        sayi’ya 46 degerini atar
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı bir pozitif tam sayi giriniz: ");
        int sayi=scan.nextInt();
        int sonb=sayi%10;
        int sondan1=sayi%100/10;
        int sondan2=sayi%1000/100;
        int sondan3=sayi/1000;

        System.out.println(sonb);
        System.out.println(sondan1);
        System.out.println(sondan2);
        System.out.println(sondan3);

        System.out.println("Basamaklarin toplami = "+(sonb+sondan1+sondan2+sondan3));



    }
}
