package day10_StringManipulationForLoop;

public class P05_forLoop {
    public static void main(String[] args) {

        // 1 den baslayip 10'a kadar olan sayilari tek tek yazdirsin

        /*
        int sayi=1;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;
        System.out.print(sayi+" ");
        sayi++;

         */

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i >-10 ; i--) {
            System.out.print("("+i+")"+" ");
        }
        System.out.println();

        // 2 basamakli cift sayilari yazdiralim

        for (int i = 10; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        // soru: 100-500 arasi sayilardan 17'e bolunenleri yazdirin

        for (int i = 100; i <500 ; i++) {
            if (i%17==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();





    }
}
