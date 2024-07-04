package day03_scannerWrapperWidening;

import java.util.Scanner;

public class P02_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Adınız: ");
        String name=scan.nextLine();

        System.out.print("Soyadınız: ");
        String surname=scan.nextLine();

        System.out.print("Yaşınız: ");
        int age=scan.nextInt();

        //System.out.println("İsminiz : "+name);
        //System.out.println("Soyisminiz : "+surname);
        //System.out.println("Yaşınız : "+age);
        //System.out.println("Kaydınız basariyla tmamlanmistir.");

        System.out.println("İsminiz : "+name+"\nSoyisminiz : "+surname+"\nYaşınız : "+age+"\nKaydınız basarıyla tamamlanmıstır.");
    }
}
