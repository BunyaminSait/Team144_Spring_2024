package day03_scannerWrapperWidening;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Alani bulunacak dikdortgenin kısa ve uzun kenar olculerini giriniz");
        System.out.print("Kisa kenar uzunlugu: ");
        double kkenar=scan.nextDouble();
        System.out.print("Uzun kenar uzunlugu: ");
        double ukenar=scan.nextDouble();
        double alan=(kkenar*ukenar);
        System.out.println("Dikdortgenin alani: "+alan);


    }
}
