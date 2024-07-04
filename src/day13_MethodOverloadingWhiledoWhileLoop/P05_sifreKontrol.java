package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Scanner;

public class P05_sifreKontrol {
    public static void main(String[] args) {

        /*
             Kullanicidan bir sifre isteyip,
             asagidaki sartlari kontrol edin
             ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
             tum sartlari saglayincaya kadar yeniden sifre isteyin
             tum sartlar saglanirsa, "sifre basariyla kaydedildi" yazdirin ve bitirin
             - ilk harf kucuk harf olmali
             - son karakter rakam olmali
             - sifre bosluk icermemeli
             - uzunlugu en az 10 karakter olmali

         */

        Scanner scan=new Scanner(System.in);
        String girilenSifre="";
        boolean sifreUygunMu=false;

        while (!sifreUygunMu) {// sifreUygunMu degiskeni true'ya donene kadar sifre girmesini iste
            System.out.print("Lutfen bir sifre giriniz: ");
            girilenSifre=scan.nextLine();
            sifreUygunMu=sifreKontrol(girilenSifre);
        }

    }

    public static boolean sifreKontrol(String girilenSifre) {
        int hataSayisi=0; // Hata sayisi degisirse hata var demektir. Degismediyse sifre tum sartlara uygundur

        // - ilk harf kucuk olmali
        char ilkKarakter=girilenSifre.charAt(0);
        if (!(ilkKarakter>='a' && ilkKarakter<='z')) {
            System.out.println("ilk karakter kucuk harf olmalidir!");
            hataSayisi++;
        }

        // son karakter rakam olmali
        char sonKarakter=girilenSifre.charAt(girilenSifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')) {
            System.out.println("Son karakter olarak rakam girmelisiniz!");
            hataSayisi++;
        }

        // sifre bosluk icermemeli
        if (girilenSifre.contains(" ")) {
            System.out.println("Sifrenizde bosluk olmamalidir!");
            hataSayisi++;
        }

        // uzunlugu en az 10 karakter olmali
        if (girilenSifre.length()<10) {
            System.out.println("Sifreniz en az 10 karakter olmalidir!");
            hataSayisi++;
        }
        if (hataSayisi==0) {
            System.out.println("Sifreniz basariyla kaydedildi.");
            return true;
        } else {
            return false;
        }
    }
}
