package day15_scopeArrays;

import java.util.Arrays;

public class P04_ArrayCreation {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        String [] str = {"a","b","c"};
        String [] kisi = {"Ali"};

        /*
        olustururken
        Data Turu - [] - array ismi = { uygun secilmis datalar }
         */

        System.out.println(arr); // [I@7c30a502
        System.out.println(str); // [Ljava.lang.String;@49e4cb85

        // Array data turundeki variable'lar direk YADIRILAMAZLAR
        // direk yazdirirsaniz size array'in referans degerini gosterir
        // Array'in icindeki elemanşari yazdirmak istersek toString methodundan faydalaniriz

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(str)); // [a, b, c]
        System.out.println(arr[3]); // 4

        arr[3]=128;
        System.out.println(Arrays.toString(arr));

        // arr[5]=101;
        // System.out.println(Arrays.toString(arr));

        // direkt olusturulan array'lerde eleman kac tane yazilmissa o kadar eleman alir
        // sonradan arttirliamazlar
        // 5 elemanli bir array'e 6. eleman eklenemez
        // 4 elemanli bir array 'e dondurulemezler

        int [] yeniArr = new int[5]; // [0, 0, 0, 0, 0] // Bos array olusturma ( default olan 0'lardan olusur )
        // yeniArr={12,21,35,50,63};
        int [] yeniArr2={4,6,78,9,13}; // direkt olusturuyor

        System.out.println(Arrays.toString(yeniArr2)); // [4, 6, 78, 9, 13]

        int [] yeniArr3={4,6,78,13};

        yeniArr2=yeniArr3;
        System.out.println(Arrays.toString(yeniArr2));

        System.out.println(arr.length);
        System.out.println(yeniArr3.length);

        System.out.println(Arrays.toString(yeniArr));
        System.out.println(yeniArr.length);

    }
}
