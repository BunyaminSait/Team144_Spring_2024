package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P01_ArrayinElemanlariniSagaKaydir {
    public static void main(String[] args) {

        /*
             Verilen bir array'deki tum elementleri bir saga kaydiirp
             sondaki elementi de basa tasiyacak bir method olusturun
             array'i yeni haliyle kaydedin ve yazdirin
             Orn: input: [4,5,6,7] arrayin son hali : [7,4,5,6]
         */

        int [] arr={1,3,5,10,9,21}; // 21,1,3,5,10,9

        System.out.println(Arrays.toString(elemanlariSagaKaydir(arr)));

    }

    private static int[] elemanlariSagaKaydir(int[] arr) {
        int [] yeniArr=new int[arr.length];
            yeniArr[0]=arr[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            yeniArr[i+1]=arr[i];

        }
        arr=yeniArr;
        return arr;
    }
}
