package Q6;

public class Cliente {
	private String Nome;
	private String CPF;
	private String Telefone;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setTelefone(String Numero) {
		this.Telefone = Numero;
	}
	public void setDataSaida (String Documento) {
		this.CPF = Documento;
	}

	
	public String getCarga () {
		return this.CPF;
	}
	public String getTelefone() {
		return this.Telefone;
	}
	public String getNome () {
		return this.Nome;
	}	
}
