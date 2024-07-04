package day08_StringManipulation;

import java.util.Locale;

public class P01_StringManipulation {
    public static void main(String[] args) {

        String str = "Java Candir, Selenium Heyecandir";

        // verilen str'nin hepsini buyuk harf yapin

        str=str.toUpperCase(); // JAVA CANDİR, SELENİUM HEYECANDİR
        System.out.println(str);

        // verilen str'nin tum harflerini kucuk yapin

        System.out.println(str.toUpperCase()); // java candir, selenium heyecandir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        // str'in 7. harfini yazdirin

        System.out.println(str.toLowerCase().charAt(6));

        // str icinde kac karakter vardir

        System.out.println(str.length()); // 32

        // son harfi yazdir
        //System.out.println(str.toLowerCase().charAt(32)); // IndexOutOfBoundsException
        // charAt() kullanirken length ya da daha buyuk bir deger girilirse hata verir.
        // girilen deger aralik disinda der
        System.out.println(str.charAt(32-1));
        // System.out.println(str.toLowerCase().charAt(str.length()-1)); // length: karakter sayisi

        // sondan 6. harfi yazdir
        System.out.println(str.toLowerCase().charAt(str.length()-6));

    }
}
