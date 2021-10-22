package classeData;

import java.util.Date;
public class ExercicioLauriane {

    public static void main(String[] args) {

        Date dataNascimento = new Date(519879600000L);
        Date dataProposta = new Date(1273892400000L);

        boolean isAfter = dataNascimento.after(dataProposta);
        System.out.println(isAfter);

        boolean isBefore = dataNascimento.before(dataProposta);

        System.out.println(isBefore);
    }

}
