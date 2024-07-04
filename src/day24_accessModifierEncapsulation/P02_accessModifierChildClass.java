package day24_accessModifierEncapsulation;

import day23_stringBuilderAccessModifier.P03_AccessModifier;

public class P02_accessModifierChildClass extends P03_AccessModifier {
    public static void main(String[] args) {
        P02_accessModifierChildClass obj=new P02_accessModifierChildClass();

        System.out.println(obj.proSayi);
        obj.proSayi=100;

    }


}