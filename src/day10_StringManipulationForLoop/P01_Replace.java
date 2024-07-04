package day10_StringManipulationForLoop;

public class P01_Replace {
    public static void main(String[] args) {

        String str="Java Candir, Gerisi Heyecandir";

        System.out.println(str.replace("a", "A")); // JAvA CAndir, Gerisi HeyecAndir
        // CharSequence: charlarin bir araya gelmesi ile olusan degerdir. Charlar birlesirse String olur


        System.out.println(str.replace('a','A')); // JAvA CAndir, Gerisi HeyecAndir

        System.out.println(str.replace("Gerisi","Selenium")); // Java Candir, Selenium Heyecandir

        System.out.println(str);

        str="%,& Ahmet git 3 ekmek al!"; // str icin yeni bir atama yaptik
        System.out.println(str); // str nin yeni halini yazdiralim
        System.out.println(str.replaceFirst("\\w","Me")); // %,& Mehmet git 3 ekmek al!

        System.out.println(str.replaceFirst("\\d","15")); // %,& Ahmet git 15 ekmek al!

    }
}
