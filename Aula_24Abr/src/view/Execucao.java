package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {

		Pessoa pe = new Pessoa();
		pe.setName("Felipe Rodrigues");
		pe.setEndereco("Rua Alameda Vieira");
		pe.setBairro("Pinheiros");
		pe.setCEP(12121212);
		pe.setCidade("São Paulo");
		pe.setEstado("São Paulo");
		
		System.out.println(pe.getName());
		System.out.println(pe.getEndereco());
		System.out.println(pe.getBairro());
		System.out.println(pe.getCEP());
		System.out.println(pe.getCidade());
		System.out.println(pe.getEstado());

	}

}
