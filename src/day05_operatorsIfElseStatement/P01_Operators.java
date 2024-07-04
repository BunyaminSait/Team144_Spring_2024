package day05_operatorsIfElseStatement;

public class P01_Operators {
    public static void main(String[] args) {

        /* Java'da bir cok operator vardır. Bu operatorler
              - Atama Operatoru =
              - Karsilastirma Operatorleri
              - Mantıksal Operatorler
              - Matematiksel Operatorler
         */

        // Atama Operatoru: herhangi bir variable'a deger verdigimizde ona karsilik gelen degeri yazariz

        int a=125;

        // Karsilastirma Operatorleri
        // Esitlik Operatoru (==)
        // Java = ile esitlik kontrolu yapmaz atama islemi yapar
        // iki degerin esit olup olmadigini kontrol etmek icin == operatoru kullanilir
        // bu operator bize boolean sonuc dondurur true/false

        int sayi1=10;
        int sayi2=20;

        System.out.println(sayi1 == sayi2); // false

        // != operator sag tarafinin sol tarafina esit olmadigini ifade eder
        // Java da herhangi bir mantiksal degerin onune ! isareti konulursa o degil anlami olusturur
        // !true ---> false
        // !false ---> true

        System.out.println(sayi1!=sayi2); // true

        /*
             > : buyuktur
             < : kucuktur
             >= : buyuk esittir
             <= : kucuk esittir
         */


        // Mantiksal Operatorler
        //  AND Operatoru && : iki kosulun ya da iki mantiksal degerin birlikte dogru olmasini ister

        int c=12;
        int b=20;
        int d=8;

        System.out.println(b>c && c>d); // && ifadesi hem ilk hem ikinci karsilastirmayi dogru iste true verir
                                        // bir tanesi yanlis ise false verir.

        System.out.println(b>c && d>c); // false

        System.out.println(b<c && d>c); // false && oldugu icin ilk false'da karari acikladi gerisine bakmadi

        System.out.println(b<c & d>c); // false & oldugu icin hepsine bakip karar acikladi

        /*
        OR Operatoru: || (veya)
        bu operatorun sagindaki ya da solundaki ifadelerden sadece birinin dogru olmasi yeterlidir
        sadece bir tanesi bile dogru ise true verir
        ikisi de yanlis ilse false verir
         */

        System.out.println(b>c || d>c); // true
        System.out.println(b<c || d<c); // true
        System.out.println(b<c || d>c); // false


        // Matematiksel Operatorler

        /*
        + toplama : sagindaki sayi ile solundaki sayiyi toplar
        - cikartma : sagindaki sayidan solundaki sayiyi cikarir
        * carpma : sagindaki sayi ile solundaki sayiyi carpar
        / bolme : sagindaki sayiyi solundaki sayiya boler
        % Modulus : sagindaki sayinin solundaki sayiya bolunmesi ile kalan sayiyi verir
         */

        int toplam = a+b;
        System.out.println("toplam = " + toplam);

        int fark = a-c;
        System.out.println("fark = " + fark);

        int carpim = c*d;
        System.out.println("carpim = " + carpim);

        double oran = a/b;
        System.out.println("oran = " + oran);

        int kalan = a%d; // a=125 d=8
        System.out.println("kalan = " + kalan);

        double oran2 = (double)a/d;
        System.out.println(oran2);

        int kalan2 = a%d;
        System.out.println(kalan2);






    }
}
