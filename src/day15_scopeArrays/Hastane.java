package day15_scopeArrays;

public class Hastane {
    /*
    Java'da objelerin ortak olan tum variable'lari static olarak olusturulur
    sadece bir obje icin gerekli olan variable'ler ise instance olusturulur

    Biz bir obje olusturdugumuzda Java o obje icin tum instance variable'larin bir kopyasini olusturur
    olusturulan objeyle instance variablelari iliskilendiriyor
    obje.InstancevariableIsmi seklinde olusan variable'lara ulasabiliriz
     */

    static String hastaneIsmi="Yıldız Hastanesi";
    static String hastaneAdres="Uskudar";
    static String hastaneBasHekim="Levent Bey";

    String personelIsmı="Isım atama Yapilmadi";
    String personelAdres="Adres atama Yapilmadi";
    int personelAge;
    String personelGorev="Gorev atamasi yapilmadi";

    public static void main(String[] args) {
        // bir personel ekleyelim
        Hastane personel01=new Hastane();
        // java tum instance variable'lardan birer kopyayi personel01 icin olusturdu

        System.out.println(personel01.personelIsmı);
        System.out.println(personel01.personelAdres);
        System.out.println(personel01.personelAge);
        System.out.println(personel01.personelGorev);

        personel01.personelIsmı="Fatma Demir";
        personel01.personelAdres="Ankara";
        personel01.personelAge=18;
        personel01.personelGorev="Hemsire";

        System.out.println("-------- atama sonrasi ---------");

        System.out.println(personel01.personelIsmı);
        System.out.println(personel01.personelAdres);
        System.out.println(personel01.personelAge);
        System.out.println(personel01.personelGorev);

        Hastane personel02=new Hastane(); // yeni bir personel olustur
        personel02.personelIsmı="Rana Ulker";
        personel02.personelAdres="Istanbul";
        personel02.personelAge=18;
        personel02.personelGorev="Hemsire";

        System.out.println(personel02.personelIsmı);

        Hastane personel03=new Hastane();
        Hastane personel04=new Hastane();
        Hastane personel05=new Hastane();
        Hastane personel06=new Hastane();



    }
}
