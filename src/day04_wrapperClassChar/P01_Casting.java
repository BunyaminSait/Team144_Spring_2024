package day04_wrapperClassChar;

import java.util.Scanner;

public class P01_Casting {
    public static void main(String[] args) {

        int sayi1=26;
        int sayi2=4;

        System.out.println(sayi1/sayi2); // 6
        // matematiksel islmerlerde her iki deger de int ise sonuc int olur
        // sonuc double bile olsa noktadan sonrasini silip int olarak doner

        double sayi3=30;

        System.out.println(sayi3/sayi2); // 7.5
        //değerlerden bir tanesi bile double ise sonuc double olarak doner

        // soru: int olarak kullanicidan 3 saayi alarak bunlarin ortalamasinin sonucunu double olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 sayi giriniz");
        System.out.print("1. sayi: ");
        int sayi4=scan.nextInt(); // 15
        System.out.print("2. sayi: ");
        int sayi5=scan.nextInt(); // 20
        System.out.print("3. sayi: ");
        int sayi6=scan.nextInt(); // 30

        System.out.println("Girilen sayilarin ortalamasi: " + (sayi6+sayi5+sayi4)/3); // 21
        // eger bolunen ve bolen int ise sonuc int doner

        System.out.println("Girilen sayilarin ortalamasi: " + ((double)(sayi6+sayi5+sayi4)/3)); // 21.6666
        System.out.println("Girilen sayilarin ortalamasi: " + (double)(sayi6+sayi5+sayi4)/3); // 21.6666
        System.out.println("Girilen sayilarin ortalamasi: " + (double)((sayi6+sayi5+sayi4)/3)); // 21.0
        // son satirda once islemi yapti yani ortalamayi int olarak buldu. Sonucu double olarak yazdi

        System.out.println("Girilen sayilarin ortalamasi: " + ((sayi6+(double)sayi5+sayi4)/3)); // 21.6666








    }
}
