package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P07_nestedForLoop {
    public static void main(String[] args) {

        /*

        Kullanicidan bir deger alip onu desen boyutu yapip baklava deseni olusturun
           *
          ***
         *****
        *******
         *****
          ***
           *

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Desen boyutu giriniz (Tek Sayi): ");
        int boyut=scan.nextInt();

        if (boyut%2==0){
            System.out.println("Lutfen tek sayi giriniz!");
        } else {

            int orta = (boyut / 2) + 1; // baklavanin ortasini bulduk

            // ust kisim
            for (int i = 1; i <= orta; i++) {
                for (int j = 1; j <= (orta - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // alt kisim
            for (int i = orta - 1; i >= 1; i--) {
                for (int j = 1; j <= (orta - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }





    }
}
