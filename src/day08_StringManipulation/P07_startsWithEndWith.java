package day08_StringManipulation;

import java.sql.SQLOutput;

public class P07_startsWithEndWith {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        // bu cumle ne ile basliyor J - Jav - Java - Java gun - Hiclik

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java ")); // true
        System.out.println(str.startsWith("Java gun")); // true
        System.out.println(str.startsWith("Java gun gectikce guzellesiyor")); // true
        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("g",5)); // true
        System.out.println(str.startsWith("e",9)); // false

        System.out.println(str.endsWith("yor")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("Java gun gectikce guzellesiyor")); // true

    }
}
