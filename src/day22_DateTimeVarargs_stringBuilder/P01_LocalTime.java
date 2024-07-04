package day22_DateTimeVarargs_stringBuilder;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class P01_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime istenenSaat = LocalTime.of(21,15,35);
        System.out.println(istenenSaat);
        LocalTime istenenUlkeSaati = LocalTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(istenenUlkeSaati);

        // Bir islemin ne kadar surdugunu bulmak icin baslangic ve bitis zamanlarini kaydedebiliriz

        LocalTime baslangic = LocalTime.now(); // baslarken zamani kayit ediyor

        for (int i = 0; i < 100000 ; i++) {
            for (int j = 0; j < 1000000 ; j++) {
                for (int k = 0; k < 3 ; k++) {

                }
            }
        }
        LocalTime bitis = LocalTime.now(); // islm bitince zamani kayit ediyor

        System.out.println(bitis.toSecondOfDay() - baslangic.toSecondOfDay()); // baslangic ile bitis arasindaki saniye farki
        System.out.println(bitis.toNanoOfDay()-baslangic.toNanoOfDay()); // baslangic ile bitis arasindaki nanosaniye farki

        System.out.println(baslangic.until(bitis, ChronoUnit.SECONDS));
        System.out.println(baslangic.until(bitis, ChronoUnit.NANOS));

        System.out.println(time.getHour());

        System.out.println(time.getHour()+"."+time.getMinute()+"."+time.getSecond());



    }
}
