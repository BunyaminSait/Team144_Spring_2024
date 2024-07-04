package day16_ArraysMultidimensionalArrays;

import day15_scopeArrays.P08_ElemanSayisiniBulma;

import java.sql.SQLOutput;
import java.util.Arrays;

public class P02_ArrayElemanlariSiralama {
    public static void main(String[] args) {

        int [] intArr={1,12,3,8,25,136,41,9,17};
        String [] strArr={"Murat","Zeynep","Ali","Veli","Buse","Kasim","cuneyt","Galip","Mustafa"};

       // bize verilen bir array'in elemanlarini siralamak icin sort() methodu kullanilir
       // sort methdou naturel bir siralama yapar digit karakterleri kucukten buyuge dogru siralama yapar
       // metin iceren array'lerde ASCII karakterlerine karsilik gelen sayilara bakarak siralama yapar

        System.out.println("intArr ilk hali: "+Arrays.toString(intArr));
        System.out.println("strArr ilk hali: "+Arrays.toString(strArr));
        System.out.println("-------------------------------------------");
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        System.out.println("intArr sirali hali: "+Arrays.toString(intArr));
        // intArr sirali hali: [1, 3, 8, 9, 12, 17, 25, 41, 136]
        System.out.println("strArr sirahi hali: "+Arrays.toString(strArr));
        // strArr sirahi hali: [Ali, Buse, Galip, Kasim, Murat, Mustafa, Zeynep, cuneyt]
        // siralamayi ASCII degerine gore yapar


        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,136);
        // Aradiginiz eleman olan 136 verilen array'de 1 adet vardir
        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,325);
        // Aranan eleman verilen array'de bulunmamaktadir

        System.out.println(Arrays.binarySearch(intArr,136)); // 8. indexde dedi

        System.out.println(Arrays.binarySearch(intArr,13)); // -6
        System.out.println(Arrays.binarySearch(intArr,24)); // -7

        System.out.println(Arrays.binarySearch(strArr,"Murat")); // 4
        System.out.println(Arrays.binarySearch(strArr,"Veli")); // 6

        System.out.println(Arrays.binarySearch(strArr,"Ayse")); // -2


        int [] arr1={1,12,3,8,25,136,41,9,17};
        int [] arr2={1,12,3,8,25,136,41,9,17};

        System.out.println(Arrays.equals(arr1,arr2)); // true
    }
}
