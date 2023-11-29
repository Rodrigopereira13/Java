package java_curso.Cap7_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class duracao_data_hora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekDate = d04.minusDays(7);    //subtrai 7 dias de d04
        LocalDate nextWeekDate = d04.plusDays(7);        //aumenta 7 diasa de d04

        LocalDateTime pastWeekLocalDate = d05.minusDays(7);  //subtrai 7 dias de d05 que muda pq é localdatetime que contem as horas
        LocalDateTime nextWeekLocalDate = d05.plusDays(7);   //aumenta 7 dias de d05 que muda pq é localdatetime que contem as horas

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);  //subtrai 7 dias de d05 de Instant 
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);   //aumenta 7 dias de d05 de Instant 

        System.out.println("pastWeekDate = " + pastWeekDate);
        System.out.println("nextWeekDate = " + nextWeekDate);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());  //duração de uma data para outra
        Duration t2 = Duration.between(pastWeekLocalDate, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());  //duração de uma data para outra transformada em dias
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
