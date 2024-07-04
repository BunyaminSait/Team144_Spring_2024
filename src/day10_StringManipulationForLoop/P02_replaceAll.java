package day10_StringManipulationForLoop;

public class P02_replaceAll {
    public static void main(String[] args) {

        String str="J4a5va G3uzel65d25i25896r";

        // str=str.replace("4", "" );
        // Bu sadece 4'leri degistirir

        // Tum rakamlari degistirmek (silme) islemi icin replaceAll() methodu kullanilir.

        str=str.replaceAll("\\d", "");
        System.out.println(str);

        /*
        \\d : Rakamlarla eslesir (digit)       \\D : Rakam olmayan herseyle eslesir
        \\s : space karakterleri ile eslesir   \\S : Bosluk olmayan herseyle eslesir
        \\s+ : yanyana birden fazla bosluk varsa onu ifade eder
        \\w : harf, rakam, _(altcizgi) olan karakterleri ifade eder
        \\W : harf, rakam, _(altcizgi) olmayan karakterleri ifade eder
         */

        str="Java        Ogrenmek cok guzel     ";

        System.out.println(str.replaceAll("\\s", "")); // JavaOgrenmekcokguzel
        System.out.println(str.replaceAll("\\s+", "")); // JavaOgrenmekcokguzel
        System.out.println(str.replaceAll("\\s+", " ")); // Java Ogrenmek cok guzel

        System.out.println();
        System.out.println("----------------------------");

        String str2="Java candir";
        System.out.println(str2.repeat(5)); // atama yapmadan str2'yi yanyana girilen deger kadar yazdirir
        // str2=str2.repeat(5); // atama yaparak kalici olarak str2'yi degistirir

        str2="      Java   Candir      ";
        System.out.println(str2.trim()); // basindaki ve sonundaki bosluklari siler



    }
}
