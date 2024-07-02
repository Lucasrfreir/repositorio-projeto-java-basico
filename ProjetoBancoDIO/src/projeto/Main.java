package projeto;

public class Main {

	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Conta corrente = new ContaCorrente(lucas);
		Conta poupanca = new ContaPoupanca(lucas);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
