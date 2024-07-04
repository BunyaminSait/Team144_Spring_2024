package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan 28'den kucuk bir sayi alip,
        bu sayinin faktoryel degerini hesaplayin.
        Konsolda faktoryel hesabinin yapilisini da yazdirin
        6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 20'den kucuk bir sayi giriniz: ");
        int girilenSayi= scan.nextInt();
        int sonuc=1;

        for (int i = girilenSayi; i >=1 ; i--) {
            sonuc*=i;
        }

        String str="";
        for (int i = girilenSayi; i >=1 ; i--) {
            str=str+i+"*";
        }
        str=str.substring(0,str.length()-1);
        System.out.println(girilenSayi+"!="+str+"="+sonuc);


    }
}
