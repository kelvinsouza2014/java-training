package java_training;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente clienteA = new Cliente();
		clienteA.agencia = 1234;
		clienteA.contaCorrente = "0123-4";
		clienteA.cpf = "012.456.789-10";
		clienteA.saldoContaCorrente = 1000.00f;
		
		System.out.print(clienteA);
		
		Cliente clienteB = new Cliente();
		clienteB.agencia = 5678;
		clienteB.contaCorrente = "5647-8";
		clienteB.cpf = "023.567.891-01";
		clienteB.saldoContaCorrente = 2000.00f;
		
		System.out.print(clienteB);
		
		System.out.println("Projeto - Orientação a Objetos...");
	}

}
