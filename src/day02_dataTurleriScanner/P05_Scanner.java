package day02_dataTurleriScanner;

import java.util.Scanner;

public class P05_Scanner {
    public static void main(String[] args) {

        // kullanicidan veri (ornegin ismini yasini v.b) almak icin scanner class kullanirir

        // SORU: Kullanicidan ismini alip yazdirin

        // 1. Scanner classindan obje olusturulur

        Scanner scan=new Scanner(System.in);
        // cikmazsa import class

        // 2. Kullancidan isteyecegimiz veri icin bir aciklama yazdiriyoruz

        System.out.print("Lutfen Adinizi Giriniz: ");

        // 3. Istedigimiz bilginin data turune gore scanner objesi uzerinden method kullanalım

        String girilenIsim=scan.nextLine();

        // next(): Girilen String ifadeyi ilk bosluga kadar alir (Bunyamin)
        // nextLine(): Girilen ifadenin tamamini alir (Bunyamin Sait)

        System.out.println(girilenIsim);

    }
}
