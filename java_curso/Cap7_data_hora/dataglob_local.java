package java_curso.Cap7_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class dataglob_local {
    public static void main(String[] args) {

        // for (String s : ZoneId.getAvailableZoneIds())
        // System.out.println(s);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());       //coloca no dia do sistema
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //coloca no dia de portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());   //coloca no dia e horario do sistema
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //coloca no dia e horario de portugal

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());  //mostra o dia do mês
        System.out.println("d04 mês = " + d04.getMonthValue());  //mostra o mês
        System.out.println("d04 ano = " + d04.getYear());  //mostra o ano

        System.out.println("d05 hora = " + d05.getHour());  //mostra a hora
        System.out.println("d05 minutos = " + d05.getMinute()); // mostra os minutos

    }
}
