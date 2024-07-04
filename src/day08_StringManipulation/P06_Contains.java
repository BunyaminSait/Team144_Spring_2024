package day08_StringManipulation;

public class P06_Contains {
    public static void main(String[] args) {

        String str="Java cok guzelmis";

        // contains () methodu birbaska stringin varligina bakar
        // varsa true yoksa false dondurur

        System.out.println(str.contains("ava")); // true
        System.out.println(str.contains("A")); // false
        System.out.println(str.contains("a")); // true

        // contains methodu case sensitive dir ( buyuk kucuk harf duyarli )

        System.out.println(str.contains("Java cok guzelmis")); // true
        System.out.println(str.contains("")); // true

        System.out.println(str.toUpperCase().contains("A")); // true

        // System.out.println(str.contains('a'));
        // contains methodu char var mi diye kontrol etmez!

    }
}
