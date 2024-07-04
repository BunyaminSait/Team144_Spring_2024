package day08_StringManipulation;

public class P02_Equals {
    public static void main(String[] args) {

        String s1="Ali";
        String s2="ali";
        String s3="ALI";
        String s4="ALi";
        String s5="Ali ";
        String s6="Ali";
        String s7="aLi";
        // equals methodu ile iki string deger karsilastirilirken case sensitive olarak bakilir
        // metinlerin ayni olup olmadigina bakar
        System.out.println(s1.equals(s2)); // Ali ---> ali =====> false
        System.out.println(s3.equals(s2)); // ALI ---> ali =====> false
        System.out.println(s3.equals(s4)); // ALI ---> ALi =====> false
        System.out.println(s1.equals(s5)); // Ali ---> Ali  =====> false
        System.out.println(s1.equals(s6)); // Ali ---> Ali =====> true
        System.out.println("\t==============================================================");
        System.out.println(s1.equalsIgnoreCase(s2));    // true
        System.out.println(s3.equalsIgnoreCase(s2));    // true
        System.out.println(s3.equalsIgnoreCase(s4));    // true
        System.out.println(s1.equalsIgnoreCase(s5));    // bosluk nedeniyle false verir
        System.out.println(s1.equalsIgnoreCase(s6));    // true

    }
}
