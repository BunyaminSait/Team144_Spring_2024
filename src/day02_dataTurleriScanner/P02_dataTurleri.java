package day02_dataTurleriScanner;

public class P02_dataTurleri {

    public static void main(String[] args) {

        byte sayi1=23; // hafizada 8 bit yer kaplar

        short sayi2=23; // hafizada 16 bit yer kaplar

        int sayi3=23; // hafizada 32 bit yer kaplar

        long sayi4=23; // hafizada 64 bit yer kaplar


        char sayi5=80; // bu 80'in ASCII karsiligini atamis oldum
        char chr1='A';
        char chr2=' '; // space de bir karakterdir, *,&,% gibi
        // char chr3='80';

        String str1="Java candır"; // String data turu sadece metinsel ifade icerir

        String telNo="5555555"; // telefon numarasi String olarak tanimlanmistir
                                // uzerinde degisiklik yapilamaz, sadedce degistirilebilir.

        System.out.println("str1"); // str1 yazdirir
        System.out.println(str1); // Java candır yazdirir


        int x=128;
        int y=312;

        // iki sayinin toplamini yazdiralim
        System.out.println("Verilen iki sayının Toplamı: "+(x+y));
        
        
        int ogrenciNumara; // Primitive data turleri deger vermeden olusturulabilir ama deger atamadan kullanilamaz.
        
        ogrenciNumara=9720016;

        System.out.println("ogrenciNumara = " + ogrenciNumara);  // soutv

        double db1=20.368;
        double db2=6;

        System.out.println(db1/db2); // 3.3946666666666663

        float fl1=20.1f; // ondalilki sayi oldugunda sonuna "f"
        float fl2=5; // tam sayi oldugunda sonuna "f" gerekmez

        System.out.println(fl1/fl2); // 4.02
                
                






    }

}
