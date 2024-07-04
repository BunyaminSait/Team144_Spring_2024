package day08_StringManipulation;

public class P05_subString {
    public static void main(String[] args) {

        // Substring tek parametreli olunca girilen parametreden sona kadar gider
        // Substring cift parametreli ise girilen ilk parametreyi dahil olarak alip ikinci parametreye kadar gider
        // (3,4) girilirse sadece 3. karakteri alir. 4. karakter alinmaz
        // (3,7) girilirse 3,4,5,6. karakteri alir. 7. karakter alinmaz

        String str="Java Heyecandir.";
        System.out.println(str.substring(3,4)); // a
        // System.out.println(str.charAt(3)); // a
        System.out.println(str.substring(3,7)); // a He

        // ilk 3 karakteri yazdir
        System.out.println(str.substring(0,3)); // Jav

        // son 3 karakteri yazdir
        System.out.println(str.substring(str.length()-3)); // ir. // tek parametreli
        System.out.println(str.substring(str.length()-3,str.length())); // ir. // cift parametreli

        // System.out.println(str.substring(9,4)); // RTE IndexOutOfBoundsException

        // String Birlestirme: Concatenation
        String str1="Java ";
        String str2="Guzeldir";
        int sayi=12;

        System.out.println(str1+str2); // Java Guzeldir
        System.out.println(str1+sayi); // Java 12z
        System.out.println(str1.concat(str2)); // Java Guzeldir
        // System.out.println(str1.concat(sayi));
        // Concatenation methodu sadece string olanlari birlestirir

    }
}
