package day02_dataTurleriScanner;

public class P04_isimVermeKurallari {
    public static void main(String[] args) {

        int NOT=25;
        int not=35;
        int nOT=55;
        int NoT=100;

        // variable isimleri case sensitive'dir. Yani buyuk kucuk harf duyarlidir

        System.out.println(NOT); // 25
        System.out.println(NoT); // 100


        String isminIlkHarfi="M"; // camelCase : ilk harf kucuk, sonraki kelimelerin sadece ilk harfi buyuk

        String ISMINILKHARFI="S";

        // camelCase yazimi gibi kurallar bir zorunluluk degildir. Bir teamul diyebilirsiniz.
        // Bunlara uymak bizim tecrubemizi gosterir.


        int benimIsmim=15; // burada isimlendirmeye uymayan bir durum soz konusu degil.
                           // Fakat cleancode kavramina aykiridir. isim verilirken degerle eslesen isimlendirme olmalidir

        int benimYasim=15;




    }
}
