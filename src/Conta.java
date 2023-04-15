
public class Conta {
	long numero;
	double limite, saldo;
	Agencia agencia;
	
	public Conta(long numero, double limite, double saldo) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldo;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public void depositar(double valor) {
		saldo += valor;

	}
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Tenha mais money");
		}
		else {
			saldo -= valor;
			System.out.println("Foi sacado: " + valor);
		}
	}
	public void transferir(double valor, Conta destino) {
		if (valor > saldo) {
			System.out.println("Saldo inválido");
		}
		else {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Foi transferido:" + valor + "e o saldo está de: " + saldo);
		}
	}
	public void ImprimirExtrato() {
		System.out.println("Nome: " + this.getNumero());
		System.out.println("Limite: " + this.getLimite());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Nome da agência: " + this.agencia.getNome());
		System.out.println("Numero da agência: " + this.agencia.getNumero());
		
	}
}

