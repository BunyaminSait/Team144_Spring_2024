package day03_scannerWrapperWidening;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {

        /*
        (Interview) Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen A tamsayisini giriniz : ");
        int A=scan.nextInt();

        System.out.print("Lütfen B tamsayisini giriniz: ");
        int B=scan.nextInt();
        System.out.println();
        System.out.println("A: "+A); // 10
        System.out.println("B: "+B); // 25
        System.out.println("--------HOKUS POKUS-------");


        // diyelimki A=10 B=25 girilmis olsun
        // biz System.out.print(A) diyince 25 System.out.print(B) diyince 10 yazdirsin istiyoruz

        int C=0;

        C=A; // C'ye A icin girilen degeri atadik
        // A=10 B=25 C=10

        A=B;
        // A=25 B=25 C=10

        B=C;
        // A=25 B=10 C=10

        System.out.println("A: "+A); // 25
        System.out.println("B: "+B); // 10










    }
}
