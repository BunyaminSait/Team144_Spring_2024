package day09_StringManipulation;

public class P01_IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        System.out.println(str.contains("Ali"));
        System.out.println(str.startsWith("Ali"));
        System.out.println(str.endsWith("at"));
        System.out.println("---------------------");

        // indexof() methodu herhangi bir ifade icinde gecen bir harf ya da harflerin
        // veyahut da bir kelimenin ilk index'ini verir

        System.out.println(str.length());
        System.out.println(str.indexOf("Ali")); // 0
        System.out.println(str.indexOf("ali")); // 16
        System.out.println(str.indexOf("a")); // 9
        System.out.println(str.indexOf("top")); // 4
        System.out.println(str.indexOf("levent")); // -1
        System.out.println(str.indexOf('i')); // 2
        System.out.println(str.indexOf(105)); // 2 (105 ascii tablosunda i ye karsilik gelir dolayisiyla i arar)
        System.out.println(str.indexOf("at")); // 9
        System.out.println(str.indexOf("at",14)); // 20

        // lastIndexOf() methodu aranan harf, karakter veya kelimeyi son idexten baslangica dogru bakar
        // fakat bulunca bastan index sayar

        str="Ali topu at, at ali at";
        System.out.println(str.indexOf("at")); // 9
        System.out.println(str.lastIndexOf("at")); // 20

        System.out.println(str.lastIndexOf("at", 14)); // 13 // 14. index'ten geriye dogru bak
        System.out.println(str.lastIndexOf("ali", 10)); // -1 // 10. index'ten geriye dogru bak



    }
}
