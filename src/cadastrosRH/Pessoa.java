package cadastrosRH;

public class Pessoa {

	private String nome;
	private String endereço;
	private String telefone;
	
	public Pessoa() {}

	public String getNome() {
		return nome;
	}
	
	public String getEndereço() {
		return endereço;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
