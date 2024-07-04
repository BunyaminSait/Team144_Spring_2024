package day05_operatorsIfElseStatement;

public class P02_Concatenation {
    public static void main(String[] args) {

        /*
        String bir data turunun yanina + isareti ile bir baska data turunde variable eklenirse
        sonuc her zaman string olur. (String strong dur)
        Matematiksel islemler de iceriyorsa matematiksel islem onceliklerini dikkate alir.
         */

        String a="Hello";
        String b="World";
        int c=5;
        int d=3;

        System.out.println(a+b); // HelloWorld
        System.out.println(a+" "+b); // Hello World
        System.out.println(""+c+d); // 53
        System.out.println(" "+c+d); //  53
        System.out.println(""+c*d); // 15 ( bu 15 string olan 15 dir. parse etmeden mat islemlerinde kullanilamaz.
        // int f=Integer.parseInt(""+c*d);
        System.out.println(a+(c*d)); // Hello15
        System.out.println(a+b+c); // HelloWorld5

        // Soru Cozumu
        System.out.println("----- Soru Cozumu -----");
        String s1="Java";
        String s2=" "; // hiclik
        String s3="kolay";
        String s4=" "; // hiclik

        int x=4;
        int y=3;

        System.out.println(x*y+s2+s1+s4+s3); // 12 Java kolay
        System.out.println(x+y+s2+s1+s4+s3); // 7 Java kolay
        System.out.println(s1+s4+s3+s2+x+y); // Java kolay 43
        System.out.println(s4+y+x+s1+s2+s3); // 34Java kolay






    }
}
