package day22_DateTimeVarargs_stringBuilder;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class P02_localDate {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        LocalDate istenenTarih = LocalDate.of(2005,03,22);
        System.out.println(istenenTarih);

        LocalDate dogumGunu = LocalDate.of(2002,11,18);

        LocalDate istenenUlkeTarihi = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(istenenUlkeTarihi);

        System.out.println(bugun.getDayOfMonth()); // ayin 3. gunu
        System.out.println(bugun.getDayOfWeek()); // haftanin pazartesi gunu
        System.out.println(bugun.getDayOfYear()); // yilin 155. gunu

        System.out.println(bugun.getEra()); // CE milattan sonra
        System.out.println(bugun.getChronology()); // ISO (pzrt-sali-cars... bicim ifadesi)

        System.out.println(bugun.plusYears(5).plusMonths(3).plusDays(14));

        System.out.println(bugun.withMonth(10).withYear(2025)); // ay ve yili belirledik

        System.out.println(bugun.isLeapYear()); // artik yil olup olmadigina bakar
        System.out.println(bugun.lengthOfYear()); // 366 yildaki gun sayisi
        System.out.println(bugun.withYear(2025).isLeapYear()); // girilen yilin artik yil olup olmadigina bakar
        System.out.println(bugun.lengthOfMonth()); // 30 aydaki gun sayisi
        System.out.println(bugun.withMonth(7).lengthOfMonth()); // girilen aydaki gun sayisi

        System.out.println(dogumGunu.until(bugun)); // P21Y6M160
        System.out.println(dogumGunu.until(bugun).getYears()); // 21

        // eger iki tarih arasini bir periyot olarak kayit etmek istersek
        // Period class i kullanilir

        Period period = Period.between(dogumGunu,bugun);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


    }
}
