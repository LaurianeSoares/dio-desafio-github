package localDate;
import java.time.LocalDate;
public class Exercicio12 {

        public static void main(String[] args) {

            LocalDate hoje = LocalDate.now();

            LocalDate ontem = hoje.minusDays(1);

            System.out.println(hoje);
            // 2019-07-14

            System.out.println(ontem);
            // 2019-07-13

        }
    }
