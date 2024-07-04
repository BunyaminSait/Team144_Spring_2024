package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P04_IfElseStatements {

    // Kullanicidan bir karakter girmesini isteyin
    // girilen karakterin büyük harf olup olmadığını kontrol edin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char girilenHarf=scan.next().charAt(0);

        System.out.println(girilenHarf);

        if (girilenHarf >= 'A' && girilenHarf <= 'Z'){
            System.out.println("Girilen harf buyuk harftir");
        } else {
            System.out.println("Girilen harf kucuk harftir"); // if (girilenHarf >= 'A' && girilenHarf <= 'Z') disindaki tum ihtimaller
        }

        // sorunun wrapper class ile cozumu

        if (Character.isUpperCase(girilenHarf)){
            System.out.println("Girilen harf buyuk harftir");
        } else {
            System.out.println("Girilen harf kucuk harftir");
        }

    }

}
