import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);     // Extraindo a informação dos minutos [42]
        int month = 1 + cal.get(Calendar.MONTH);    // Extraindo a informação de mês [5 + 1 = 6] OBS: Mês de Janeiro inicia-se como "0", pois isso acrecenta-se '1'
        cal.add(Calendar.HOUR_OF_DAY, 4);           // cal.add - Adiciona um valor a data específica, no exemplo (Calendar.Hour_of_day, 4) foi adicionado 4 horas do dia a data
        d = cal.getTime();

        System.out.println(sdf.format(d));
        System.out.println("Minutes: " + minutes);
        System.out.println("Months: " + month);

    }
}
