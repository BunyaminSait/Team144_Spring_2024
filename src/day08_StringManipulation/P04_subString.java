package day08_StringManipulation;

public class P04_subString {
    public static void main(String[] args) {

        String str="Java Guzeldir.";

        System.out.println(str.substring(3)); // a Guzeldir.

        // son harfi substring ile bulmak
        System.out.println(str.substring(str.length()-1)); // .

        System.out.println(str.length()); // 14

        System.out.println(str.substring(20)); // Compile Time Error (CTE) vermez

        // java degerden kaynaklanan hatalari compile ederken gormez
        // run edince 20. index'e ulasmaya calisir bulamayinca Run Time Error (RTE)
        // IndexOutofBoundsException hatasi verir

    }
}
