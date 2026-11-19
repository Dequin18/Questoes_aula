package Q4;

public class Linha {
	private String Extensao;
	private String DestinoFinal;
	private int Codigo;
		
	public void setExtensao(String nome) {
		this.Extensao = nome;
	}
	public void setCodigo(int Numero) {
		this.Codigo = Numero;
	}
	public void setDataSaida (String Documento) {
		this.DestinoFinal = Documento;
	}

	
	public String getCarga () {
		return this.DestinoFinal;
	}
	public int getCodigo() {
		return this.Codigo;
	}
	public String getExtensao () {
		return this.Extensao;
	}		

}
