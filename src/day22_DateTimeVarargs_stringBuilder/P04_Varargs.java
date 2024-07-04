package day22_DateTimeVarargs_stringBuilder;

public class P04_Varargs {

    // varargs : variety of arguments demek
    /*
        yeni bir method olustururken gonderecegimiz argument sayisi degisken ise
        farkli methodlar olusturmak yerine
        parametreye varargs atamasi yapilir

        varargs array alt yapisini kullanir
        yani girilen tum argumentsleri bir array icine koyar
     */

    public static void main(String[] args) {

        toplama(3,2); // 5
        toplama(3,2,6); // 11
        toplama(3,2,6,9,5); // 25
        toplama(12,25,36,32,5,0,1,2,5,9,36,78,159); // 400

        carpma(12,5,36); // 2160


    }

    public static void carpma(int ... yeniSayilar) {
        int carpim = 1;
        for (int each:yeniSayilar
            ) {
            carpim*=each;
        }
        System.out.println("Carpim: "+carpim);
    }

    public static void toplama(int ... sayilar) {
        // sayilar bir array ve icinde parametre alarak girilen argumentler var
        // array in tum elemanlarini toplamak istersek
        int toplam=0;
        for (int each:sayilar
            ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }

    // private static void toplama(int a, int b) {
    //     System.out.println("Toplam: "+(a+b));
    // }
    // private static void toplama(int a, int b,int c) {
    //     System.out.println("Toplam: " + (a + b + c));
    // }
    // private static void toplama(int a, int b,int c,int d,int e) {
    //     System.out.println("Toplam: " + (a + b + c + d + e));
    // }
}

