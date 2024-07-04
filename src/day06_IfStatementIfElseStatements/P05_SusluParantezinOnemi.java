package day06_IfStatementIfElseStatements;

public class P05_SusluParantezinOnemi {
    public static void main(String[] args) {

        /*

        if () {

              if body

              }

        Eger {} kullanmazsak java ilk ; ' e kadar olan kismi if body olarak alir

         */

        int sayi=44;

        // sayi cift ise ayri ayri Sayi 2 ile bolunur ve cift sayi yazdirsin
        // sayi tek ise ayri ayri Sayi 2 ile bolunmez ve tek sayi yazdirsin

        if (sayi%2==0)
            System.out.println("cift sayi"); // if body'si tek satir olur (suslu parantez olmadiginda)
            System.out.println("Sayi 2 ile bolunur");
        // else
        System.out.println("tek sayi");
        System.out.println("Sayi 2 ile bolunmez");
    }
}
