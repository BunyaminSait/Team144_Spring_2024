package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P07_bababa {
    public static void main(String[] args) {

        /*

                Kullaniciya
                * 1 = Gunde kac bardak cay ictigini,
                * 2 = Her bardak icin kac kup seker kullandigini sorup;
                kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
                * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
                 (1 kup seker = 2.77 gr)

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("gunde kac bardak cay iciyon: ");
        int bardak=scan.nextInt();

        if (bardak == 0){
            System.out.println("yanlis deger");
        } else if (bardak < 0) {
            System.out.println("yanlis deger girdin");
        }
        else {
            System.out.print("kac seker atiyon: ");
            double seker = scan.nextInt();
            if (seker == 0) {
                System.out.println("adamsin");
            } else {
                if (seker>10){
                    System.out.println("mal misin");
                }
                double yilliks = ((seker * bardak) * 365) * 2.77;
                double dyilliks = (yilliks * 40) * 2.77;
                System.out.println("yillik seker (kg): " + yilliks);
                System.out.println("40 yillik seker (kg): " + dyilliks);
            }






        }


    }
}
