package day03_scannerWrapperWidening;

public class P06_dataCasting {
    public static void main(String[] args) {

        // kucuk data turundeki datalari buyuk data turune atamak istersek
        // java bu genisletme islemini otomatik olarak yapar
        // buna auto widening denir.

        //  b y t e  <  s h o r t  <  i n t  <  l o n g  <  f l o a t  <  d o u b l e

        byte a=15;
        short b=a;

        int c=a;
        double d=a;

        // buyuk data turundeki degeri kucuk data turundeki variable'a atamak istersek
        // java bunu otomatik olarak yapmaz. Veri kaybi olabilecegi icin sorumluluk almamizi ister.
        // Donusum sorunlu olmayacaksa biz sorumlulugu almak icin buyuk data turunun onune degistirmek istedigimiz degeri yazariz.
        // Bu olaya explicit narrowing denir

        double sayi1=234.8;

        int sayi2=(int)sayi1;

        short sayi3=(short)sayi1;

        // parantez icindeki ture donusmesine izin verdigimi belirtiyorum.

        byte sayi4=(byte)sayi1;


        System.out.println("sayi1 = " + sayi1); // 234.8
        System.out.println("sayi2 = " + sayi2); // 234 yuvarlama yapmadan sadece noktadan oncesini alir
        System.out.println("sayi3 = " + sayi3); // 234
        System.out.println("sayi4 = " + sayi4); // -22 dolaniyo + ve - arasinda




    }
}
