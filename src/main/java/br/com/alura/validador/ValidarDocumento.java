package br.com.alura.validador;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidarDocumento {
	public static void main(String[] args) {
		String cpf = "79026200250";
		String titulo = "282425850132";
		String cnpj = "920715908000128";

		try {

			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF valido: " + cpf);
		} catch (InvalidStateException e) {

			System.out.println("CPF Invalido: " + e);
		}

		try {
			validarDocumentos(new TituloEleitoralValidator(), titulo);
			System.out.println("Titulo valido: " + titulo);
		} catch (Exception e) {
			System.out.println("Titulo invalido: " + e);
		}

		
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ valido: " + cnpj);
		} catch (Exception e) {
			System.out.println("CNPJ invalido: " + e);
		}
	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
}
