package Q6;

public class Vendendor {
	private String Nome;
	private String Marca;
	private int Valor;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setValor(int Numero) {
		this.Valor = Numero;
	}
	public void setMarca (String Documento) {
		this.Marca = Documento;
	}

	
	public String getMarca () {
		return this.Marca;
	}
	public int getValor() {
		return this.Valor;
	}
	public String getNome () {
		return this.Nome;
	}	
}
