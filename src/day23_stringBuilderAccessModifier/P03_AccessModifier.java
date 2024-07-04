package day23_stringBuilderAccessModifier;

public class P03_AccessModifier {
    int defSayi=10; // Java access modifier olarak default atadi
    // default int sayi2=10; default gorunur olarak atanamaz
    private int privSayi=20;
    protected int proSayi=30;
    public int publicSayi=40;

    public static void main(String[] args) {
        P03_AccessModifier obj=new P03_AccessModifier();
        System.out.println(obj.privSayi);
        obj.privSayi=25;
        obj.methodPriv();

        // Default access modifier'a icinde bulundugu class ve package'dane ulasilabilir

        System.out.println(obj.defSayi);
        obj.defSayi=15;
        obj.methodDefault();

        System.out.println(obj.proSayi);
        obj.proSayi=35;
        obj.proMethod();

    }

    protected void proMethod() {
        System.out.println("Protected method calisti");
    }

    void methodDefault() {
        System.out.println("Default method calisti");
    }

    // Private access modifier'a sadece icinde bulundugu class'tan ulasilabilir
    // Private ----> pazxarlama birimi disindakiler goremez

    private void methodPriv() {
        System.out.println("Private method calisti");
    }
}
