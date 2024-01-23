import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args){

        LocalTime t = LocalTime.now(ZoneId.of("Europe/Kyiv"));
        System.out.println(t);

        Instant i = Instant.now();
        System.out.println(i);

        for(String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }


    }
}
