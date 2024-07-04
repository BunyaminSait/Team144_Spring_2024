package day08_StringManipulation;

import java.util.Scanner;

public class P08_Soru {
    public static void main(String[] args) {

        /*
        SORU : kullanicidan bir mail alin
                - mail @ icermiyorsa “ gecersiz mail ”
                - mail @gmail.com icermiyorsa, “ mail gmail olmali ”
                - mail @gmail.com ile bitmiyorsa, “ mailde yazim hatasi var ”
                - mail adresi bosluk iceriyorsa " mail adresinizde bosluk birakmamalisiniz "
                - mail adresi sadece @gmail.com girilirse " mail adresinizi eksik girdiniz "
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi giriniz: ");
        String mail=scan.nextLine();

        // if-else
        // +++ tumunde hata yoksa mail girisi basarili diyebiliriz
        // --- ilk hatayi bulunca durur. Sonraki hatalari farkedemez

        // bagimsiz if ile yapabiliriz
        // +++ her hata bulunur.
        // --- hepsini kontrol ettiginde tamami basarili diye bir mesaj vermek icin aksiyon gerekir
        // flag(sayac) koymaliyiz

        // BAGIMSIZ if ile cozelim

        int flag=0; // flag(hataSayaci)

        // mail @ icermiyorsa "gecersiz mail"

        if (!mail.contains("@")){
            System.out.println("gecersiz mail, mail @ icermiyor");
            flag++;
        }

        // mail @gmail.com icermiyorsa, “mail gmail olmali”

        if (!mail.contains("@gmail.com")){
            System.out.println("mail adresiniz @gmail.com olmalidir");
            flag++;
        }

        // mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”

        if (!mail.endsWith("@gmail.com")){
            System.out.println("mail adresiniz gmail.com ile bitmelidir");
            flag++;
        }

        // mail adresi bosluk iceriyorsa "mail adresinizde bosluk birakmamalisiniz"

        if (mail.contains(" ")){
            System.out.println("mail adresinizde bosluk olmamalidir");
            flag++;
        }

        if (mail.equalsIgnoreCase("@gmail.com")){
            System.out.println("mail adresinizi eksik girdiniz");
            flag++;
        }

        if (flag==0){
            System.out.println("mail adresiniz basariyla ile kaydedildi");
        }


    }
}
