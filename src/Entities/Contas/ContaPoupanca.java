package Entities.Contas;

import Entities.banco.Cliente;

public class ContaPoupanca extends Conta{
	public static final double valorTaxa = 2.50;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void taxa() {
		 saldo -= valorTaxa;	
	}

	
}
