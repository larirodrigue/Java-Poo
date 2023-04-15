import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
	Cliente cliente = new Cliente("Larissa", "la23" );
	Cliente cliente2 = new Cliente("Giovanni", "gi99");
	Cartao cartao = new Cartao(1234, 1080.0);
	Cartao cartao2 = new Cartao(123, 1070.0);
	Conta conta = new Conta(123, 1000.00, 350.0);
	Conta conta2 = new Conta(134, 1000.00, 250.0);
	Agencia agencia = new Agencia(12345, "Vila");
	Agencia agencia2 = new Agencia(1234, "Vila");
	
	cliente2.setConta(conta2);
	cliente.setConta(conta);
	conta.setAgencia(agencia);
	conta2.setAgencia(agencia2);
	cliente.setCartao(new ArrayList<Cartao>());
	cliente2.setCartao(new ArrayList<Cartao>());
	cliente.getCartao().add(cartao);
	cliente2.getCartao().add(cartao2);
	
	//System.out.println(conta.getSaldo());
	
	//for (Cartao i: cliente.getCartao()) {
	//	System.out.println(i.getLimite());
	//}
	System.out.println("Saldo da conta Lari: " + conta.getSaldo());
	System.out.println("Saldo da conta Gi: " + conta2.getSaldo());
	cliente.depositar(00.0);
	cliente.sacar(00.0);
	cliente.transferir(10.0, conta2);
	conta.ImprimirExtrato();
	cliente.imprimirExtrato();
	cliente2.imprimirExtrato();
  }
}
