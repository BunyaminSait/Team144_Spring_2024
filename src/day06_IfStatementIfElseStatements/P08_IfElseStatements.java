package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P08_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan 2 adet vize 1 adet final notu alinsin
        Vize ortalamasinin %40'i Final notunun %60'ini alarak
        bir yil sonu notu olustursun

        Yil sonu notu: 90-100 arasi ise AA
                       85-90 arasi ise BA
                       80-85 arasi ise BB
                       75-80 arasi ise CB
                       65-75 arasi ise CC
                       60-65 arasi ise DC
                       50-60 arasi ise DD
                       50 alti ise FF yazdirsin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Vize Notlarinizi Sirasiyla giriniz");
        System.out.print("1.Vize: ");
        double vize1=scan.nextDouble();
        System.out.print("2.Vize: ");
        double vize2= scan.nextDouble();
        System.out.print("Final notunuzu giriniz: ");
        double finalNot=scan.nextDouble();

        double vizeOrt=(vize1+vize2)/2;
        double yilSonuNot=(vizeOrt*0.40+finalNot*0.60);
        if (yilSonuNot>100) {
            System.out.println("Yil sonu notu: " + 100);
        } else if (yilSonuNot<=0) {
            System.out.println("Yil sonu notu: "+0);
        } else {
            System.out.println("Yil sonu notu: "+yilSonuNot);
        }

        if (yilSonuNot>100 || yilSonuNot<0) {
            if (yilSonuNot>100) {
            System.out.println("haci sen naaptin 100 den buyuk ortalama mi olur");}
            if (yilSonuNot<0) {
                System.out.println("haci sen naaptin Eksi ortalama mi olur");
            }
        } else if (yilSonuNot>=90) {
            System.out.println("AA");
        } else if (yilSonuNot>=85) {
            System.out.println("BA");
        } else if (yilSonuNot>=80) {
            System.out.println("BB");
        } else if (yilSonuNot>=75) {
            System.out.println("CB");
        } else if (yilSonuNot>=65) {
            System.out.println("CC");
        } else if (yilSonuNot>=60) {
            System.out.println("DC");
        } else if (yilSonuNot>=50) {
            System.out.println("DD");
        } else { // bir ihtimaller zinciri kontrol edilirken tum ihtimaller bitince sadece ELSE yazdirilir
            System.out.println("FF");
        }

    }
}
