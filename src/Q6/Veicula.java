package Q6;

public class Veicula {
	private String Modelo;
	private String Marca;
	private int Valor;
		
	public void setModelo(String nome) {
		this.Modelo = nome;
	}
	public void setValor(int Numero) {
		this.Valor = Numero;
	}
	public void setMarca (String Documento) {
		this.Marca = Documento;
	}

	
	public String getCarga () {
		return this.Marca;
	}
	public int getValor() {
		return this.Valor;
	}
	public String getModelo () {
		return this.Modelo;
	}	
}
