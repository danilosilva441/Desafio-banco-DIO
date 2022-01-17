
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setFastNome("Venilton");
		
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		cc.emprestimo(1365, 12, cc);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
