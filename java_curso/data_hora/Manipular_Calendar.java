package java_curso.data_hora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Manipular_Calendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d)); // formatar a data d em sdf

        Calendar cal = Calendar.getInstance(); // objeto calendar
        cal.setTime(d); // coloca a d no cal
        cal.add(Calendar.HOUR_OF_DAY, 4); // adicionar 4 horas em d

        d = cal.getTime(); // atualizar a data com a adição de 4 horas
        System.out.println(sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE);  //pega o minuto no 
        int month = 1 + cal.get(Calendar.MONTH);  //pega o mês
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
