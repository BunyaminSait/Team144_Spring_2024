package day22_DateTimeVarargs_stringBuilder;

public class P05_varargs {
    public static void main(String[] args) {

        // verilen sayilarin icerisindeki cift sayilarin toplamini veren bir method yaziniz
        tekSayilariTopla(12,25,24,38,46,19,108,28,34,128);

    }
                                    // int [] sayilar
    public static void tekSayilariTopla(int ... sayilar) {
        int toplam=0;
        for (int m:sayilar
            ) {
            if (m%2==0){
                toplam+=m;
            }
        }
        System.out.println("Cift sayilarin toplami: "+toplam);
    }
}
