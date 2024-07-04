package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P03_StrinSiplitMethodu {
    public static void main(String[] args) {

        String str="Ey edip adanada pide ye, ye edip ye";

        // str.split(",");
        // islemi ile , baz alinarak str bolunur ve her bir elemani array'in elemani olan bir array olusturur
        System.out.println(Arrays.toString(str.split(",")));
        System.out.println(Arrays.toString(str.split(" ")));
        str=str.replace(" ","");
        str=str.replace(",","");
        System.out.println(Arrays.toString(str.split("")));



    }
}
