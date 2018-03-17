package br.com.alura.validador;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
	public static void main(String[] args) {
		String cpf = "79026200250";
		String titulo = "282425850132";
		String cnpj = "22017991000158";

		// formatador de CPF
		CPFFormatter cpfFormatter = new CPFFormatter();
		String format = cpfFormatter.format(cpf);
		System.out.println(format);

		
		// formatador de cnpj
		CNPJFormatter cnpjFormatter = new CNPJFormatter();
		String format2 = cnpjFormatter.format(cnpj);
		System.out.println(format2);

		// formatador de Titulo 
		TituloEleitoralFormatter tituloEleitoralFormatter = new TituloEleitoralFormatter();
		System.out.println(tituloEleitoralFormatter.format(titulo));
	}
}
