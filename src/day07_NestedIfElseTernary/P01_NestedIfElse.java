package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P01_NestedIfElse {

    /*
    Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
    kullaniciya musteri karti olup olmadigini sorun.
    Musteri karti varsa 10 urunden fazla alirsa %20,
    az alirsa %15 indirim yapin,
    Musteri karti yoksa 10 urunden fazla alirsa %15,
     az alirsa %10 indirim yapin
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen aldiginiz urun adedini giriniz: ");
        int adet=scan.nextInt();
        System.out.print("Urunun liste fiyatini giriniz: ");
        double fiyat=scan.nextDouble();
        System.out.print("Wise Club kartiniz var mi? (E/H): ");
        char kart=scan.next().charAt(0);
        if (kart=='E' || kart=='e'){
            if (adet>10){
                System.out.println("Odeyeceginiz %20 indirimli toplam tutar: "+fiyat*adet*0.8);
            }else {
                System.out.println("Odeyeceginiz %15 indirimli toplam tutar: "+fiyat*adet*0.85);
            }
        } else if (kart=='H' || kart=='e') {
            if (adet>10){
                System.out.println("Odeyeceginiz %15 indirimli toplam tutar: "+fiyat*adet*0.85);
            } else {
                System.out.println("Odeyeceginiz %10 indirimli toplam tutar: "+fiyat*adet*0.90);
            }
        } else {
            System.out.println("Yanlis deger girildi.");
        }

    }


}
