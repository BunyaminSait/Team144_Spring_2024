package day18_Constructor;

    /*
        Biz bir class oluşturunca Java hemen default Constructor oluşturur
        Bunun sebebi bizim oluştaracağımz her objeye değer atayabilmek
        için constructor çalışması şarttır.

        Default Constructor özellekiler
            - Görünmezdir
            - parametresizdir
            - public
            - body'sinde kod yoktur
            - Class ismi ile birebir aynı isimdedir.

        Eğer biz objenin bazı özelliklerini baştan tanımlamak istersek
        o özellikleri constructor'a pametre olarak yüklememiz gerekir.
        Bu yükleme constructor çalıştığında direk atama yapılmasını sağlar

        Fakat dikkat edilmesi gereken en önemli şeylerden birisi
        ister parametresiz ister parametreli görünür bir constructor oluştuğu anda
        DEFAULT CONSTRUCTOR ölür(java default constructor'ı siler)

        Deafult cosntructor ile oluşturuan objelerin çalışmaya devam edebilmesi
        biz class ismi ile birebir aynı bir parametresiz constructor oluştururuz.
        Bu default constructor değildir. Fakat onun işini yapar

        Parametre ismi instance variable ile aynı değilse ataa yapılabilir
            - marka=mrk   model=mdl

        Parametre ismi ile instance varable ismi aynı ise scope nedeniyle
        Java ilk olarak class level'daki variable'lara bakmaz
        bu durumda da obje oluşturunca değer ataması yapamaz
        varibale basına this. koyarak bu variable'ın
        class levelda tanımlanan instance varaiable olduğunu söylüyorum

        this.  kullanılırsa java scope'a değil class level'a bakıyor
         */

public class P01_Car {

    String marka="Belirlenmedi";
    String model;
    int yil;
    int fiyat;

    P01_Car(){
        // parametreli bir constructor asagidaki gibi olusturulunca default öldü
        // onun yaptigi isi yapacak onunla ayni olan parametresiz constructor olustururuz
            // - class ismi ile birebir ayni
            // - kod icermeyen bir scope a sahip
        // bu defaul constructor degildir sadece ona benzer
    }

    P01_Car(String mrk, String mdl){
        marka=mrk;
        model=mdl;
    }

    P01_Car(String mrk, String mdl, int yl){
        marka=mrk;
        model=mdl;
        yil=yl;
    }

    P01_Car(String marka, String model, int yil, int fiyat){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }

    P01_Car(String model){
        this.model=model;
    }

    // Objenin yazdirmak istedigimiz ozelliklerini
    // toplu bir sekilde yazdirabilmek icin toString() methodu kullanilir

    // sag tik --> generate --> toString tiklanip
    // ozellikler secilir --> ok
    @Override
    public String toString() {
        return "Arac Bilgileri: \n" +
                "marka= " + marka + '\n' +
                "model= " + model + '\n' +
                "yil= " + yil + '\n' +
                "fiyat= " + fiyat ;
    }
}
