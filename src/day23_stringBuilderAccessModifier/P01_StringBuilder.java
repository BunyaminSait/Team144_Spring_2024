package day23_stringBuilderAccessModifier;

public class P01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Have a nice day");
        System.out.println(str);

        str.append("!");
        System.out.println(str);

        StringBuilder str2=new StringBuilder(7); // kapasitesi 7 olarak ayarlandi
        System.out.println(str2.append("have a nice day"));
        // kapasitesi 7'i asacak sekilde bir ekleme yapildigi icin
        // kapasite otomatik ((2 * eski kapasite) + 2) oldu
        System.out.println(str2);
        str2.replace(7,9,"WiseQuarter");
        System.out.println(str2.delete(5, 11));
        System.out.println(str2.insert(4, "Guzeldir"));


        StringBuilder str3=new StringBuilder("Java candir");
        System.out.println(str3); // Java candir
        System.out.println(str3.substring(5)); // candir
        System.out.println(str3); // Java candir

        System.out.println(str3.toString().toLowerCase()); // java candir
        System.out.println(str3); // Java candir
        System.out.println(str3.reverse()); // ridnac avaJ

    }
}
