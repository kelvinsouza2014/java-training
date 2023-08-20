package java_training;

public class Cliente {
	
	public int agencia;
	public String contaCorrente;
	public String cpf;
	public float saldoContaCorrente;
	
	public void sacarContaCorrente(float valor) {
		if(this.saldoContaCorrente >= valor) {
				this.saldoContaCorrente = this.saldoContaCorrente - valor;
		}
	}
	
}
