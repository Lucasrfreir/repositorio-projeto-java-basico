package projeto;

public interface InterfaceConta {

	void sacar(double saldo);	
		
	void depositar(double saldo);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
