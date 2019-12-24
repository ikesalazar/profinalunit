package cadastrosRH;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;

	public Administrador() {
		super();
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//Metodo herdado da classe abstrata (Empregado) para calcular o salario liquido do Administrador.
	//Calculo com seus atributos e atributos herdados.
	@Override
	public double getCalcularSalario() {
		return (getSalarioBase() - ((getImposto() / 100) * getSalarioBase())) + getAjudaDeCusto(); 
	}
}
