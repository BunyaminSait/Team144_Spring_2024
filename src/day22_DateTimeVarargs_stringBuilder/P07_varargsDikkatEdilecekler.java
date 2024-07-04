package day22_DateTimeVarargs_stringBuilder;

public class P07_varargsDikkatEdilecekler {
    public static void main(String[] args) {

        /*
            varargs olayinda dikkat edilecek en onemli sey
                - varargs(int...) parametresi en sonda olmalidir
                - buna bagli olarakda iki veya daha fazla farkli varargs parametre olarak girilemez

         */



        islem(1,3,4,2,6,9,12,56,45);
    }

    private static void islem(int ... sayilar) {
        // varargs'da son elemani varargs parametresinden sonra giremeyiz
        int toplam=0;
        int lastElement=sayilar[sayilar.length-1];

        for (int i = 0; i < sayilar.length-1 ; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("Sonuc: "+(lastElement*toplam));

    }
}
