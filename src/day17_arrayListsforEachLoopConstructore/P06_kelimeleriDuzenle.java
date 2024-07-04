package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.List;

public class P06_kelimeleriDuzenle {
    /*
        Verilen String bir array'deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.
     */

    public static void main(String[] args) {

        String[] isimler = {"Arzuv", "Can", "Fatma Demir Mese", "Merve Nur", "Ismail", "Neslihan","Abdurrahman"};
        List<String> duzenlenmisIsımler = new ArrayList<>();

        for (String each : isimler) {
            if (each.length() % 2 == 0) { // cift sayi kontrolu
                duzenlenmisIsımler.add(each.substring(0, each.length() / 2));
            } else { // cift degilse tektir
                duzenlenmisIsımler.add(each.substring(each.length() / 2));
            }

        }
        System.out.println(duzenlenmisIsımler);
    }
}