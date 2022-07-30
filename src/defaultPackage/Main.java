package defaultPackage;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");
		
		Conta cc = new ContaCorrente(carlos);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(carlos);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
