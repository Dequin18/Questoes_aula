package Q8;

public class Serie {
	private String Titulo;
	private String Temporadas;
	private String Classificacao;
		
	public void setTitulo(String nome) {
		this.Titulo = nome;
	}
	public void setClassificacao(String Numero) {
		this.Classificacao = Numero;
	}
	public void setTemporadas (String Documento) {
		this.Temporadas = Documento;
	}

	
	public String getTemporadas () {
		return this.Temporadas;
	}
	public String getClassificacao() {
		return this.Classificacao;
	}
	public String getTitulo () {
		return this.Titulo;
	}	
}
