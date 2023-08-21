package java_training;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente clienteA = new Cliente();
		
		clienteA.agencia = 1234;
		clienteA.contaCorrente = "0123-4";
		clienteA.cpf = "012.456.789-10";
		clienteA.saldoContaCorrente = 1000.00f;
		
		clienteA.sacarContaCorrente(500.00f);
		
		String agenciaConta = clienteA.informarAgenciaConta();
		
		System.out.print(clienteA);
		System.out.print("Agencia e conta do fulano é: " + agenciaConta);
		
		Cliente clienteB = new Cliente(); 
		clienteB.agencia = 5678;
		clienteB.contaCorrente = "5647-8";
		clienteB.cpf = "023.567.891-01";
		clienteB.saldoContaCorrente = 2000.00f;
		
		clienteB.sacarContaCorrente(1000.00f);

		String agenciaContaB = clienteB.informarAgenciaConta();
		
		System.out.print(clienteB);
		System.out.print("Agencia e conta do fulano é: " + agenciaContaB);
		
		System.out.println("Projeto - Orientação a Objetos...");
	}

}
