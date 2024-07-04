package day09_StringManipulation;

public class P05_Replace {
    public static void main(String[] args) {

        String str="Java Candir. Selenium Heyecandir";
        System.out.println(str);
        str=str.replace('a','A');
        System.out.println(str);

        str=str.replace("CAndir.","Kolaydir.");
        System.out.println(str);

        str="Java Candir. Selenium Heyecandir";

        // sadece ilk a harfini A yapsin

        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str);

        String str2="Ali git bakkaldan %3, ekmek al Gel!";

        


    }
}
