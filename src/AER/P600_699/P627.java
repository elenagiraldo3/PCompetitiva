package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class P627 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] caso = bf.readLine().split(" ");
        SimpleDateFormat format  = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = format.parse(caso[0]);
        Calendar calendario = new GregorianCalendar();
        int dia = Integer.parseInt(caso[3]);
        int mes = Integer.parseInt(caso[2]);
        int ano = Integer.parseInt(caso[1]);

        while (!Objects.equals(caso[0], "00/00/0000")) {
            int total_dias = dia + (28*mes) + (28*12*ano);
            calendario.setTime(fecha);
            calendario.add(Calendar.DAY_OF_YEAR, total_dias);
            System.out.println(format.format(calendario.getTime()));

            caso = bf.readLine().split(" ");
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(caso[0]);
            dia = Integer.parseInt(caso[3]);
            mes = Integer.parseInt(caso[2]);
            ano = Integer.parseInt(caso[1]);
        }

    }
}
