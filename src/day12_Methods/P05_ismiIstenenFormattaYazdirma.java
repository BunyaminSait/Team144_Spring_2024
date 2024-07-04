package day12_Methods;

import java.util.Scanner;

public class P05_ismiIstenenFormattaYazdirma {
    public static void main(String[] args) {

        /*
                Kullanicidan isim, soyisim, kredi karti numarasi alsin
                asagida verilen sekilde yazdiran bir method olusturun
                Input : Hamza, Yigit, 4242 4242 4242 4242
                Output : H**** Y****  **** **** **** 4242
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Adiniz: ");
        String isim = scan.nextLine();
        System.out.print("Soyadiniz: ");
        String soyisim = scan.nextLine();
        System.out.print("Kredi Karti Numaraniz: ");
        String kKno = scan.nextLine();

        duzenleYazdir(isim, soyisim, kKno);

    }

        public static void duzenleYazdir(String isim, String soyisim, String kKno) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\W","*");
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("[a-zA-ZĞİÜÖÇŞıüğçşö]","*");

        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\W","*");

        /*
            \\w harf,rakam,_ olan her seyi * yapti
            [a-zA-ZĞİÜÖÇŞıüğçşö] regex ayarlayarak icindeki karakterlerin tamamini * yapti (ae olursa bu cozemez)
            \\W harf,rakam,_ olmayan herseyi * yapti (ae olursa bu cozer)
         */

        kKno=kKno.substring(kKno.length()-4);

                System.out.println(isim+" "+soyisim+" "+" **** **** **** "+kKno);

        }







}
