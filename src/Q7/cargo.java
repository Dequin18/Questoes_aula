package Q7;

public class cargo {
	private String Titulo;
	private String Descricao;
	private int Nivel;
		
	public void setTitulo(String nome) {
		this.Titulo = nome;
	}
	public void setNivel(int Numero) {
		this.Nivel = Numero;
	}
	public void setDescricao (String Documento) {
		this.Descricao = Documento;
	}

	
	public String getCarga () {
		return this.Descricao;
	}
	public int getNivel() {
		return this.Nivel;
	}
	public String getTitulo () {
		return this.Titulo;
	}	
}
