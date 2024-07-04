package day16_ArraysMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P08_arrayLists {

    // Arrayler yeni eleman eklemeye izin vermemesi nedeniyle esnek calismaya kisitlar
    // Bu nedenle array ile liste hazirlamak zordur.
    // Bu durumda arraylerin alt yapisini kullanan List'ler tercih edilir
    // List'ler eleman eklemeye ve boyut degistirmeye izin verirler

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>(); // List bir interface'dir ve interface'lerden ob
            System.out.println(sayilar); // []

            sayilar.add(128);
            sayilar.add(886);
            sayilar.add(712);

        System.out.println(sayilar); // [128,886,712]

        ArrayList<Integer> liste2=new ArrayList<>();

        liste2.add(9901);
        liste2.add(9902);
        liste2.add(9903);
        liste2.add(9904);
        liste2.add(9905);
        liste2.add(9905);

        System.out.println(liste2);

        liste2.add(0,9900);
        System.out.println(liste2);


        sayilar.addAll(liste2);
        sayilar.addAll(2,liste2);
        System.out.println(sayilar);
    }
}
