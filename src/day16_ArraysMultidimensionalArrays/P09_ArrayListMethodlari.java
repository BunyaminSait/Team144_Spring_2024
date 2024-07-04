package day16_ArraysMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P09_ArrayListMethodlari {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        // bir listin eleman sayisini bulmak icin kullanilan methode .size()
        System.out.println(sayilar.size());

        // bir list'in dolu mu bos mu oldugunu .isEmpty() ile kontrol ederiz
        System.out.println(sayilar.isEmpty()); // true

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(23);
        sayilar.add(188);
        sayilar.add(541);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        // list icinde bir eleman var mi diye bakmak icin .contains() kullanilir

        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.contains(23));
        System.out.println(sayilar.contains(33));

        // list icindeki herhangi bir elemani kullanmak icin .get() methodu kullanilir
        System.out.println(sayilar.get(0));
        int kullanici3No= sayilar.get(2);
        System.out.println("kullanici3No = " + kullanici3No);

        // list elemanlarindan herhangi birini silmek isterseniz .remove() methodu kullanilir
        // onun ya index numarasini () icine girmeniz ya da once bir variable a wrapper class ile ekleyip
        // sonra o variable'i silmelisiniz

        /*
        int k1=23;
        sayilar.remove(k1);
        System.out.println(sayilar);

         */

        System.out.println(sayilar.remove(0));

        List <String> kelimeler = new ArrayList<>();
        kelimeler.add("Sakla");
        kelimeler.add("samani");
        kelimeler.add("gelir");
        kelimeler.add("zamani");

        System.out.println(kelimeler);
        kelimeler.remove("samani");
        System.out.println(kelimeler.remove(1));
        System.out.println(kelimeler);

        System.out.println("kelimelerin boyutu = " + kelimeler.size());
        System.out.println("sayilarin boyutu = " + sayilar.size());

        kelimeler.clear(); // icerigi toptan siler
        System.out.println(kelimeler.size());
        System.out.println(kelimeler);

        kelimeler.add("Murat"); // index: 0
        kelimeler.add("Levent"); // index: 1
        kelimeler.add("Fatma"); // index: 2
        kelimeler.add("Rana"); // index: 3
        kelimeler.add("Murat"); // index: 4
        kelimeler.add("Mustafa"); // index: 5

        // bir elementin hangi indexte oldugunu anlamak icin indexOf() ve lastindexOf() kullanilir

        System.out.println(kelimeler.indexOf("Murat"));
        System.out.println(kelimeler.lastIndexOf("Murat"));
        System.out.println(kelimeler.indexOf("Rana"));
        System.out.println(kelimeler.lastIndexOf("Rana"));

        // list'in bir bolumunu almak icin subList() methodu ile yapilir
        System.out.println(kelimeler.subList(1,3)); // index'i 1 den 3 e kadar olanlar

    }
}
