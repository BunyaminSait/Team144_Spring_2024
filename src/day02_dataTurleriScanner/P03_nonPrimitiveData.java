package day02_dataTurleriScanner;

public class P03_nonPrimitiveData {

    public static void main(String[] args) {

        // primitive data turleri sadece deger alir
        // NonPrimitive data turu ise deger alabildigi gibi methodlar da alabilir.

        int sayi=20;
        System.out.println("sayi = " + sayi); // sayi = 20

        String str="Have a nice day";
        System.out.println("str = " + str); // Have a nice day


        System.out.println(str.toUpperCase()); // HAVE A NİCE DAY

        System.out.println(str.toLowerCase()); // have a nice day


        int numara=100, sicil=100, not=100;
        int numara2,sicil2,not2;

        numara2=258;


        byte num1=127;
        short num2=32767;


        System.out.println("Short Max Deger: "+Short.MAX_VALUE);
        System.out.println("Long Max Deger: "+Long.MAX_VALUE);
        System.out.println("int Max Deger: "+Integer.MAX_VALUE);
        System.out.println("byte Max Deger: "+Byte.MAX_VALUE);






    }
}
