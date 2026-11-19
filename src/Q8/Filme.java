package Q8;

public class Filme {
	private String Titulo;
	private String Classificacao;
	private int Duracao;
		
	public void setTitulo(String nome) {
		this.Titulo = nome;
	}
	public void setDuracao(int Numero) {
		this.Duracao = Numero;
	}
	public void setClassificacao (String Documento) {
		this.Classificacao = Documento;
	}

	
	public String getClassificacao () {
		return this.Classificacao;
	}
	public int getDuracao() {
		return this.Duracao;
	}
	public String getTitulo () {
		return this.Titulo;
	}	
}
