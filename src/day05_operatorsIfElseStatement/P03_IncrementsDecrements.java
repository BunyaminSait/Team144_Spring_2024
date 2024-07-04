package day05_operatorsIfElseStatement;

public class P03_IncrementsDecrements {
    public static void main(String[] args) {

        /*
        Increment islemi bir sayisal degerin degerini kalici olarak yukseltme islemidir
        Sayiyi baska bir sayi ile carparak, toplayarak arttirabiliriz

               - sayinin degerini 3 arttirma
               - sayinin degerini 5 katina cikartma
               - sayinin degerini 1 arttirma

         */

        int sayi=12;
        System.out.println("Sayinin ilk degeri: "+sayi);

        // sayinin degerini 3 arttirma

        // sayi=sayi+3;

        // sayi+=3; // += operatoru solundaki sayinin degerini sagindaki sayi kadar arttirir
        // System.out.println("Sayinin 3 fazlasi: "+sayi);

        sayi*=3; // *= operatoru solundaki sayinin degerini sagindaki katina cikartir
        System.out.println("Sayinin 3 Kati: "+sayi);

        // sayi*=-1;
        // System.out.println("sayi = " + sayi);

        sayi++; // sayinin degerini 1 arttirir
        System.out.println("sayi = " + sayi);
        sayi--; // sayinin degerini 1 azaltir
        System.out.println("sayi = " + sayi);


        sayi=sayi-3; // sayinin degerini 3 azaltir sonra atama yapar
        System.out.println("sayi9 = " + sayi);
        sayi-=3; // sayiyi azaltarak atama yapar
        System.out.println("sayi = " + sayi);
        sayi/=3;
        System.out.println("sayi = " + sayi);


        // Post-Increment / Pre-Increment

        int number=15;

        // post Increment
        System.out.println(number++); // once 15 yazdirir sonra degerini 16 yapar
        System.out.println(number); // 16

        // pre Increment
        System.out.println(++number); // 17
        System.out.println(number); // 17


        int number2=18;

        // post Decrement
        System.out.println(number2--); // once 18 yazdirir sonra degerini 17 yapar
        System.out.println(number2); // 17

        // pre Decrement
        System.out.println(--number2); // once azaltti sonra yazdirdi 16





    }
}
