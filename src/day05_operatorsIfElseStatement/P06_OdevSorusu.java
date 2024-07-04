package day05_operatorsIfElseStatement;

import java.util.Scanner;

public class P06_OdevSorusu {

    /*
    Soru:

    Kullanicidan yasini alip
    yasi 18 ve uzeri ise "Ehliyet Basvurunuz Kabul edilmistir."
    yasi 18'den kucuk ise  "Ehliyet Basvurunuz reddedilmistir. ... yil sonra basvurabilirsiniz"
    ... yerine kac yil sonra 18 olacaksa onu yazdirin
    Not: Bagimsiz if'ler kullanin
     */



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen yasinizi yazin: ");
        int yas= scan.nextInt();
        if (yas>=18){
            System.out.println("Ehliyet Basvurunuz Kabul edilmistir.");
        }
        if (yas<18){
            System.out.println("Ehliyet Basvurunuz reddedilmistir. "+(18-yas)+"  yil sonra basvurabilirsiniz");
        }

    }

}
