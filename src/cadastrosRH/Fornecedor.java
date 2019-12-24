package cadastrosRH;

public class Fornecedor extends Pessoa{
	
	public Fornecedor() {
		super();
	}

	private double valorCredito;
	private double valorDivida;
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//Calculo do metodo com seus atributos para obter o saldo do Fornecedor.
	public double getObterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
}
