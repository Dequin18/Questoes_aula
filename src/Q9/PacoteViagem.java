package Q9;

public class PacoteViagem {
	private String Destino;
	private int Valor;
	private int duracao;
		
	public void setDestino(String nome) {
		this.Destino = nome;
	}
	public void setValor(int Numero) {
		this.Valor = Numero;
	}
	public void setduracao (int Documento) {
		this.duracao = Documento;
	}

	
	public int getValor () {
		return this.Valor;
	}
	public int getDuracao() {
		return this.duracao;
	}
	public String getDestino () {
		return this.Destino;
	}	
}
