package br.com.alura.numeroExtenso;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroPorExtenso {

    public static void main(String[] args) {

        // conversor de numeros para palavras extensas,
        //com o formatoDeReal, a string é adicionado a palavra reais junto
        NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());

        BigDecimal valor = new BigDecimal("718023564897985.14");
        String valorPorExtenso = converter.toWords(valor.doubleValue());
        System.out.println(valorPorExtenso);
    }
}
