package day15_scopeArrays;

import java.util.Arrays;

public class P09_ArrayeElemanEkleme {
    public static void main(String[] args) {

        // Verilen bir array'e
        // istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array'e yeni degeri atayin.

        int[]arr={2,5,9,12,53};
        System.out.println("arr: "+Arrays.toString(arr));

        int[]mrr={5,9,12,53};
        System.out.println("mrr: "+Arrays.toString(mrr));

        arr=mrr;
        System.out.println("arr: "+Arrays.toString(arr));

        System.out.println("Array'e manuel olarak eleman ekledik");

        arr=arrayElemanEkleme(arr,26);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] arrayElemanEkleme(int[] eskiArr, int eklenecekEleman) {
        int [] yeniArr=new int[eskiArr.length+1];
        for (int i = 0; i < eskiArr.length ; i++) {
            yeniArr[i]=eskiArr[i];

        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;
        return yeniArr;
    }
}
