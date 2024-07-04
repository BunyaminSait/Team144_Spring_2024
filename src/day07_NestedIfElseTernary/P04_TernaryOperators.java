package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P04_TernaryOperators {
    public static void main(String[] args) {

        /*
        Kullanicidan notunu alin
        50 veya daha buyukse "Sinifi Gectin",
        50’den kucukse "Maalesef kaldin" yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        double dersNotu=scan.nextDouble();
//
        System.out.println(dersNotu>=50 ? "Sinifi gectin":"Maalesef kaldin");

        /*
        Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        // x ? (y ? [ z ?--:--] :[] ):()

        System.out.print("Lutfen karsilastirilacak iki adet sayi girip enter tusuna basiniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);


    }
}
