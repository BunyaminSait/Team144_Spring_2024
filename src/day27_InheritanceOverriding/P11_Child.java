package day27_InheritanceOverriding;

public class P11_Child extends P10_Parent{

    /*
        Biz ayni class'ta ayni signature'a sahip
        method olusturulamaz
        Bir methodu override edilebilmesi icin methodun
        child class'ta olusturulmasi gerekir
        Ayni zamanda parent class'taki signature ile ayni olmasi gerekir
     */

    public void method1(int a){
        // Method isminin ayni olmasi override icin yeterli degildir
        // Signature'larin da birebir ayni olmasi gerekir
    }

    @Override
    public void method1() {
        // override islemi olabilmesi icin
        // Access Modifier, Return Type da ayni olmalidir
    }
}
