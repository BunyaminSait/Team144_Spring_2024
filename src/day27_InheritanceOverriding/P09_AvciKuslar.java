package day27_InheritanceOverriding;

public class P09_AvciKuslar extends P08_Kuslar {
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";


    public static void main(String[] args) {

        P09_AvciKuslar kartal1=new P09_AvciKuslar();

        System.out.println(kartal1.beslenme); //AV et yerler
        System.out.println(kartal1.hareket); //AV ucarlar
        System.out.println(kartal1.gaga); //AV sivri gagali
        System.out.println(kartal1.pence); //AV pencelidir
        System.out.println(kartal1.solunum); //KUS akcigerle nefes alirlar
        System.out.println(kartal1.omur); //HAYV yasar ve olurler


        P08_Kuslar kartal2=new P09_AvciKuslar();
        System.out.println(kartal2.beslenme); //HAYV beslenirler
        System.out.println(kartal2.gaga); //KUS gagalari vardir
        System.out.println(kartal2.hareket); //HAYV hareket ederler
        System.out.println(kartal2.kanat); //KUS kanatlidirlar
        System.out.println(kartal2.omur); //HAYV yasar ve olurler
        System.out.println(kartal2.cogalma); //KUS yumurtayla cogalirlar


        P08_Kuslar kartal3=new P08_Kuslar();
        System.out.println(kartal3.gaga); //KUS gagalari vardir
        System.out.println(kartal3.kanat); //KUS kanatlidirlar
        System.out.println(kartal3.cogalma); //KUS yumurtayla cogalirlar
        // kartal3.pence() obje parent'a gider child'a gitmez
        System.out.println(kartal3.beslenme); //HAYV beslenirler
        System.out.println(kartal3.omur); //HAYV yasar ve olurler


        // P08_Kuslar kartal4=new P07_Hayvanlar(); parent'ta bulunan constructor child class'i data turu yaparak obje olusturulamaz

        P07_Hayvanlar kartal4=new P09_AvciKuslar();
        System.out.println(kartal4.solunum); //HAYV nefes alirlar


    }


}
