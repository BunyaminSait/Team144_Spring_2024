package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {

        /*
        Soru: kullaniciya haftanin kacinci gununde oldugunu sorup
              o gunun ismini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bugun haftanin kacinci gunundeyiz? :");
        int dayNumber= scan.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Haftada 7 gun vardir. Yanlis bir deger girdiniz!");
        }

    }
}
