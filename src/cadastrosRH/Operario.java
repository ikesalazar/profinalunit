package cadastrosRH;

public class Operario extends Empregado {
	
	private double valorProducao;
	private double comissao;
	
	public Operario() {
		super();
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public void setComissao (double comissao) {
		this.comissao = comissao;
	}
	
	
	//Metodo herdado da classe abstrata (Empregado) para calcular o salario liquido do Operario.
	//Calculo com seus atributos e atributos herdados.
	@Override
	public double getCalcularSalario() {
		return (getSalarioBase() - ((getImposto() / 100) * getSalarioBase())) + ((getComissao() / 100) * getValorProducao()); 
	}

}
