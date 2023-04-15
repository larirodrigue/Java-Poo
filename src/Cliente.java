import java.util.ArrayList;

public class Cliente {
	String nome, documento;
	ArrayList<Cartao> cartao;
	Conta conta;
	
	public Cliente(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public ArrayList<Cartao> getCartao(){
		return cartao;
	}
	public void setCartao(ArrayList<Cartao> cartao) {
		this.cartao = cartao;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public void depositar(double valor) {
		this.conta.saldo += valor;
	}
	public void sacar(double valor) {
		if (valor > this.conta.saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.conta.saldo -= valor;
		}
	}
	public void transferir(double valor, Conta destino) {
		if (valor > this.conta.saldo) {
			System.out.println("Não vai funfar");
		}
		else {
			this.conta.saldo -= valor;
			destino.saldo += valor;
		}
	}
	public void imprimirExtrato() {
		System.out.println("Nome do cliente: " + this.getNome()); 
		System.out.println("Nome do documento: " + this.getDocumento());
		for (Cartao i: this.getCartao()) {
			System.out.println("Limite do cartão: " + i.getLimite());
			System.out.println("Número do cartão: " + i.getNumero());	
		}
		System.out.println("Conta: " + this.getConta().getNumero());
		System.out.println("Limite da conta: " + this.conta.getLimite());
		System.out.println("Saldo da conta: " + this.getConta().getSaldo());
	}
	
}
