package Q2;

public class Quarto {
	private String Tipo;
	private int Numero;
	private int ValorDiaria;
		
	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
	public void setNumero(int Valor) {
		this.ValorDiaria = Valor;
	}
	public void setValorDiaria (int Documento) {
			this.ValorDiaria = Documento;
	}

	
	public int getValorDiaria () {
		return this.ValorDiaria;
	}
	public int getNumero() {
		return this.Numero;
	}
	public String getTipo () {
		return this.Tipo;
	}		
	
	
}
