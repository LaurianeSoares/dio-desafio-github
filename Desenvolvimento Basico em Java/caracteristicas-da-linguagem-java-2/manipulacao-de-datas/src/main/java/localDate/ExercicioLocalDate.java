package localDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ExercicioLocalDate {

    public static void main(String[] args) {

        LocalDateTime dia_proposto =  LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        LocalDateTime futuro = dia_proposto.plusHours(13).plusMonths(6).plusYears(4);

        System.out.println(futuro);
    }
}
