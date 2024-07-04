package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P03_IfElseStatements {

    // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    // ucgen eskenar ise "eskenar ucgen" yazdirin.
    // Degilse "eskenar ucgen degil" yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz: ");
        System.out.print("Ilk Kenar: ");
        int kenar1 = scan.nextInt();
        System.out.print("Ikinci Kenar: ");
        int kenar2 = scan.nextInt();
        System.out.print("Ucuncu Kenar: ");
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Kenar olculerini girdiginiz ucgen bir eskenar ucgendir.");
        } else {
            System.out.println("Kenar olculerini girdiginiz ucgen eskenar ucgen degildir.");
        }


    }

}
