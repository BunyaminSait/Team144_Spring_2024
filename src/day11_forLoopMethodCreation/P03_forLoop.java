package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin
        // ve String'i Palindrome olup olmadigini yazdirin
        // palindrome : tersten yazilisi ayni olan, or : MADAM

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Palindrome olup olmadigini kontrol edeceginiz metni yaziniz: ");
        String metin=scan.nextLine();
        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiginiz metin bir Palindrome'dur");
        } else {
            System.out.println("Girdiginiz metin Palindrome degildir.");
        }
    }
}
