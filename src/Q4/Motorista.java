package Q4;

public class Motorista {
	private String Nome;
	private String CNH;
	private String Categoria;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setCategoria(String catego) {
		this.Categoria = catego;
	}
	public void setCNH (String CNH) {
		this.CNH = CNH;
	}

	
	public String getCNH () {
		return this.CNH;
	}
	public String getCategoria() {
		return this.Categoria;
	}
	public String getNome () {
		return this.Nome;
	}		
}
