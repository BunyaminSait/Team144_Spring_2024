package day15_scopeArrays;

import java.util.Arrays;

public class P05_Arrays {
    public static void main(String[] args) {



    // verilen bir int array'deki elemanleri toplayip toplami yazdirin

    int [] arr = {15,23,65,98,17,35,46};
    int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Toplam = "+toplam);

        // array'deki tum elemanlarin degerini 5 azalt

        for (int i = 0; i < arr.length ; i++) {
            arr[i]-=5;
        }
        System.out.println(Arrays.toString(arr));

        // verilen arraydeki elemanlardan 15'dan buyuk olanlari 10 azalt
        // 15'den kucuk olanlari da 2 arttir

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>15){
                arr[i]-=10;
            }else{
                arr[i]+=2;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

}
