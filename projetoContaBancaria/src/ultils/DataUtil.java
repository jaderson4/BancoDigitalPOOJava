package ultils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String converterDateParaDateEHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        return  formatador.format(data);


    }
    public static String converterDateParaDate(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        return  formatador.format(data);


    }
    public static String converterDateParaHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");

        return  formatador.format(data);


    }
}

