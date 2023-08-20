package java_training;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente objCliente = new Cliente();
		objCliente.agencia = 1234;
		objCliente.contaCorrente = "0123-4";
		objCliente.cpf = "012.456.789-10";
		objCliente.saldoContaCorrente = 1000.00f;
		
		System.out.print(objCliente);
		
		System.out.println("Projeto - Orientação a Objetos...");
	}

}
