package day12_Methods;

public class P07_faktoriyel {

    /*
        Verilen bir pozitif tam sayinin
        faktoriyel degerini hesaplayip yazdiran
        bir method olusturun
        input 5 output 5!=120
     */
    public static void main(String[] args) {
        faktoriyelDegeriYazdir(10);
        faktoriyelDegeriYazdir(15);
    }

    public static void faktoriyelDegeriYazdir(int sayi) {
        int sonuc=1;

        for (int i = sayi; i >=1 ; i--) {
            sonuc*=i;
        }
        System.out.println(sayi+"!="+sonuc);
    }
}
