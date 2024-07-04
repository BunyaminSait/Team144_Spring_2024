package day15_scopeArrays;

public class Hemsire {
    public static void main(String[] args) {
        System.out.println("1-"+Hastane.hastaneIsmi);
        System.out.println("----- Personel Isım Listesi -----");
        Hastane personel01=new Hastane();
        personel01.personelIsmı="Murat Babayigit";
        personel01.personelGorev="Hemsir";
        personel01.personelAge=44;

    }
}
