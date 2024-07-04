package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Scanner;

public class P03_WhileLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse toplami yazdirin.
        */

        Scanner scan=new Scanner(System.in);

        int toplam=0;

        while (toplam<500) {  // parantez icindeki kosul dogru oldugu muddetce dongu calisir
            System.out.println("Toplamlari bulunacak sayilari sirasiyla girip enter tusuna basiniz");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Toplam: "+toplam);

    }
}
