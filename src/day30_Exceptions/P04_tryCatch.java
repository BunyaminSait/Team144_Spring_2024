package day30_Exceptions;

public class P04_tryCatch {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=0;


        try {
            System.out.println("satir 1");
            System.out.println("satir 2");
            System.out.println(sayi1/sayi2);
            System.out.println("satir 3");
            System.out.println("satir 4");

        } catch (ArithmeticException e) {

            // buradaki e variable olarak ifade edilir
            // e ismi verilen variable yakalanan exception'i e icine kaydeder

            // try ile bir exception yakalanip e variable'ina atama yapabilmek icin
            // uygun exception turu yazilmalidir.

            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            e.printStackTrace();;
            System.out.println(e.toString());

        }


    }

}
