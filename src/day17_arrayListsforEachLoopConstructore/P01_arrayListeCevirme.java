package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_arrayListeCevirme {
    public static void main(String[] args) {

        Integer [] arr={3,4,5,6,2,1,8,7,9,12,45,68,96,75,23};

        // Array olarak verilen arr'yi liste cevirmek istiyoruz
        // bu 3 farkli yolla yapilabilir

        // 1 - forloop ile

        List<Integer> listARR=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            listARR.add(arr[i]);
        }

        System.out.println("1. islem sonucu: "+listARR); // [3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]

        listARR.add(20);
        listARR.remove(3);
        System.out.println("1. islem sonucu: "+listARR); // [3, 4, 5, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23, 20]

        // 2 - asList() methodu ile
        // array elemanlarini bu method ile tek tek ekleterek

        List<Integer> listARR2=new ArrayList<>(Arrays.asList(3,4,5,6,2,1,8,7,9,12,45,68,96,75,23));

        System.out.println("2. islem sonucu: "+listARR2); // [3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]

        listARR2.add(20);
        listARR2.remove(3);
        System.out.println("2. islem sonucu: "+listARR2); // [3, 4, 5, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23, 20]

        // 3 - direkt arr'yi .asList(arr) methoduyla liste cevirmek
            // ancak burada iki dezavantaj vardir
            // - bu sekilde yapilirsa .add ve .remove kullanilamaz kullanilirsa RTE verir
            // - java array ile array list'i ozdeslestirir ve birinde yapilan degisiklik digerini etkiler

        List<Integer> listARR3 = Arrays.asList(arr);

        System.out.println("3. islem sonucu: "+listARR3);

        // listARR3.add(20); // UnsupportedOperationException
        // listARR3.remove(3); // UnsupportedOperationException
        System.out.println("3. islem sonucu: "+listARR3);

        arr[8]=1258;
        System.out.println("arr degisince onu kullanarak olusturulan list de degisir\n"+listARR3);



    }
}
