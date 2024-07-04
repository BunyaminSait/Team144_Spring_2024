package day27_InheritanceOverriding;

public class P05_childClass extends P04_parentClass {
    String isim="Child isim";
    String telefon="Child telefon";
    String adress="Child adress";
    int yas=60;
    int kilo=154;

    public void method1() {
        System.out.println("Child method - 1");
    }

    public void method3() {
        System.out.println("Child method - 2");
    }

    public void method4() {
        String adress="Method adress";
        int yas=40;
        System.out.println(yas); // 40 [scope]
        System.out.println(this.yas); // 60 [class instance]
        System.out.println(super.yas); // 44 [parent]

        System.out.println(adress); // Method adress
        System.out.println(this.adress); // Child adress
        // System.out.println(super.adress); // CTE
        method1(); // Child method - 1
        this.method1(); // Child method - 1
        super.method1(); // Parent method - 1
        super.method2(); // Parent method - 2
        this.method2(); // Parent method - 2 (child de yoksa parent ta var)
        this.method3(); // Child method - 2
        // super.method3(); // CTE

    }


    /*
         Javada herhangi bir scope'ta
         bir variable ya da method kullanmak isterseniz
         java asagidaki sira ile variable/method'u arar
         1-icinde olunan scope
         2-icinde olunan class (this)
         3-extends edilen parent (super)
     */

    public static void main(String[] args) {
        P05_childClass obj=new P05_childClass();
        obj.method4();


    }

}


