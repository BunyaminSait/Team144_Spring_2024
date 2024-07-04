package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P04_multiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr= {{1,2,3},{5,12},{15,23,69,100}};

        System.out.println(arr[1][0]); // 5
        System.out.println(arr[2]); // bunu yazdirirken array ref yazdirdi
        System.out.println(Arrays.toString(arr[2])); // 2. indexteki arayy'i yazdirir
        System.out.println(Arrays.deepToString(arr));

    }
}
