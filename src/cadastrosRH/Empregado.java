package cadastrosRH;

public abstract class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	
	public Empregado() {
		super();
		
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//Metodo utilizado e sobrescrito por suas subclasses.
	//Utilizado para calcular o salario liquido.
	public abstract double getCalcularSalario();
}

