package day19_ConstructorCollStaticKeyword;

public class P02_Constructor {
    String isim="Ahmet";

    public static void main(String[] args) {
        P02_Constructor obj1=new P02_Constructor();

        System.out.println((obj1.isim)); // Ahmet
        obj1.isim="Hamza";
        System.out.println((obj1.isim)); // Hamza

        obj1.method2(); // static olmayan method calisti
        obj1.method1(); // static method calisti
                        // static member '' accessed vin instance reference
        method1(); // static method calisti

        System.out.println("--------------- esitligin sag tarafini alarak kullanalim -------------");

        System.out.println(new P02_Constructor().isim); // Ahmet
        new P02_Constructor().method2(); // static olmayan method calisti

        /*
        eger sadece new Constructor_name(); seklinde bir kullanimda
         

         */

        System.out.println("--------------- esitligin sol tarafini alarak kullanalim -------------");

        P02_Constructor obj2=null;

        // System.out.println(obj2.isim); // NullPointerException
        // obj2.method2(); // NullPointerException

        obj2.method1(); // static method calisti

        /*
        Constructor kullanmaz ve obj null olarak isaretlenirse
        normal bir objenin yaptiklarini yapamaz
        nullpointerexception verir

        statit olmayan methodlarda cagrilamaz
        fakat static methodlar bu null deger atanan obje ile cagrilabilir ve sorunsuz calisir
         */
    }

    public static void method1(){
        System.out.println("Static method calisti");
    }

    public void method2(){
        System.out.println("Static olmayan method calisti");
    }
}
