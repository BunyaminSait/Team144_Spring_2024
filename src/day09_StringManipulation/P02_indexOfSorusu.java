package day09_StringManipulation;

import java.util.Scanner;

public class P02_indexOfSorusu {
    public static void main(String[] args) {

        /*
               Kullanicidan bir String ve aranacak metin alin.
               String'in aranan metni icerip icermedigini
               indexOf( ) method'u kullanarak yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scan.nextLine();

        System.out.print("Lutfen cumlede aradiginiz metni giriniz: ");
        String metin=scan.nextLine();

        System.out.println(cumle.contains(metin)); // true

        System.out.println(cumle.indexOf(metin));
        // -1 donerse o metin yoktur 0 ve daha baska bir pozitif deger donerse o metin vardır

        if (cumle.indexOf(metin)>=0){
            System.out.println("Aradiginiz "+metin+" kelimesi cumle icinde vardir");
        }else {
            System.out.println("Aradiginiz "+metin+" kelimesi cumle icinde yoktur");
        }

        // cumlenin ikinci yarisinda var mi?

        if (cumle.indexOf(metin,(cumle.length()/2))>=0){
            System.out.println("Aradiginiz "+metin+" kelimesi cumlenin ikinci yarisinda vardir");
        }else {
            System.out.println("Aradiginiz "+metin+" kelimesi cumlenin ikinci yarisinda yoktur");
        }

        // cumlenin ilk yarisinda var mı?
        if(cumle.lastIndexOf(metin,(cumle.length()/2))>=0){
            System.out.println("Aradiginiz "+metin+" kelimesi cumlenin ilk yarisinda vardir");
        }else {
            System.out.println("Aradiginiz "+metin+" kelimesi cumlenin ilk yarisinda yoktur");
        }

        // ikinci kez kullanilmis mi nasil buluruz
        String str= "Ali topu at, at ali at";
        int ilkIndex=str.indexOf("at");
        System.out.println("ilk index: "+ilkIndex); // 9


        System.out.println(str.indexOf("at",(ilkIndex+1))); // 13   ilk indexten sonraki
        System.out.println(str.indexOf("at",(ilkIndex+5))); // 20



    }
}
