
public abstract class Conta implements IConta {

 protected static final int AGENCIA_PADRAO = 1;
 private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double parcelas;
	protected double emprestimo;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	public void emprestimo(double valor, int mes, Conta contaDestino) {
		double juros = ((valor * 3.48) / 100);
		parcelas = (juros + valor) / mes;
		emprestimo = valor;
		contaDestino.depositar(emprestimo);
	}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular:  %s", this.cliente.getFastNome()));
		System.out.println(String.format("Valor do emprestimo:  %.2f", this.emprestimo));
		System.out.println(String.format("Parcelas mes: %.2f", this.parcelas));
		System.out.println(String.format("Agencia:  %d", this.agencia));
		System.out.println(String.format("Numero:  %d", this.numero));
		System.out.println(String.format("Saldo:  %.2f", this.saldo));
	}
}
	
