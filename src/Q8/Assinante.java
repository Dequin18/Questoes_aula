package Q8;

public class Assinante {
	private String Nome;
	private String Email;
	private String Plano;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setPlano(String Numero) {
		this.Plano = Numero;
	}
	public void setEmail (String Documento) {
		this.Email = Documento;
	}

	
	public String getCarga () {
		return this.Email;
	}
	public String getPlano() {
		return this.Plano;
	}
	public String getNome () {
		return this.Nome;
	}	
	
	
}