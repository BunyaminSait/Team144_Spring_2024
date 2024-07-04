package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin ve String'i tersten yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scan.nextLine();
        String tersCumle="";
        /*
        String str="Java ne guzel bir dil";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(20,21));
        System.out.println(str.substring(19,20));
        */

        /*
        java ne guzel bir dil
        lid rib lezug en avaj
         */

        for (int i = cumle.length(); i >=1 ; i--) {
            tersCumle+=cumle.substring(i-1,i);
        }
        System.out.println(tersCumle);
    }
}
