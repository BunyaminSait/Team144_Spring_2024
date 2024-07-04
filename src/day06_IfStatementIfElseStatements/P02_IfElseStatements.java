package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P02_IfElseStatements {

    // Girilen sayi cift ise "Cift Sayi" yazdirsin degil ise "Tek Sayi" yazdirsin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek Sayi");
        }

    }

}
