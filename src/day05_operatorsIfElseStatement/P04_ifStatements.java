package day05_operatorsIfElseStatement;

import java.util.Scanner;

public class P04_ifStatements {
    public static void main(String[] args) {

        int a=19;
        int b=13;

        if (a>b){
            System.out.println("a, b'den buyuk");
        }

        boolean sonuc=a<b;


        if (sonuc){
            System.out.println();
        }

        // bagimsiz if ile kosul sorguladigimizda sadece true durumlar icin bir islem atanir
        // bagimsiz if durumlarinda kosul false ise hicbir islem yapmaz.
        // false durumlarda if kullanilmaz

        // kullanicidan notunu isteyin 50 uzeri ise Tebrikler Dersi Gectiniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        double not=scan.nextDouble();

        // ilk if sorgumuz
        if (not>=50){
            System.out.println("Tebrikler Dersi Gectiniz");
        }

        // ikinci if sorgumuz
        if (not<50){
            System.out.println("Maalesef Ders Tekrari");
        }

        // ilk ve ikinci if sorgulari tamamen birbirinden bagimsizdir. Birbirlerinin sorgularindan etkilenmezler




    }
}
