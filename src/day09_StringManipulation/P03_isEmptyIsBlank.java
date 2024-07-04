package day09_StringManipulation;

import java.util.stream.Stream;

public class P03_isEmptyIsBlank {
    public static void main(String[] args) {

        String str1="";
        String str2=" ";
        String str3="         ";
        String str4="     .    ";

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 1
        System.out.println(str3.length()); // 9
        System.out.println(str4.length()); // 10

        // isEmpty() methodu string ifadenin icinde herhangi bir sey var mi yok mu ona bakar
        // eger hicbir sey yoksa (lenght==0) ise true verir
        // bosluk dahil herhangi bir karakter varsa false verir

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(str3.isEmpty()); // false
        System.out.println(str4.isEmpty()); // false

        // isBlank() methodu icindeki bosluk karakteri haric bir sey var mi diye bakar

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // true
        System.out.println(str4.isBlank()); // false

    }
}
