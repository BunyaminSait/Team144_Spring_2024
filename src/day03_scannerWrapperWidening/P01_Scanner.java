package day03_scannerWrapperWidening;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz: ");
        String name=scan.nextLine();
        System.out.println("isim = "+name);

        System.out.print("Lütfen soyadınızı giriniz: ");
        String surname=scan.nextLine();
        System.out.println("Soyadı: "+surname);

        System.out.print("Lütfen telefon numaranızı giriniz: ");
        int telNo=scan.nextInt();
        System.out.println("Telefon = "+telNo);
        scan.nextLine(); // scan.nextline atlama problemini yok ediyor.
        System.out.print("Lütfen Mail adresinizi giriniz: ");
        String email=scan.nextLine();
        System.out.println("Email: "+email);

        System.out.print("Lütfen ondalıklı bir sayı giriniz: ");
        double sayi=scan.nextDouble();
        System.out.println("sayi: "+sayi);

        //char harf=scan.next().charAt(0) (sadece ilk harfi alır)

    }
}
