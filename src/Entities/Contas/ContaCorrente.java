package Entities.Contas;

import Entities.banco.Cliente;

public class ContaCorrente extends Conta {
	
	public static final double valorTaxa = 5;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");	
		super.imprimirInfosComuns();
	}

	@Override
	public void taxa() {
		  saldo -= valorTaxa;
		
	}



	
}