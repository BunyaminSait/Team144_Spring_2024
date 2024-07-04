package day14_doWhileLoopClassVariable;

public class P07_ClassVariables {
    /*
    Class variable'lar adindan anlasilacagi uzere class scope icinde
    ama tum diger kod bloklarinin disinda olusturulurlar

    Class levelda olusturulan variable'lar en ustte olusturulmak zorunda degildir
    fakat genel kabul ve gorunurluk acisindan ustte tanimlanmasi uygun gorulur

    class level'da olusturulan variable'lar kullanim amacina uygun olacak sekilde
    static keyword ile tanimlanabilirler. Local variable'lar static olarak isaretlenemezler
    static olarak isaretlenmeyen variable'lara isntance variable denir
    class variable ister static olarak isaretlensin isterse isaretlenmesin scopelari tum class olur

    class variable'lar ister static olsun ister olmasin deger atamadan deklare edilebilir ve kullanilabilirler
    Eger herhangi bir class variable deger atamadan olusturulursa kullanilacagi zaman
    java ona defaul bir deger atar
    Java'nin belirledigi default degerler
        char ==> hiclik ("")
        sayisal primitive'ler ==> 0
        boolean ==> false
        non-primitive'ler ==> null
     */

    String str1="Java"; // instance bir class variable
    static int sayi1=10;
    static char a;
    static int b;
    static double c;
    static String d;
    static boolean e;

    public static void main(String[] args) {
       // static int sayi2=120;
        System.out.println(sayi1); // sayi1 static oldugu icin her yerden direk ulasabildik
       // System.out.println(str1); // str1 instance oldugu icin method secici olur
                                    // main method static oldugu icin kendisinden (static) olmayani kabul etmez
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }

    public void method1(){
        System.out.println("a = " + a); // abcde static oldugu icin her yerden direkt ulasilir
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println(str1); // instance variable'lar method secicidir method static degilse onun icinde de calisir
                                    // class level'da tanimlanan variable'lar static olmayan methodlarda kullanilabilir

    }

    public static void method2(){
        System.out.println("a = " + a); // abcde static oldugu icin her yerden direkt ulasilir
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // System.out.println(str1);

    }

}
