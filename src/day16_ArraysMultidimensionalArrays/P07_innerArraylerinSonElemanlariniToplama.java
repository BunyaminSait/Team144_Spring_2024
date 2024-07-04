package day16_ArraysMultidimensionalArrays;

public class P07_innerArraylerinSonElemanlariniToplama {
    public static void main(String[] args) {

        // Soru: verilen 2 katli bir array'de bulunan inner arraylerin son elemanlarini topla
        //       sonucu yazdiran bir method olustur

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};

        sonElemanlariTopla(arr);

    }

    public static void sonElemanlariTopla(int[][] arr) {
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];
        }
        System.out.println("Son elemanlarin toplami: "+toplam);
    }
}
