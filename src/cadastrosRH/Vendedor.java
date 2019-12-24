package cadastrosRH;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		super();
	}

	public double getValorVendas() {
		return valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//Metodo herdado da classe abstrata (Empregado) para calcular o salario liquido do Vendedor.
	//Calculo com seus atributos e atributos herdados.
	@Override
	public double getCalcularSalario() {
		return (getSalarioBase() - ((getImposto() / 100) * getSalarioBase())) + ((getComissao() / 100) * getValorVendas());
	}
	
}
