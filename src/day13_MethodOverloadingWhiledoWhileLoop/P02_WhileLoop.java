package day13_MethodOverloadingWhiledoWhileLoop;

public class P02_WhileLoop {
    public static void main(String[] args) {

        // baslangic ve bitis degerleri belli olan ve artis miktari sabit olan donulerde
        // forloop kullanilir

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----- Ayni islemi While Loop ile Yapalim -----");

        int i=1;

        while (i<=10) {
            System.out.print(i+" ");
            i++;
        }

    }
}
