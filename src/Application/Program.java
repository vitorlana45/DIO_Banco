package Application;
import Entities.Contas.Conta;
import Entities.Contas.ContaCorrente;
import Entities.Contas.ContaPoupanca;
import Entities.banco.Cliente;


public class Program {

	public static void main(String[] args) {

		// valor da Taxa de Conta Corrente = 5,00
		// valor da Taxa de Conta poupanca = 2,50
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor");
		
		Conta cc = new ContaCorrente(vitor);
		cc.depositar(100);
		cc.sacar(50);
		cc.taxa();

		cc.imprimirExtrato();
		
		System.out.println("--------------------------");
		Conta poupanca = new ContaPoupanca(vitor);
		vitor.setNome("Vitor");
		poupanca.depositar(100);
		poupanca.sacar(70);
		poupanca.taxa();
		poupanca.imprimirExtrato();

		System.out.println();

		
		cc.depositar(100);								
		cc.transferir(50, poupanca); // o valor da transferencia sera 50 mas o outro saque da primeira operacao da contaCorrente foi sacado 50 + 5 reais 
		cc.taxa();							 // na ultima operacao sera transferido 50  + descontado 5 reais ficando 90 o saldo da conta.				 
		cc.imprimirExtrato();

	}
}
