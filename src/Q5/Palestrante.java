package Q5;

public class Palestrante {

	private String Nome;
	private String AreaDeAtuacao;
	private String Titulacao;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setTitulacao(String Numero) {
		this.Titulacao = Numero;
	}
	public void setDataSaida (String Documento) {
		this.AreaDeAtuacao = Documento;
	}

	
	public String getCarga () {
		return this.AreaDeAtuacao;
	}
	public String getTitulacao() {
		return this.Titulacao;
	}
	public String getNome () {
		return this.Nome;
	}	
}
