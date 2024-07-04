package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P07_IfElseStatements {
    /*
            Kullanicidan cinsiyetini ve yasini alin,
            Kadin, 60 yas ve uzeri ,
            Erkek 65 yas ve uzeri emekli olabilir.
             Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
            veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen cinsiyetitinizi giriniz (E/K) : ");
        char cinsiyet=scan.nextLine().toUpperCase().charAt(0);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas=scan.nextInt();

        if (cinsiyet=='K'){
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmek icin "+(60-yas)+" yil calismalisiniz");
            }
        } else {
            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmek icin "+(65-yas)+" yil calismalisiniz");
            }
        }

    }
}
