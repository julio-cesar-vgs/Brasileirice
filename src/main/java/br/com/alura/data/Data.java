package br.com.alura.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);


        // DateTimeFormatter.ofPattern, classe para formatar datas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(formatter));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        // DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"), forma de padronizar a hora
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(agora.format(horaFormatada));
        // formatador curto
        DateTimeFormatter formatadorCurto =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(agora.format(formatadorCurto));

        //Formatador de datas com o padrao brasileiro
        DateTimeFormatter formatadorCurtoLocale =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
        System.out.println(agora.format(formatadorCurtoLocale));


    }
}
