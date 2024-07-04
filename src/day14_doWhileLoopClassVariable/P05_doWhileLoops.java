package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P05_doWhileLoops {
    public static void main(String[] args) {

        // Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        // sifredeki hatalari yazdirin.
        // Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        // gecerli sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        //     - Sifre kucuk harf icermelidir
        //     - Sifre buyuk harf icermelidir
        //     - Sifre ozel karakter icermelidir
        //     - Sifre en az 8 karakter olmalidir.

        Scanner scan=new Scanner(System.in);
        String sifre="";
        int flag=0;

        do {
            System.out.print("Lutfen bir sifre giriniz: ");
            sifre=scan.nextLine();

            for (int i = 0; i < sifre.length() ; i++) {

                if (!(sifre.charAt(i)>=97 && sifre.charAt(i)<=122)) { // 'a' yerine 97 yazilabilir. Bu onun ASCII tablosundaki karsiligidir
                    System.out.println("Sifrenizde kucuk harf olmalidir");
                    flag++;
                }
                if (!(sifre.charAt(i)>=65 && sifre.charAt(i)<=90)) { // ASCII tablosunda 65 buyuk A'dır ('a'+32='A')
                    System.out.println("Sifrenizde buyuk harf olmalidir");
                    flag++;
                }
                if (!(sifre.charAt(i)>=32 && sifre.charAt(i)<=64)) {
                    System.out.println("Sifrenizde ozel karakter olmalidir");
                    flag++;
                }
                if (sifre.length()<8){
                    System.out.println("Sifreniz 8 karakterden az olamaz!");
                    flag++;
                }
                break;
            }
            System.out.println(flag);
            if (flag==0){
                System.out.println("Sifreniz basariyla kaydedildi"+" = "+sifre);
            }
        }while (flag!=0);



    }
}
