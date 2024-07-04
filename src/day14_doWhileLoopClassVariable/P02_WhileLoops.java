package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P02_WhileLoops {
    /*
        Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        ve bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        bu negatif sayiyi sayi adedine ve toplama eklemeyin
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String karakter="";
        int toplam=0;
        int sayi=0;
        int flag=0; // bir islemi kac kere gerceklestigini saymak icin genelde flag kullanilir

        while (!(karakter.equals("Q") || karakter.equals("q"))) {
            System.out.print("Toplamak icin pozitif bir sayi giriniz\nCikis yapmak icin Q tusunua basiniz\nSayi: ");


            if (scan.hasNextInt()) { // kullanicinin int girip girmedigini kontrol ediyor
                sayi=scan.nextInt(); // her dongude yeni bir sayi aliyor ve kaydedemiyor
                if (sayi<0) {
                    System.out.println("Negatir sayi kullanamazsiniz!");
                }else {
                    toplam+=sayi;
                    flag++;
                }
            } else if (scan.hasNextLine()) {
                karakter=scan.nextLine();
            }
        }
        System.out.println("Girdiginiz "+flag+" adet pozitif tam sayinin toplami: "+toplam);
    }

}
