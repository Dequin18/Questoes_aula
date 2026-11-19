package Q7;

public class Departamento {
	private String Nome;
	private String Ramal;
	private String Localizacao;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setLocalizacao(String Numero) {
		this.Localizacao = Numero;
	}
	public void setRamal (String Documento) {
		this.Ramal = Documento;
	}

	
	public String getCarga () {
		return this.Ramal;
	}
	public String getLocalizacao() {
		return this.Localizacao;
	}
	public String getNome () {
		return this.Nome;
	}	
}
