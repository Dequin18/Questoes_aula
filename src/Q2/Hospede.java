package Q2;

public class Hospede {
	private String nome;
	private int Documento;
	private String Numero;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(String Numero) {
		this.Numero = Numero;
	}
	public void setDocumento (int Documento) {
			this.Documento = Documento;
	}

	
	public int getDocumento () {
		return this.Documento;
	}
	public String getNumero() {
		return this.Numero;
	}
	public String getNome () {
		return this.nome;
	}		
	
	
	
}
