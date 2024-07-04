package day12_Methods;

import java.util.Scanner;

public class P04_TamBolenSayisiniBulma {

    /*
    Kullanıcıdan alınan sayının pozitif tam bölenlerinin sayısını bulan method oluşturun
    input: 20  1,2,4,5,10,20 olmak üzere 6 böleni vardır
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scan.nextInt();

        tamBolenSayisiYazdir(sayi);

    }

    public static void tamBolenSayisiYazdir(int sayi) {
        int sayac=0;
        String bolenler="";
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenler+=i+",";
                sayac++;
            }
        }
        bolenler=bolenler.substring(0,bolenler.length()-1); // 1,2,3,4,5,10,20 (sondaki virgulu yok ettik)

        System.out.println(sayi +" sayisinin "+ sayac +" tane tam pozitif boleni vardir");
        System.out.println(sayi +" sayisinin "+ bolenler +" olmak uzere "+ sayac +" tane tam pozitif boleni vardir");
    }

}
