package classeCalendar;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExercicioLaurianeCalendar {
    public static void main(String[] args) throws ParseException {

            Scanner s = new Scanner(System.in);
            System.out.println("Digite a data de vencimento: ");
            String dataRecebida = s.nextLine();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");




        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.setTime(df.parse(dataRecebida));

        dataVencimento.add(Calendar.DATE, 10);

        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        {
            dataVencimento.add(Calendar.DATE, 1);
            System.out.printf("Você pode pagar até: : %tF\n", dataVencimento);
        }
        // se for sábado
        else if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
        {
            dataVencimento.add(Calendar.DATE, 2);
            System.out.printf("Você pode pagar até: : %tF\n", dataVencimento);
        }
        else{
            System.out.printf("Você pode pagar até: : %tF\n", dataVencimento);
        }

    }
}


